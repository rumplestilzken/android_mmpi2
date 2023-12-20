package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class LSE1 extends Scale {
    @Override
    public String getDescription() {
        return "Self-Doubt";
    }

    @Override
    public String toString() {
        return "LSE1";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("73");
        list.add("130");
        list.add("326");
        list.add("411");
        list.add("450");
        list.add("483");
        list.add("485");
        list.add("504");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("61");
        list.add("78");
        list.add("109");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("39");
        list.add("44");
        list.add("49");
        list.add("54");
        list.add("59");
        list.add("64");
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
        list.add("39");
        list.add("43");
        list.add("48");
        list.add("53");
        list.add("57");
        list.add("62");
        list.add("66");
        list.add("71");
        list.add("75");
        list.add("80");
        list.add("85");
        list.add("89");
        return list;
    }

}
