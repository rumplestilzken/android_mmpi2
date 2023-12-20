package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Pa_S extends Scale {
    @Override
    public String getDescription() {
        return "Paranoia, Subtle";
    }

    @Override
    public String toString() {
        return "Pa-S";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("16");
        list.add("113");
        list.add("145");
        list.add("271");
        list.add("334");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("81");
        list.add("95");
        list.add("98");
        list.add("100");
        list.add("104");
        list.add("110");
        list.add("244");
        list.add("283");
        list.add("284");
        list.add("286");
        list.add("297");
        list.add("315");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("31");
        list.add("35");
        list.add("39");
        list.add("43");
        list.add("48");
        list.add("52");
        list.add("56");
        list.add("60");
        list.add("65");
        list.add("69");
        list.add("73");
        list.add("77");
        list.add("82");
        list.add("86");
        list.add("90");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("31");
        list.add("35");
        list.add("39");
        list.add("44");
        list.add("48");
        list.add("52");
        list.add("57");
        list.add("61");
        list.add("65");
        list.add("69");
        list.add("74");
        list.add("78");
        list.add("82");
        list.add("87");
        list.add("91");
        return list;
    }

}
