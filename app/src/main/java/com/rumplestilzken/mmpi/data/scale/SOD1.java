package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class SOD1 extends Scale {
    @Override
    public String getDescription() {
        return "Introversion";
    }

    @Override
    public String toString() {
        return "SOD1";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("46");
        list.add("265");
        list.add("281");
        list.add("337");
        list.add("349");
        list.add("367");
        list.add("480");
        list.add("515");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("49");
        list.add("86");
        list.add("280");
        list.add("340");
        list.add("353");
        list.add("359");
        list.add("363");
        list.add("370");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("36");
        list.add("39");
        list.add("42");
        list.add("45");
        list.add("47");
        list.add("50");
        list.add("53");
        list.add("56");
        list.add("59");
        list.add("62");
        list.add("65");
        list.add("68");
        list.add("71");
        list.add("73");
        list.add("76");
        list.add("79");
        list.add("82");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("37");
        list.add("40");
        list.add("43");
        list.add("46");
        list.add("49");
        list.add("52");
        list.add("55");
        list.add("58");
        list.add("61");
        list.add("64");
        list.add("67");
        list.add("70");
        list.add("73");
        list.add("76");
        list.add("79");
        list.add("82");
        list.add("85");
        return list;
    }

}
