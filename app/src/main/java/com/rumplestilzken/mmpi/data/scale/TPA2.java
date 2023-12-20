package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class TPA2 extends Scale {
    @Override
    public String getDescription() {
        return "Competitive Drive";
    }

    @Override
    public String toString() {
        return "TPA2";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("27");
        list.add("151");
        list.add("212");
        list.add("358");
        list.add("419");
        list.add("423");
        list.add("510");
        list.add("531");
        list.add("545");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("33");
        list.add("39");
        list.add("44");
        list.add("50");
        list.add("55");
        list.add("60");
        list.add("66");
        list.add("71");
        list.add("77");
        list.add("82");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("34");
        list.add("40");
        list.add("46");
        list.add("52");
        list.add("58");
        list.add("64");
        list.add("70");
        list.add("76");
        list.add("82");
        list.add("89");
        return list;
    }

}
