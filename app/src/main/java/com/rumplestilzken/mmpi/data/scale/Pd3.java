package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Pd3 extends Scale {
    @Override
    public String getDescription() {
        return "Social Imperturbability";
    }

    @Override
    public String toString() {
        return "Pd3";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("70");
        list.add("129");
        list.add("158");
        list.add("167");
        list.add("185");
        list.add("243");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("30");
        list.add("35");
        list.add("40");
        list.add("46");
        list.add("52");
        list.add("58");
        list.add("64");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("30");
        list.add("35");
        list.add("41");
        list.add("47");
        list.add("52");
        list.add("58");
        list.add("64");
        return list;
    }
}
