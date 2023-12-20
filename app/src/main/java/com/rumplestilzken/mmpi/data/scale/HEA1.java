package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class HEA1 extends Scale {
    @Override
    public String getDescription() {
        return "Gastrointestinal Symptoms";
    }

    @Override
    public String toString() {
        return "HEA1";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("18");
        list.add("59");
        list.add("111");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("20");
        list.add("47");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("44");
        list.add("57");
        list.add("70");
        list.add("83");
        list.add("96");
        list.add("109");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("43");
        list.add("54");
        list.add("64");
        list.add("75");
        list.add("86");
        list.add("97");
        return list;
    }

}
