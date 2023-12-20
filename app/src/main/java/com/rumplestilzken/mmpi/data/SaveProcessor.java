package com.rumplestilzken.mmpi.data;

import com.rumplestilzken.mmpi.data.QuestionData;

import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class SaveProcessor {
    public static void saveQuestionData() {
        //TODO: Get Answers
        //TODO: Get Path
    }

    public static void saveQuestionData(List<QuestionData.QuestionAnswerData> answers, String path) {
//        System.out.println("Save Question Data");
//        ResultProcessor rp = new ResultProcessor();
//        JSONObject answerObject = rp.getJSONFromAnswers(answers);
//        FileOutputStream os = null;
//        try {
//            os = new FileOutputStream(path);
//            os.write(answerObject.toString().getBytes(StandardCharsets.UTF_8));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    public static void saveResults() {
        System.out.println("Save Results");
    }
}
