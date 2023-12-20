package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Si2 extends Scale {
    @Override
    public String getDescription() {
        return "Social Avoidance";
    }

    @Override
    public String toString() {
        return "Si2";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("337");
        list.add("367");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("86");
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
        list.add("37");
        list.add("41");
        list.add("45");
        list.add("49");
        list.add("54");
        list.add("58");
        list.add("62");
        list.add("67");
        list.add("71");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("37");
        list.add("42");
        list.add("47");
        list.add("51");
        list.add("56");
        list.add("60");
        list.add("65");
        list.add("69");
        list.add("74");
        return list;
    }
}
