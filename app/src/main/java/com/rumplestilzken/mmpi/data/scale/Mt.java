package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Mt extends Scale {
    @Override
    public String getDescription() {
        return "College Maladjustment";
    }

    @Override
    public String toString() {
        return "Mt";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("15");
        list.add("16");
        list.add("28");
        list.add("31");
        list.add("38");
        list.add("71");
        list.add("73");
        list.add("81");
        list.add("82");
        list.add("110");
        list.add("130");
        list.add("215");
        list.add("218");
        list.add("233");
        list.add("269");
        list.add("273");
        list.add("299");
        list.add("302");
        list.add("325");
        list.add("331");
        list.add("339");
        list.add("357");
        list.add("408");
        list.add("411");
        list.add("449");
        list.add("464");
        list.add("469");
        list.add("472");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("2");
        list.add("3");
        list.add("9");
        list.add("10");
        list.add("20");
        list.add("43");
        list.add("95");
        list.add("131");
        list.add("140");
        list.add("148");
        list.add("152");
        list.add("223");
        list.add("405");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("32");
        list.add("34");
        list.add("36");
        list.add("37");
        list.add("39");
        list.add("40");
        list.add("42");
        list.add("43");
        list.add("45");
        list.add("46");
        list.add("48");
        list.add("50");
        list.add("51");
        list.add("53");
        list.add("54");
        list.add("56");
        list.add("57");
        list.add("59");
        list.add("60");
        list.add("62");
        list.add("64");
        list.add("65");
        list.add("67");
        list.add("68");
        list.add("70");
        list.add("71");
        list.add("73");
        list.add("74");
        list.add("76");
        list.add("77");
        list.add("79");
        list.add("81");
        list.add("82");
        list.add("84");
        list.add("85");
        list.add("87");
        list.add("88");
        list.add("30");
        list.add("31");
        list.add("93");
        list.add("95");
        list.add("96");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("32");
        list.add("34");
        list.add("35");
        list.add("37");
        list.add("38");
        list.add("40");
        list.add("41");
        list.add("42");
        list.add("44");
        list.add("45");
        list.add("47");
        list.add("48");
        list.add("50");
        list.add("51");
        list.add("52");
        list.add("54");
        list.add("55");
        list.add("57");
        list.add("58");
        list.add("60");
        list.add("61");
        list.add("62");
        list.add("64");
        list.add("65");
        list.add("67");
        list.add("68");
        list.add("70");
        list.add("71");
        list.add("72");
        list.add("74");
        list.add("75");
        list.add("77");
        list.add("78");
        list.add("80");
        list.add("81");
        list.add("82");
        list.add("84");
        list.add("85");
        list.add("87");
        list.add("88");
        list.add("90");
        list.add("91");
        return list;
    }

}
