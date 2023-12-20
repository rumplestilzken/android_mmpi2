package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Ma4 extends Scale {
    @Override
    public String getDescription() {
        return "Ego Inflation";
    }

    @Override
    public String toString() {
        return "Ma4";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("13");
        list.add("50");
        list.add("55");
        list.add("61");
        list.add("98");
        list.add("145");
        list.add("190");
        list.add("211");
        list.add("212");
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
        list.add("30");
        list.add("37");
        list.add("43");
        list.add("50");
        list.add("56");
        list.add("63");
        list.add("69");
        list.add("76");
        list.add("82");
        list.add("89");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("31");
        list.add("37");
        list.add("43");
        list.add("49");
        list.add("56");
        list.add("62");
        list.add("68");
        list.add("74");
        list.add("80");
        list.add("86");
        return list;
    }
}
