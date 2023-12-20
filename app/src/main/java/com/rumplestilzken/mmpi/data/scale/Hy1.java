package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Hy1 extends Scale {
    @Override
    public String getDescription() {
        return "Denial of Social Anxiety";
    }

    @Override
    public String toString() {
        return "Hy1";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("129");
        list.add("161");
        list.add("167");
        list.add("185");
        list.add("243");
        list.add("265");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("30");
        list.add("34");
        list.add("40");
        list.add("45");
        list.add("51");
        list.add("56");
        list.add("61");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("30");
        list.add("35");
        list.add("40");
        list.add("45");
        list.add("51");
        list.add("56");
        list.add("61");
        return list;
    }
}
