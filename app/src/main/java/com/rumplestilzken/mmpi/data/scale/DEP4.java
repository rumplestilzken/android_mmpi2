package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class DEP4 extends Scale {
    @Override
    public String getDescription() {
        return "Suicidal Ideation";
    }

    @Override
    public String toString() {
        return "DEP4";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("303");
        list.add("454");
        list.add("506");
        list.add("520");
        list.add("546");
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
        list.add("45");
        list.add("62");
        list.add("79");
        list.add("95");
        list.add("112");
        list.add("120");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("45");
        list.add("61");
        list.add("77");
        list.add("93");
        list.add("109");
        list.add("120");
        return list;
    }

}
