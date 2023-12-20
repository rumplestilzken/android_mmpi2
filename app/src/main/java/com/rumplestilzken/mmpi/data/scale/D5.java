package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class D5 extends Scale {
    @Override
    public String getDescription() {
        return "Boording";
    }

    @Override
    public String toString() {
        return "D5";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("38");
        list.add("56");
        list.add("92");
        list.add("127");
        list.add("130");
        list.add("146");
        list.add("170");
        list.add("215");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("75");
        list.add("95");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("40");
        list.add("45");
        list.add("51");
        list.add("57");
        list.add("62");
        list.add("68");
        list.add("74");
        list.add("79");
        list.add("85");
        list.add("91");
        list.add("96");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("37");
        list.add("42");
        list.add("47");
        list.add("53");
        list.add("58");
        list.add("63");
        list.add("68");
        list.add("73");
        list.add("78");
        list.add("83");
        list.add("89");
        return list;
    }
}
