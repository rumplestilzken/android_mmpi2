package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class AGGR extends Scale {
    @Override
    public String getDescription() {
        return "Aggressiveness";
    }

    @Override
    public String toString() {
        return "AGGR";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("27");
        list.add("50");
        list.add("85");
        list.add("134");
        list.add("239");
        list.add("323");
        list.add("324");
        list.add("346");
        list.add("350");
        list.add("358");
        list.add("414");
        list.add("423");
        list.add("452");
        list.add("521");
        list.add("548");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("70");
        list.add("446");
        list.add("503");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("");
        list.add("30");
        list.add("33");
        list.add("36");
        list.add("38");
        list.add("40");
        list.add("43");
        list.add("45");
        list.add("48");
        list.add("51");
        list.add("54");
        list.add("59");
        list.add("64");
        list.add("69");
        list.add("74");
        list.add("79");
        list.add("84");
        list.add("89");
        list.add("94");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("30");
        list.add("32");
        list.add("35");
        list.add("38");
        list.add("41");
        list.add("44");
        list.add("46");
        list.add("49");
        list.add("53");
        list.add("57");
        list.add("61");
        list.add("66");
        list.add("71");
        list.add("76");
        list.add("81");
        list.add("86");
        list.add("91");
        list.add("96");
        list.add("101");
        return list;
    }

}
