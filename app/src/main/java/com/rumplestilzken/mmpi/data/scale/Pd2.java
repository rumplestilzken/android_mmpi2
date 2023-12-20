package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Pd2 extends Scale {
    @Override
    public String getDescription() {
        return "Authority Problems";
    }

    @Override
    public String toString() {
        return "Pd2";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("35");
        list.add("105");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("34");
        list.add("70");
        list.add("129");
        list.add("160");
        list.add("263");
        list.add("266");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("30");
        list.add("35");
        list.add("42");
        list.add("48");
        list.add("55");
        list.add("61");
        list.add("68");
        list.add("74");
        list.add("81");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("30");
        list.add("38");
        list.add("46");
        list.add("53");
        list.add("61");
        list.add("69");
        list.add("77");
        list.add("84");
        list.add("92");
        return list;
    }
}
