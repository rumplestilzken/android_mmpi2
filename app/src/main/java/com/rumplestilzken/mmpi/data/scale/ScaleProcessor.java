package data.scale;

import com.rumplestilzken.mmpi.data.QuestionData;
import com.rumplestilzken.mmpi.data.scale.CriticalScale;
import com.rumplestilzken.mmpi.data.scale.False;
import com.rumplestilzken.mmpi.data.scale.K;
import com.rumplestilzken.mmpi.data.scale.QuestionScale;
import com.rumplestilzken.mmpi.data.scale.RINPair;
import com.rumplestilzken.mmpi.data.scale.Scale;
import com.rumplestilzken.mmpi.data.scale.TRIN;
import com.rumplestilzken.mmpi.data.scale.True;
import com.rumplestilzken.mmpi.data.scale.VRIN;

import java.util.*;
import java.util.function.Consumer;

import static java.util.stream.Collectors.toList;

public class ScaleProcessor {

    Map<Integer, Boolean> answerMap = new HashMap<>();
    String[] ignoreList = { "True", "False", "?" };

    public double process(List<QuestionData.QuestionAnswerData> answers, List<Scale> scaleList, List<CriticalScale> criticalScales, boolean isMale) {
        answers.forEach(i -> answerMap.put(i.getIndex(), i.getAnswer()));

        for(int i = 0; i < scaleList.size(); i++) {
            scaleList.get(i).setIndex(i);
        }

        processBooleanScale(True.class, Boolean.TRUE, answers, scaleList);
        processBooleanScale(False.class, Boolean.FALSE, answers, scaleList);
        processBooleanScale(QuestionScale.class, null, answers, scaleList);
        processRIN(VRIN.class, VRIN.getVRINPairs(), answers, scaleList);
        processRIN(TRIN.class, TRIN.getTRINPairs(), answers, scaleList);

        scaleList.stream().filter(i -> !List.of(ignoreList).contains(i.toString())).forEach(i -> processRawScore(i.getClass(), answers, scaleList));

        processTScores(answers, scaleList, isMale);

        processCritical(answers, criticalScales);

        String[] peScalesArray = new String[] {"Hs", "D", "Hy", "Pd", "Pa", "Pt", "Sc", "Ma"};
        List<String> peScalesList = List.of(peScalesArray);

        double peScale = 0;
        List<Scale> peScales = scaleList.stream().filter(i -> peScalesList.contains(i.toString())).collect(toList());
        for (Scale currentScale : peScales) {
            double tmp = 0;
            try {
                tmp = Double.parseDouble(currentScale.gettScore().isEmpty() ? "0" : currentScale.gettScore());;
            }
            catch (Exception e)
            {
                //TODO:
            }
            peScale += tmp;
        }
        return peScale/8;
    }

    public void processCritical(List<QuestionData.QuestionAnswerData> answers, List<CriticalScale> criticalScales) {
        criticalScales.forEach(currentScale -> {
            List<String> trueValues = currentScale.getTrueQuestions().stream().filter(currentQuestion -> answerMap.get(Integer.parseInt(currentQuestion)) == Boolean.TRUE).collect(toList());
            List<String> falseValues = currentScale.getFalseQuestions().stream().filter(currentQuestion -> answerMap.get(Integer.parseInt(currentQuestion)) == Boolean.FALSE).collect(toList());
            boolean t = trueValues.stream().count() > 0;
            boolean f =  falseValues.stream().count() > 0;
            if(t || f) {
                currentScale.getTrueValues().addAll(trueValues);
                currentScale.getFalseValues().addAll(falseValues);
                currentScale.setVisible(true);
            }
        });
    }

    private String getTScore(K k, List<String> tScale, Scale currentScale)
    {
        //No T Scale
        if(tScale.isEmpty())
        {
            return "undefined";
        }

        //RIN
        if(currentScale instanceof VRIN || currentScale instanceof TRIN)
        {
            return tScale.get(Math.toIntExact(currentScale.getRawScore()));
        }

        //Normal, non-corrected T Scale Value
        if(tScale.get(0).equals(""))
        {
            if(tScale.get((int)currentScale.getRawScore()+1).isEmpty())
            {
                return "undefined";
            }
            return tScale.get(Math.toIntExact(currentScale.getRawScore() + 1));
        }

        //Corrected T Scale Value
        long kValue = k.getRawScore();
        double kScore = kValue*Double.parseDouble(tScale.get(0))+currentScale.getRawScore();
        double actualKScore = Math.floor(kScore+.5);
        String tScoreValue = tScale.get((int)actualKScore + 1);
        if(tScoreValue.isEmpty()) {
            return "undefined";
        }
        int tScore = Integer.parseInt(tScoreValue);

        currentScale.setkScore((long)actualKScore);

        return Integer.toString(tScore);
    }

    private void processTScores(List<QuestionData.QuestionAnswerData> answers, List<Scale> scaleList, boolean isMale) {
        K kScale = (K) scaleList.stream().filter(i -> i instanceof K).findFirst().get();

        //No Answers
        if(answers.stream().noneMatch(i -> i.getAnswer() == Boolean.TRUE || i.getAnswer() == Boolean.FALSE))
        {
            return;
        }

        scaleList.forEach(currentScale -> {
            currentScale.settScore(getTScore(kScale, isMale ? currentScale.getMaleTScale() : currentScale.getFemaleTScale(), currentScale));
        });
    }

    private void processRawScore(Class clazz, List<QuestionData.QuestionAnswerData> answers, List<Scale> scaleList) {
        Scale currentScale = (Scale) scaleList.stream().filter(clazz::isInstance).findFirst().get();
        for (String currentIndex: currentScale.getTrueQuestions()) {
            Boolean bool = answerMap.get(Integer.parseInt(currentIndex));
            if(bool != null && bool) {
                currentScale.incrementRawScore();
            }
        }
        for (String currentIndex: currentScale.getFalseQuestions()) {
            Boolean bool = answerMap.get(Integer.parseInt(currentIndex));
            if(bool != null && !bool) {
                currentScale.incrementRawScore();
            }
        }
    }

    private void processRIN(Class clazz, List<RINPair> rinPairs, List<QuestionData.QuestionAnswerData> answers, List<Scale> scaleList) {
        Scale rin = scaleList.stream().filter(clazz::isInstance).findFirst().get();
        long baseScore = rin.getRawScore();
        for (RINPair currentPair: rinPairs) {
            Optional<QuestionData.QuestionAnswerData> q1O = answers.stream().filter(i -> i.getIndex() == currentPair.getIndex1()).findFirst();
            Optional<QuestionData.QuestionAnswerData> q2O = answers.stream().filter(i -> i.getIndex() == currentPair.getIndex2()).findFirst();
            if(!q1O.isPresent() || !q2O.isPresent())
            {
                continue;
            }

            QuestionData.QuestionAnswerData q1a = q1O.get();
            QuestionData.QuestionAnswerData q2a = q2O.get();
            if(q1a.getAnswer() == null || q2a.getAnswer() == null)
            {
                continue;
            }

//            System.out.println("Index1:" + currentPair.index1 + ",Answer1:" + answer1 + ",Index2:" + currentPair.getIndex2() + ",Answer2:" + answer2);
            if(q1a.getAnswer() == currentPair.isBool1() && q2a.getAnswer() == currentPair.isBool2())
            {
                baseScore += currentPair.getValue();
            }
        }
        rin.setRawScore(baseScore);
    }

    private void processBooleanScale(Class clazz, Boolean bool, List<QuestionData.QuestionAnswerData> answers, List<Scale> scaleList) {
        scaleList.stream().filter(clazz::isInstance).findFirst().get().setRawScore(answers.stream().filter(i -> i.getAnswer() == bool).count());
    }
}
