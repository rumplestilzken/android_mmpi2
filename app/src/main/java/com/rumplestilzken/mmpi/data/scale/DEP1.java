package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class DEP1 extends Scale {
    @Override
    public String getDescription() {
        return "Lack of Drive";
    }

    @Override
    public String toString() {
        return "DEP1";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("38");
        list.add("71");
        list.add("92");
        list.add("399");
        list.add("400");
        list.add("512");
        list.add("516");
        list.add("539");
        list.add("554");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("3");
        list.add("9");
        list.add("75");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("40");
        list.add("46");
        list.add("51");
        list.add("57");
        list.add("62");
        list.add("68");
        list.add("73");
        list.add("79");
        list.add("84");
        list.add("89");
        list.add("95");
        list.add("100");
        list.add("106");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
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
        list.add("100");
        return list;
    }

}
