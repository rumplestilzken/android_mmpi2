package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Si3 extends Scale {
    @Override
    public String getDescription() {
        return "Self/Other Alienation";
    }

    @Override
    public String toString() {
        return "Si3";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("31");
        list.add("56");
        list.add("104");
        list.add("110");
        list.add("135");
        list.add("284");
        list.add("302");
        list.add("308");
        list.add("326");
        list.add("328");
        list.add("338");
        list.add("347");
        list.add("348");
        list.add("358");
        list.add("364");
        list.add("368");
        list.add("369");
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
        list.add("35");
        list.add("38");
        list.add("41");
        list.add("44");
        list.add("47");
        list.add("50");
        list.add("53");
        list.add("56");
        list.add("59");
        list.add("62");
        list.add("65");
        list.add("68");
        list.add("71");
        list.add("74");
        list.add("77");
        list.add("80");
        list.add("83");
        list.add("86");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("35");
        list.add("38");
        list.add("41");
        list.add("44");
        list.add("47");
        list.add("49");
        list.add("52");
        list.add("55");
        list.add("58");
        list.add("61");
        list.add("63");
        list.add("66");
        list.add("69");
        list.add("72");
        list.add("74");
        list.add("77");
        list.add("80");
        list.add("83");
        return list;
    }
}
