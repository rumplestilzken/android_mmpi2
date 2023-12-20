package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class D3 extends Scale {
    @Override
    public String getDescription() {
        return "Physical Malfunctioning";
    }

    @Override
    public String toString() {
        return "D3";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("18");
        list.add("117");
        list.add("175");
        list.add("181");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("2");
        list.add("20");
        list.add("45");
        list.add("141");
        list.add("142");
        list.add("143");
        list.add("148");

        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("30");
        list.add("35");
        list.add("43");
        list.add("51");
        list.add("59");
        list.add("67");
        list.add("75");
        list.add("83");
        list.add("91");
        list.add("100");
        list.add("108");
        list.add("116");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("30");
        list.add("34");
        list.add("41");
        list.add("48");
        list.add("56");
        list.add("63");
        list.add("70");
        list.add("78");
        list.add("85");
        list.add("93");
        list.add("100");
        list.add("107");
        return list;
    }
}
