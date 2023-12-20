package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Hy2 extends Scale {
    @Override
    public String getDescription() {
        return "Need for Affection";
    }

    @Override
    public String toString() {
        return "Hy2";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("230");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("26");
        list.add("58");
        list.add("76");
        list.add("81");
        list.add("98");
        list.add("110");
        list.add("124");
        list.add("151");
        list.add("213");
        list.add("241");
        list.add("263");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("");
        list.add("30");
        list.add("32");
        list.add("36");
        list.add("40");
        list.add("43");
        list.add("47");
        list.add("51");
        list.add("55");
        list.add("59");
        list.add("63");
        list.add("67");
        list.add("71");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("");
        list.add("");
        list.add("30");
        list.add("34");
        list.add("38");
        list.add("42");
        list.add("46");
        list.add("50");
        list.add("55");
        list.add("59");
        list.add("63");
        list.add("67");
        list.add("71");
        return list;
    }
}
