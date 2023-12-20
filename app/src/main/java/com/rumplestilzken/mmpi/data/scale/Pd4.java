package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Pd4 extends Scale {
    @Override
    public String getDescription() {
        return "Social Alienation";
    }

    @Override
    public String toString() {
        return "Pd4";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("17");
        list.add("22");
        list.add("42");
        list.add("56");
        list.add("82");
        list.add("99");
        list.add("113");
        list.add("219");
        list.add("225");
        list.add("259");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("12");
        list.add("129");
        list.add("157");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("30");
        list.add("36");
        list.add("41");
        list.add("46");
        list.add("51");
        list.add("57");
        list.add("62");
        list.add("67");
        list.add("73");
        list.add("78");
        list.add("83");
        list.add("88");
        list.add("94");
        list.add("99");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("30");
        list.add("33");
        list.add("38");
        list.add("44");
        list.add("49");
        list.add("54");
        list.add("60");
        list.add("65");
        list.add("70");
        list.add("75");
        list.add("81");
        list.add("86");
        list.add("91");
        list.add("97");
        return list;
    }
}
