package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Sc3 extends Scale {
    @Override
    public String getDescription() {
        return "Lack of Ego  Mastery, Cognition";
    }

    @Override
    public String toString() {
        return "Sc3";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("31");
        list.add("32");
        list.add("147");
        list.add("170");
        list.add("180");
        list.add("299");
        list.add("311");
        list.add("316");
        list.add("325");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("165");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("42");
        list.add("48");
        list.add("54");
        list.add("60");
        list.add("66");
        list.add("72");
        list.add("78");
        list.add("84");
        list.add("90");
        list.add("96");
        list.add("103");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("43");
        list.add("49");
        list.add("55");
        list.add("61");
        list.add("67");
        list.add("74");
        list.add("80");
        list.add("86");
        list.add("92");
        list.add("98");
        list.add("104");
        return list;
    }
}
