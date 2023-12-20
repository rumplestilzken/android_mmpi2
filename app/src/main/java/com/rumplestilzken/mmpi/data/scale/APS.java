package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class APS extends Scale {
    @Override
    public String getDescription() {
        return "Addiction Potential";
    }

    @Override
    public String toString() {
        return "APS";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("7");
        list.add("29");
        list.add("41");
        list.add("89");
        list.add("103");
        list.add("113");
        list.add("120");
        list.add("168");
        list.add("183");
        list.add("189");
        list.add("196");
        list.add("217");
        list.add("242");
        list.add("260");
        list.add("267");
        list.add("341");
        list.add("342");
        list.add("344");
        list.add("377");
        list.add("422");
        list.add("502");
        list.add("523");
        list.add("540");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("4");
        list.add("43");
        list.add("76");
        list.add("104");
        list.add("137");
        list.add("157");
        list.add("220");
        list.add("239");
        list.add("306");
        list.add("312");
        list.add("349");
        list.add("440");
        list.add("495");
        list.add("496");
        list.add("500");
        list.add("504");
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
        list.add("");
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
        list.add("41");
        list.add("44");
        list.add("46");
        list.add("49");
        list.add("52");
        list.add("54");
        list.add("57");
        list.add("60");
        list.add("63");
        list.add("65");
        list.add("68");
        list.add("71");
        list.add("73");
        list.add("76");
        list.add("79");
        list.add("82");
        list.add("84");
        list.add("87");
        list.add("90");
        list.add("92");
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
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("30");
        list.add("31");
        list.add("33");
        list.add("36");
        list.add("39");
        list.add("42");
        list.add("44");
        list.add("47");
        list.add("50");
        list.add("52");
        list.add("55");
        list.add("58");
        list.add("60");
        list.add("63");
        list.add("66");
        list.add("69");
        list.add("71");
        list.add("74");
        list.add("77");
        list.add("79");
        list.add("82");
        list.add("85");
        list.add("87");
        list.add("90");
        list.add("93");
        return list;
    }
}
