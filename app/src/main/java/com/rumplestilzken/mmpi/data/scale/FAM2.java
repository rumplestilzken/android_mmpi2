package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class FAM2 extends Scale {
    @Override
    public String getDescription() {
        return "Familial Alienation";
    }

    @Override
    public String toString() {
        return "FAM2";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("195");
        list.add("550");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("217");
        list.add("383");
        list.add("455");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("40");
        list.add("49");
        list.add("58");
        list.add("67");
        list.add("76");
        list.add("84");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("41");
        list.add("50");
        list.add("59");
        list.add("68");
        list.add("77");
        list.add("86");
        return list;
    }

}
