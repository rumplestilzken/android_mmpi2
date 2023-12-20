package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class SOD2 extends Scale {
    @Override
    public String getDescription() {
        return "Shyness";
    }

    @Override
    public String toString() {
        return "SOD2";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("158");
        list.add("167");
        list.add("185");
        list.add("275");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("262");
        list.add("321");
        list.add("360");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("36");
        list.add("41");
        list.add("47");
        list.add("52");
        list.add("58");
        list.add("63");
        list.add("68");
        list.add("74");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("35");
        list.add("40");
        list.add("45");
        list.add("50");
        list.add("55");
        list.add("60");
        list.add("65");
        list.add("69");
        return list;
    }

}
