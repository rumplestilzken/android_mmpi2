package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class cyn extends Scale {
    @Override
    public String getDescription() {
        return "Cynisism";
    }

    @Override
    public String toString() {
        return "cyn";
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
        list.add("284");
        list.add("286");
        list.add("352");
        list.add("436");
        list.add("445");
        list.add("538");
        list.add("563");
        list.add("567");
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
        list.add("34");
        list.add("38");
        list.add("41");
        list.add("43");
        list.add("45");
        list.add("47");
        list.add("48");
        list.add("50");
        list.add("53");
        list.add("56");
        list.add("60");
        list.add("64");
        list.add("69");
        list.add("74");
        list.add("78");
        list.add("83");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("33");
        list.add("38");
        list.add("41");
        list.add("44");
        list.add("46");
        list.add("48");
        list.add("50");
        list.add("52");
        list.add("55");
        list.add("58");
        list.add("62");
        list.add("66");
        list.add("70");
        list.add("74");
        list.add("78");
        list.add("82");
        return list;
    }

}
