package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class D4 extends Scale {
    @Override
    public String getDescription() {
        return "Mental Dullness";
    }

    @Override
    public String toString() {
        return "D4";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("15");
        list.add("31");
        list.add("38");
        list.add("73");
        list.add("92");
        list.add("147");
        list.add("170");
        list.add("233");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("9");
        list.add("10");
        list.add("43");
        list.add("75");
        list.add("109");
        list.add("165");
        list.add("188");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("38");
        list.add("43");
        list.add("48");
        list.add("53");
        list.add("58");
        list.add("62");
        list.add("67");
        list.add("72");
        list.add("77");
        list.add("82");
        list.add("86");
        list.add("91");
        list.add("96");
        list.add("101");
        list.add("105");
        list.add("110");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("38");
        list.add("43");
        list.add("48");
        list.add("52");
        list.add("57");
        list.add("61");
        list.add("66");
        list.add("70");
        list.add("75");
        list.add("79");
        list.add("84");
        list.add("88");
        list.add("93");
        list.add("97");
        list.add("102");
        list.add("106");
        return list;
    }
}
