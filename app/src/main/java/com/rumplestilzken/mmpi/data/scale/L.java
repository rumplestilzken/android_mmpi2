package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class L extends Scale {
    @Override
    public String getDescription() {
        return "Lie";
    }

    @Override
    public String toString() {
        return "L";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("16");
        list.add("29");
        list.add("41");
        list.add("51");
        list.add("77");
        list.add("93");
        list.add("102");
        list.add("107");
        list.add("123");
        list.add("139");
        list.add("153");
        list.add("183");
        list.add("203");
        list.add("232");
        list.add("260");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("35");
        list.add("39");
        list.add("43");
        list.add("48");
        list.add("52");
        list.add("56");
        list.add("61");
        list.add("65");
        list.add("70");
        list.add("74");
        list.add("78");
        list.add("83");
        list.add("87");
        list.add("91");
        list.add("96");
        list.add("100");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("33");
        list.add("38");
        list.add("42");
        list.add("47");
        list.add("52");
        list.add("57");
        list.add("62");
        list.add("66");
        list.add("71");
        list.add("76");
        list.add("81");
        list.add("86");
        list.add("90");
        list.add("95");
        list.add("100");
        list.add("105");
        return list;
    }
}
