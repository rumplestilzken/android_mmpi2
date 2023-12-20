package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class ASP2 extends Scale {
    @Override
    public String getDescription() {
        return "Antisocial Behavior";
    }

    @Override
    public String toString() {
        return "ASP2";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("35");
        list.add("84");
        list.add("105");
        list.add("412");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("266");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("38");
        list.add("45");
        list.add("52");
        list.add("59");
        list.add("67");
        list.add("74");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("42");
        list.add("51");
        list.add("61");
        list.add("71");
        list.add("81");
        list.add("90");
        return list;
    }


}
