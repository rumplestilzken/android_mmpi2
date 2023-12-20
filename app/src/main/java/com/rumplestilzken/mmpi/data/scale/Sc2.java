package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Sc2 extends Scale {
    @Override
    public String getDescription() {
        return "Emotional Alienation";
    }

    @Override
    public String toString() {
        return "Sc2";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("65");
        list.add("92");
        list.add("234");
        list.add("273");
        list.add("303");
        list.add("323");
        list.add("329");
        list.add("332");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("9");
        list.add("210");
        list.add("290");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("40");
        list.add("50");
        list.add("59");
        list.add("69");
        list.add("78");
        list.add("88");
        list.add("98");
        list.add("107");
        list.add("117");
        list.add("120");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("40");
        list.add("49");
        list.add("58");
        list.add("67");
        list.add("76");
        list.add("86");
        list.add("95");
        list.add("104");
        list.add("113");
        list.add("120");
        return list;
    }
}
