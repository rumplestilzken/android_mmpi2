package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Ma2 extends Scale {
    @Override
    public String getDescription() {
        return "Psychomotor Acceleration";
    }

    @Override
    public String toString() {
        return "Ma2";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("15");
        list.add("85");
        list.add("87");
        list.add("122");
        list.add("169");
        list.add("206");
        list.add("218");
        list.add("242");
        list.add("244");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("100");
        list.add("106");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("");
        list.add("30");
        list.add("34");
        list.add("39");
        list.add("44");
        list.add("49");
        list.add("53");
        list.add("58");
        list.add("63");
        list.add("68");
        list.add("73");
        list.add("78");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("");
        list.add("30");
        list.add("35");
        list.add("40");
        list.add("45");
        list.add("50");
        list.add("55");
        list.add("60");
        list.add("65");
        list.add("70");
        list.add("75");
        list.add("80");
        return list;
    }


}
