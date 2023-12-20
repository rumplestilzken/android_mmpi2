package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class DEP extends Scale {
    @Override
    public String getDescription() {
        return "Depression";
    }

    @Override
    public String toString() {
        return "DEP";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("38");
        list.add("52");
        list.add("56");
        list.add("65");
        list.add("71");
        list.add("82");
        list.add("92");
        list.add("130");
        list.add("146");
        list.add("215");
        list.add("234");
        list.add("246");
        list.add("277");
        list.add("303");
        list.add("306");
        list.add("331");
        list.add("377");
        list.add("399");
        list.add("400");
        list.add("411");
        list.add("454");
        list.add("506");
        list.add("512");
        list.add("516");
        list.add("520");
        list.add("539");
        list.add("546");
        list.add("554");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("3");
        list.add("9");
        list.add("75");
        list.add("95");
        list.add("388");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("36");
        list.add("41");
        list.add("45");
        list.add("48");
        list.add("51");
        list.add("53");
        list.add("55");
        list.add("56");
        list.add("58");
        list.add("59");
        list.add("61");
        list.add("63");
        list.add("65");
        list.add("66");
        list.add("68");
        list.add("70");
        list.add("71");
        list.add("73");
        list.add("75");
        list.add("77");
        list.add("78");
        list.add("80");
        list.add("82");
        list.add("83");
        list.add("85");
        list.add("87");
        list.add("88");
        list.add("90");
        list.add("92");
        list.add("94");
        list.add("95");
        list.add("97");
        list.add("99");
        list.add("100");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("34");
        list.add("39");
        list.add("42");
        list.add("45");
        list.add("48");
        list.add("50");
        list.add("52");
        list.add("54");
        list.add("55");
        list.add("57");
        list.add("58");
        list.add("60");
        list.add("62");
        list.add("63");
        list.add("65");
        list.add("67");
        list.add("68");
        list.add("70");
        list.add("72");
        list.add("73");
        list.add("75");
        list.add("77");
        list.add("78");
        list.add("80");
        list.add("82");
        list.add("83");
        list.add("85");
        list.add("87");
        list.add("88");
        list.add("90");
        list.add("92");
        list.add("93");
        list.add("95");
        list.add("97");
        return list;
    }
}
