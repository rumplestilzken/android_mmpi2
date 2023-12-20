package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Ma1 extends Scale {
    @Override
    public String getDescription() {
        return "Amorality";
    }

    @Override
    public String toString() {
        return "Ma1";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("131");
        list.add("227");
        list.add("248");
        list.add("250");
        list.add("269");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("263");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("35");
        list.add("42");
        list.add("50");
        list.add("58");
        list.add("66");
        list.add("74");
        list.add("81");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("37");
        list.add("45");
        list.add("54");
        list.add("62");
        list.add("70");
        list.add("79");
        list.add("87");
        return list;
    }
}
