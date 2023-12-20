package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class FAM1 extends Scale {
    @Override
    public String getDescription() {
        return "Family Discord";
    }

    @Override
    public String toString() {
        return "FAM1";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("21");
        list.add("54");
        list.add("190");
        list.add("205");
        list.add("256");
        list.add("323");
        list.add("378");
        list.add("382");
        list.add("449");
        list.add("478");
        list.add("563");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("83");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("35");
        list.add("40");
        list.add("45");
        list.add("50");
        list.add("55");
        list.add("60");
        list.add("65");
        list.add("70");
        list.add("75");
        list.add("80");
        list.add("85");
        list.add("90");
        list.add("95");
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
        list.add("67");
        list.add("71");
        list.add("76");
        list.add("81");
        list.add("86");
        list.add("91");
        return list;
    }

}
