package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class TRT1 extends Scale {
    @Override
    public String getDescription() {
        return "Low Motivation";
    }

    @Override
    public String toString() {
        return "TRT1";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("92");
        list.add("364");
        list.add("368");
        list.add("376");
        list.add("491");
        list.add("497");
        list.add("500");
        list.add("528");
        list.add("539");
        list.add("554");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("494");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("42");
        list.add("48");
        list.add("54");
        list.add("60");
        list.add("66");
        list.add("71");
        list.add("77");
        list.add("83");
        list.add("89");
        list.add("95");
        list.add("101");
        list.add("107");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("41");
        list.add("46");
        list.add("51");
        list.add("56");
        list.add("61");
        list.add("66");
        list.add("71");
        list.add("76");
        list.add("81");
        list.add("86");
        list.add("91");
        list.add("96");
        return list;
    }

}
