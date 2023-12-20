package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class D_S extends Scale {
    @Override
    public String getDescription() {
        return "Depression, Subtle";
    }

    @Override
    public String toString() {
        return "D-S";
    }
    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("5");
        list.add("117");
        list.add("282");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("29");
        list.add("37");
        list.add("55");
        list.add("68");
        list.add("76");
        list.add("134");
        list.add("143");
        list.add("148");
        list.add("178");
        list.add("189");
        list.add("212");
        list.add("221");
        list.add("226");
        list.add("238");
        list.add("267");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("32");
        list.add("36");
        list.add("40");
        list.add("44");
        list.add("48");
        list.add("52");
        list.add("55");
        list.add("59");
        list.add("63");
        list.add("67");
        list.add("71");
        list.add("75");
        list.add("78");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("32");
        list.add("36");
        list.add("40");
        list.add("44");
        list.add("48");
        list.add("53");
        list.add("57");
        list.add("61");
        list.add("65");
        list.add("69");
        list.add("73");
        list.add("77");
        return list;
    }

}
