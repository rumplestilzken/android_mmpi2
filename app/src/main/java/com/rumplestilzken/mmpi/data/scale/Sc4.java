package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Sc4 extends Scale {
    @Override
    public String getDescription() {
        return "Lack of Ego Mastery, Conative";
    }

    @Override
    public String toString() {
        return "Sc4";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("31");
        list.add("38");
        list.add("48");
        list.add("65");
        list.add("92");
        list.add("233");
        list.add("234");
        list.add("273");
        list.add("299");
        list.add("303");
        list.add("325");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("9");
        list.add("210");
        list.add("290");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("39");
        list.add("44");
        list.add("49");
        list.add("55");
        list.add("60");
        list.add("65");
        list.add("71");
        list.add("76");
        list.add("82");
        list.add("87");
        list.add("92");
        list.add("98");
        list.add("103");
        list.add("109");
        list.add("114");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("39");
        list.add("44");
        list.add("49");
        list.add("54");
        list.add("59");
        list.add("65");
        list.add("40");
        list.add("75");
        list.add("80");
        list.add("85");
        list.add("90");
        list.add("95");
        list.add("100");
        list.add("106");
        list.add("111");
        return list;
    }
}
