package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Si1 extends Scale {
    @Override
    public String getDescription() {
        return "Shyness/Self-Consciousness";
    }

    @Override
    public String toString() {
        return "Si1";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("158");
        list.add("161");
        list.add("167");
        list.add("185");
        list.add("243");
        list.add("265");
        list.add("275");
        list.add("289");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("49");
        list.add("262");
        list.add("280");
        list.add("321");
        list.add("342");
        list.add("360");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("36");
        list.add("39");
        list.add("42");
        list.add("45");
        list.add("48");
        list.add("51");
        list.add("53");
        list.add("56");
        list.add("59");
        list.add("62");
        list.add("65");
        list.add("68");
        list.add("71");
        list.add("74");
        list.add("77");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("36");
        list.add("38");
        list.add("41");
        list.add("44");
        list.add("46");
        list.add("49");
        list.add("52");
        list.add("55");
        list.add("57");
        list.add("60");
        list.add("63");
        list.add("65");
        list.add("68");
        list.add("71");
        list.add("74");
        return list;
    }
}
