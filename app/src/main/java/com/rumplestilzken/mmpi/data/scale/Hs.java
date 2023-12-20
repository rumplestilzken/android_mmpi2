package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Hs extends Scale {
    @Override
    public String getDescription() {
        return "Hypochondriasis";
    }

    @Override
    public String toString() {
        return "Hs";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("18");
        list.add("28");
        list.add("39");
        list.add("53");
        list.add("59");
        list.add("97");
        list.add("101");
        list.add("111");
        list.add("149");
        list.add("175");
        list.add("247");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("2");
        list.add("3");
        list.add("8");
        list.add("10");
        list.add("20");
        list.add("45");
        list.add("47");
        list.add("57");
        list.add("91");
        list.add("117");
        list.add("141");
        list.add("143");
        list.add("152");
        list.add("164");
        list.add("173");
        list.add("176");
        list.add("179");
        list.add("208");
        list.add("224");
        list.add("249");
        list.add("255");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("0.5");
        list.add("");
        list.add("");
        list.add("30");
        list.add("31");
        list.add("31");
        list.add("32");
        list.add("33");
        list.add("35");
        list.add("37");
        list.add("39");
        list.add("42");
        list.add("45");
        list.add("48");
        list.add("51");
        list.add("54");
        list.add("57");
        list.add("59");
        list.add("62");
        list.add("64");
        list.add("66");
        list.add("68");
        list.add("70");
        list.add("73");
        list.add("75");
        list.add("77");
        list.add("79");
        list.add("81");
        list.add("84");
        list.add("86");
        list.add("88");
        list.add("90");
        list.add("92");
        list.add("94");
        list.add("97");
        list.add("99");
        list.add("101");
        list.add("103");
        list.add("105");
        list.add("108");
        list.add("110");
        list.add("112");
        list.add("114");
        list.add("116");
        list.add("119");
        list.add("120");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("0.5");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("30");
        list.add("33");
        list.add("35");
        list.add("38");
        list.add("40");
        list.add("43");
        list.add("46");
        list.add("49");
        list.add("51");
        list.add("54");
        list.add("56");
        list.add("59");
        list.add("61");
        list.add("63");
        list.add("65");
        list.add("67");
        list.add("69");
        list.add("71");
        list.add("73");
        list.add("76");
        list.add("78");
        list.add("80");
        list.add("82");
        list.add("84");
        list.add("86");
        list.add("88");
        list.add("90");
        list.add("92");
        list.add("94");
        list.add("97");
        list.add("99");
        list.add("101");
        list.add("103");
        list.add("105");
        list.add("107");
        list.add("109");
        list.add("111");
        list.add("113");
        list.add("115");
        list.add("117");
        list.add("120");
        return list;
    }
}
