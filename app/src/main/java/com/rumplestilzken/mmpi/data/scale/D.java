package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class D extends Scale {
    @Override
    public String getDescription() {
        return "Depression";
    }

    @Override
    public String toString() {
        return "D";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("5");
        list.add("15");
        list.add("18");
        list.add("31");
        list.add("38");
        list.add("39");
        list.add("46");
        list.add("56");
        list.add("73");
        list.add("92");
        list.add("117");
        list.add("127");
        list.add("130");
        list.add("146");
        list.add("147");
        list.add("170");
        list.add("175");
        list.add("181");
        list.add("215");
        list.add("233");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("2");
        list.add("9");
        list.add("10");
        list.add("20");
        list.add("29");
        list.add("33");
        list.add("37");
        list.add("43");
        list.add("45");
        list.add("49");
        list.add("55");
        list.add("68");
        list.add("75");
        list.add("76");
        list.add("95");
        list.add("109");
        list.add("118");
        list.add("134");
        list.add("140");
        list.add("141");
        list.add("142");
        list.add("143");
        list.add("148");
        list.add("165");
        list.add("178");
        list.add("188");
        list.add("189");
        list.add("212");
        list.add("221");
        list.add("223");
        list.add("226");
        list.add("238");
        list.add("245");
        list.add("248");
        list.add("260");
        list.add("267");
        list.add("330");
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
        list.add("");
        list.add("");
        list.add("");
        list.add("30");
        list.add("32");
        list.add("34");
        list.add("36");
        list.add("38");
        list.add("40");
        list.add("42");
        list.add("45");
        list.add("47");
        list.add("50");
        list.add("52");
        list.add("54");
        list.add("57");
        list.add("59");
        list.add("61");
        list.add("62");
        list.add("64");
        list.add("66");
        list.add("68");
        list.add("70");
        list.add("72");
        list.add("74");
        list.add("76");
        list.add("78");
        list.add("80");
        list.add("81");
        list.add("83");
        list.add("85");
        list.add("87");
        list.add("89");
        list.add("91");
        list.add("93");
        list.add("95");
        list.add("97");
        list.add("98");
        list.add("100");
        list.add("102");
        list.add("104");
        list.add("106");
        list.add("108");
        list.add("110");
        list.add("112");
        list.add("114");
        list.add("115");
        list.add("117");
        list.add("119");
        list.add("120");
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
        list.add("");
        list.add("");
        list.add("");
        list.add("30");
        list.add("32");
        list.add("34");
        list.add("36");
        list.add("38");
        list.add("40");
        list.add("42");
        list.add("44");
        list.add("46");
        list.add("47");
        list.add("49");
        list.add("51");
        list.add("53");
        list.add("55");
        list.add("57");
        list.add("59");
        list.add("62");
        list.add("64");
        list.add("66");
        list.add("68");
        list.add("70");
        list.add("72");
        list.add("75");
        list.add("77");
        list.add("79");
        list.add("81");
        list.add("83");
        list.add("86");
        list.add("88");
        list.add("90");
        list.add("92");
        list.add("94");
        list.add("96");
        list.add("99");
        list.add("101");
        list.add("103");
        list.add("105");
        list.add("107");
        list.add("109");
        list.add("112");
        list.add("114");
        list.add("116");
        list.add("118");
        list.add("120");
        return list;
    }
}