package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class hpm extends Scale {
    @Override
    public String getDescription() {
        return "Hypomanic Activation";
    }

    @Override
    public String toString() {
        return "hpm";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("27");
        list.add("50");
        list.add("55");
        list.add("86");
        list.add("122");
        list.add("134");
        list.add("153");
        list.add("169");
        list.add("189");
        list.add("209");
        list.add("212");
        list.add("213");
        list.add("226");
        list.add("242");
        list.add("250");
        list.add("267");
        list.add("304");
        list.add("324");
        list.add("345");
        list.add("346");
        list.add("366");
        list.add("389");
        list.add("393");
        list.add("406");
        list.add("414");
        list.add("423");
        list.add("542");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("100");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("30");
        list.add("30");
        list.add("31");
        list.add("33");
        list.add("36");
        list.add("38");
        list.add("39");
        list.add("41");
        list.add("42");
        list.add("44");
        list.add("45");
        list.add("47");
        list.add("48");
        list.add("50");
        list.add("51");
        list.add("53");
        list.add("56");
        list.add("58");
        list.add("61");
        list.add("64");
        list.add("67");
        list.add("70");
        list.add("73");
        list.add("76");
        list.add("79");
        list.add("82");
        list.add("85");
        list.add("88");
        list.add("91");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("30");
        list.add("30");
        list.add("32");
        list.add("34");
        list.add("37");
        list.add("38");
        list.add("40");
        list.add("42");
        list.add("44");
        list.add("46");
        list.add("48");
        list.add("49");
        list.add("51");
        list.add("53");
        list.add("56");
        list.add("58");
        list.add("61");
        list.add("64");
        list.add("66");
        list.add("69");
        list.add("72");
        list.add("74");
        list.add("77");
        list.add("80");
        list.add("83");
        list.add("85");
        list.add("88");
        list.add("91");
        list.add("94");
        return list;
    }

}
