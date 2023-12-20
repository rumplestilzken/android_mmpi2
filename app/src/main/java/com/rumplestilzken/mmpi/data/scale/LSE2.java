package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class LSE2 extends Scale {
    @Override
    public String getDescription() {
        return "Submissiveness";
    }

    @Override
    public String toString() {
        return "LSE2";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("70");
        list.add("369");
        list.add("421");
        list.add("457");
        list.add("503");
        list.add("519");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("41");
        list.add("48");
        list.add("55");
        list.add("62");
        list.add("69");
        list.add("76");
        list.add("83");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("39");
        list.add("45");
        list.add("51");
        list.add("57");
        list.add("63");
        list.add("69");
        list.add("75");
        return list;
    }

}
