package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class INTR extends Scale {
    @Override
    public String getDescription() {
        return "Introversion / Low positiv Emotionality";
    }

    @Override
    public String toString() {
        return "INTR";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("38");
        list.add("56");
        list.add("233");
        list.add("515");
        list.add("517");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("9");
        list.add("49");
        list.add("61");
        list.add("75");
        list.add("78");
        list.add("86");
        list.add("95");
        list.add("109");
        list.add("131");
        list.add("174");
        list.add("188");
        list.add("189");
        list.add("207");
        list.add("226");
        list.add("231");
        list.add("244");
        list.add("267");
        list.add("318");
        list.add("330");
        list.add("340");
        list.add("342");
        list.add("343");
        list.add("353");
        list.add("356");
        list.add("359");
        list.add("370");
        list.add("460");
        list.add("531");
        list.add("534");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("");
        list.add("30");
        list.add("31");
        list.add("33");
        list.add("35");
        list.add("37");
        list.add("39");
        list.add("41");
        list.add("43");
        list.add("45");
        list.add("48");
        list.add("50");
        list.add("52");
        list.add("54");
        list.add("56");
        list.add("59");
        list.add("61");
        list.add("64");
        list.add("66");
        list.add("68");
        list.add("71");
        list.add("73");
        list.add("76");
        list.add("78");
        list.add("80");
        list.add("83");
        list.add("85");
        list.add("88");
        list.add("90");
        list.add("92");
        list.add("95");
        list.add("97");
        list.add("100");
        list.add("102");
        list.add("105");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("");
        list.add("");
        list.add("30");
        list.add("32");
        list.add("34");
        list.add("37");
        list.add("39");
        list.add("42");
        list.add("44");
        list.add("46");
        list.add("48");
        list.add("50");
        list.add("53");
        list.add("55");
        list.add("57");
        list.add("60");
        list.add("63");
        list.add("65");
        list.add("68");
        list.add("70");
        list.add("73");
        list.add("76");
        list.add("78");
        list.add("81");
        list.add("83");
        list.add("86");
        list.add("89");
        list.add("91");
        list.add("94");
        list.add("96");
        list.add("99");
        list.add("102");
        list.add("104");
        list.add("107");
        list.add("109");
        return list;
    }

}
