package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class DEP2 extends Scale {
    @Override
    public String getDescription() {
        return "Dysphoria";
    }

    @Override
    public String toString() {
        return "DEP2";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("56");
        list.add("65");
        list.add("146");
        list.add("215");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("95");
        list.add("388");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("42");
        list.add("50");
        list.add("58");
        list.add("66");
        list.add("74");
        list.add("82");
        list.add("90");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("40");
        list.add("47");
        list.add("53");
        list.add("60");
        list.add("66");
        list.add("73");
        list.add("79");
        return list;
    }

}
