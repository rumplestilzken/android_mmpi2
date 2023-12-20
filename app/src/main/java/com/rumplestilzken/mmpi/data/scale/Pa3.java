package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Pa3 extends Scale {
    @Override
    public String getDescription() {
        return "Naivete";
    }

    @Override
    public String toString() {
        return "Pa3";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("16");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("81");
        list.add("98");
        list.add("104");
        list.add("110");
        list.add("283");
        list.add("284");
        list.add("286");
        list.add("315");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("30");
        list.add("32");
        list.add("36");
        list.add("41");
        list.add("46");
        list.add("51");
        list.add("56");
        list.add("60");
        list.add("65");
        list.add("70");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("30");
        list.add("31");
        list.add("36");
        list.add("41");
        list.add("45");
        list.add("50");
        list.add("55");
        list.add("60");
        list.add("65");
        list.add("69");
        return list;
    }
}
