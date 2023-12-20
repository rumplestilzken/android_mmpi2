package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Pt extends Scale {
    @Override
    public String getDescription() {
        return "Psychathenia";
    }

    @Override
    public String toString() {
        return "Pt";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("11");
        list.add("16");
        list.add("23");
        list.add("31");
        list.add("38");
        list.add("56");
        list.add("65");
        list.add("73");
        list.add("82");
        list.add("89");
        list.add("94");
        list.add("130");
        list.add("147");
        list.add("170");
        list.add("175");
        list.add("196");
        list.add("218");
        list.add("242");
        list.add("273");
        list.add("275");
        list.add("277");
        list.add("285");
        list.add("289");
        list.add("301");
        list.add("302");
        list.add("304");
        list.add("308");
        list.add("309");
        list.add("310");
        list.add("313");
        list.add("316");
        list.add("317");
        list.add("320");
        list.add("325");
        list.add("326");
        list.add("327");
        list.add("328");
        list.add("329");
        list.add("331");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("3");
        list.add("9");
        list.add("33");
        list.add("109");
        list.add("140");
        list.add("165");
        list.add("174");
        list.add("293");
        list.add("321");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("1.0");
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
        list.add("");
        list.add("");
        list.add("");
        list.add("30");
        list.add("31");
        list.add("32");
        list.add("33");
        list.add("34");
        list.add("36");
        list.add("37");
        list.add("39");
        list.add("41");
        list.add("43");
        list.add("44");
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
        list.add("74");
        list.add("77");
        list.add("79");
        list.add("81");
        list.add("93");
        list.add("85");
        list.add("87");
        list.add("89");
        list.add("91");
        list.add("94");
        list.add("96");
        list.add("98");
        list.add("100");
        list.add("102");
        list.add("104");
        list.add("106");
        list.add("109");
        list.add("111");
        list.add("113");
        list.add("115");
        list.add("117");
        list.add("119");
        list.add("120");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("1.0");
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
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("30");
        list.add("31");
        list.add("32");
        list.add("33");
        list.add("35");
        list.add("37");
        list.add("38");
        list.add("40");
        list.add("42");
        list.add("44");
        list.add("47");
        list.add("49");
        list.add("51");
        list.add("53");
        list.add("55");
        list.add("57");
        list.add("59");
        list.add("61");
        list.add("62");
        list.add("64");
        list.add("66");
        list.add("68");
        list.add("70");
        list.add("72");
        list.add("73");
        list.add("75");
        list.add("77");
        list.add("79");
        list.add("81");
        list.add("83");
        list.add("84");
        list.add("86");
        list.add("88");
        list.add("90");
        list.add("92");
        list.add("94");
        list.add("95");
        list.add("97");
        list.add("99");
        list.add("101");
        list.add("103");
        list.add("105");
        list.add("106");
        list.add("108");
        list.add("110");
        list.add("112");
        list.add("114");
        list.add("116");
        list.add("117");
        list.add("119");
        list.add("120");
        return list;
    }

}
