package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class CYN1 extends Scale {
    @Override
    public String getDescription() {
        return "Misanthropic Beliefs";
    }

    @Override
    public String toString() {
        return "CYN1";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("58");
        list.add("76");
        list.add("81");
        list.add("104");
        list.add("110");
        list.add("241");
        list.add("254");
        list.add("283");
        list.add("284");
        list.add("286");
        list.add("352");
        list.add("374");
        list.add("399");
        list.add("470");
        list.add("538");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("33");
        list.add("36");
        list.add("39");
        list.add("41");
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
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("34");
        list.add("37");
        list.add("40");
        list.add("42");
        list.add("45");
        list.add("48");
        list.add("51");
        list.add("54");
        list.add("56");
        list.add("59");
        list.add("62");
        list.add("65");
        list.add("68");
        list.add("70");
        list.add("73");
        list.add("76");
        return list;
    }

}
