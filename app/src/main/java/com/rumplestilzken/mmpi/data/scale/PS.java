package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class PS extends Scale {
    @Override
    public String getDescription() {
        return "Post-traumatic Stress Disorder";
    }

    @Override
    public String toString() {
        return "PS";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("17");
        list.add("21");
        list.add("22");
        list.add("31");
        list.add("32");
        list.add("37");
        list.add("38");
        list.add("44");
        list.add("48");
        list.add("56");
        list.add("59");
        list.add("65");
        list.add("85");
        list.add("94");
        list.add("116");
        list.add("135");
        list.add("145");
        list.add("150");
        list.add("168");
        list.add("170");
        list.add("180");
        list.add("218");
        list.add("221");
        list.add("273");
        list.add("274");
        list.add("277");
        list.add("299");
        list.add("301");
        list.add("304");
        list.add("305");
        list.add("311");
        list.add("316");
        list.add("319");
        list.add("325");
        list.add("328");
        list.add("377");
        list.add("386");
        list.add("400");
        list.add("463");
        list.add("464");
        list.add("469");
        list.add("471");
        list.add("475");
        list.add("479");
        list.add("515");
        list.add("516");
        list.add("565");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("3");
        list.add("9");
        list.add("45");
        list.add("75");
        list.add("95");
        list.add("141");
        list.add("165");
        list.add("208");
        list.add("223");
        list.add("280");
        list.add("372");
        list.add("405");
        list.add("564");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("37");
        list.add("38");
        list.add("39");
        list.add("41");
        list.add("42");
        list.add("43");
        list.add("44");
        list.add("46");
        list.add("47");
        list.add("48");
        list.add("49");
        list.add("51");
        list.add("52");
        list.add("53");
        list.add("54");
        list.add("56");
        list.add("57");
        list.add("58");
        list.add("59");
        list.add("61");
        list.add("62");
        list.add("63");
        list.add("64");
        list.add("66");
        list.add("67");
        list.add("68");
        list.add("69");
        list.add("71");
        list.add("72");
        list.add("73");
        list.add("74");
        list.add("76");
        list.add("77");
        list.add("78");
        list.add("79");
        list.add("81");
        list.add("82");
        list.add("83");
        list.add("84");
        list.add("86");
        list.add("87");
        list.add("88");
        list.add("89");
        list.add("91");
        list.add("92");
        list.add("93");
        list.add("94");
        list.add("96");
        list.add("97");
        list.add("98");
        list.add("99");
        list.add("101");
        list.add("102");
        list.add("103");
        list.add("104");
        list.add("106");
        list.add("107");
        list.add("108");
        list.add("110");
        list.add("111");
        list.add("112");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("37");
        list.add("38");
        list.add("39");
        list.add("40");
        list.add("41");
        list.add("42");
        list.add("43");
        list.add("45");
        list.add("46");
        list.add("47");
        list.add("48");
        list.add("49");
        list.add("50");
        list.add("51");
        list.add("52");
        list.add("54");
        list.add("55");
        list.add("56");
        list.add("57");
        list.add("58");
        list.add("59");
        list.add("60");
        list.add("61");
        list.add("62");
        list.add("63");
        list.add("64");
        list.add("66");
        list.add("68");
        list.add("69");
        list.add("70");
        list.add("71");
        list.add("73");
        list.add("74");
        list.add("75");
        list.add("76");
        list.add("77");
        list.add("78");
        list.add("79");
        list.add("80");
        list.add("81");
        list.add("83");
        list.add("84");
        list.add("85");
        list.add("86");
        list.add("87");
        list.add("88");
        list.add("89");
        list.add("90");
        list.add("92");
        list.add("93");
        list.add("94");
        list.add("95");
        list.add("97");
        list.add("98");
        list.add("99");
        list.add("100");
        list.add("102");
        list.add("103");
        list.add("104");
        return list;
    }

}
