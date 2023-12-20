package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Pd1 extends Scale {
    @Override
    public String getDescription() {
        return "Familial Discord";
    }

    @Override
    public String toString() {
        return "Pd1";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("21");
        list.add("54");
        list.add("195");
        list.add("202");
        list.add("288");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("83");
        list.add("125");
        list.add("214");
        list.add("217");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("38");
        list.add("45");
        list.add("51");
        list.add("58");
        list.add("65");
        list.add("71");
        list.add("78");
        list.add("84");
        list.add("91");
        list.add("98");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("38");
        list.add("44");
        list.add("50");
        list.add("56");
        list.add("62");
        list.add("68");
        list.add("74");
        list.add("80");
        list.add("86");
        list.add("92");
        return list;
    }
}
