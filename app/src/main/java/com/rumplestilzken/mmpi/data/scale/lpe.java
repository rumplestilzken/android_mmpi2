package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class lpe extends Scale {
    @Override
    public String getDescription() {
        return "Low Positive Emotions";
    }

    @Override
    public String toString() {
        return "lpe";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("9");
        list.add("10");
        list.add("49");
        list.add("61");
        list.add("75");
        list.add("109");
        list.add("148");
        list.add("188");
        list.add("206");
        list.add("239");
        list.add("244");
        list.add("280");
        list.add("318");
        list.add("330");
        list.add("494");
        list.add("521");
        list.add("552");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("34");
        list.add("39");
        list.add("43");
        list.add("46");
        list.add("50");
        list.add("53");
        list.add("57");
        list.add("60");
        list.add("64");
        list.add("68");
        list.add("72");
        list.add("75");
        list.add("79");
        list.add("83");
        list.add("86");
        list.add("90");
        list.add("94");
        list.add("97");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("33");
        list.add("38");
        list.add("42");
        list.add("46");
        list.add("50");
        list.add("54");
        list.add("58");
        list.add("62");
        list.add("66");
        list.add("70");
        list.add("74");
        list.add("79");
        list.add("83");
        list.add("87");
        list.add("91");
        list.add("95");
        list.add("99");
        list.add("100");
        return list;
    }

}
