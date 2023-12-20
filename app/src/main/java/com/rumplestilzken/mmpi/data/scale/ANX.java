package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class ANX extends Scale {
    @Override
    public String getDescription() {
        return "Anxiety";
    }

    @Override
    public String toString() {
        return "ANX";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("15");
        list.add("30");
        list.add("31");
        list.add("39");
        list.add("170");
        list.add("196");
        list.add("273");
        list.add("290");
        list.add("299");
        list.add("301");
        list.add("305");
        list.add("339");
        list.add("408");
        list.add("415");
        list.add("463");
        list.add("469");
        list.add("509");
        list.add("556");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("140");
        list.add("208");
        list.add("223");
        list.add("405");
        list.add("496");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("35");
        list.add("39");
        list.add("42");
        list.add("45");
        list.add("47");
        list.add("50");
        list.add("52");
        list.add("53");
        list.add("55");
        list.add("57");
        list.add("60");
        list.add("62");
        list.add("65");
        list.add("67");
        list.add("70");
        list.add("72");
        list.add("75");
        list.add("77");
        list.add("80");
        list.add("82");
        list.add("85");
        list.add("87");
        list.add("90");
        list.add("92");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("34");
        list.add("37");
        list.add("40");
        list.add("43");
        list.add("45");
        list.add("47");
        list.add("49");
        list.add("51");
        list.add("53");
        list.add("55");
        list.add("56");
        list.add("59");
        list.add("61");
        list.add("64");
        list.add("66");
        list.add("69");
        list.add("71");
        list.add("74");
        list.add("76");
        list.add("79");
        list.add("81");
        list.add("84");
        list.add("86");
        list.add("89");
        return list;
    }
}
