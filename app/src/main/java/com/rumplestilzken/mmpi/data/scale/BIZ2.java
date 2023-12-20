package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class BIZ2 extends Scale {
    @Override
    public String getDescription() {
        return "Schizotypal Characteristics";
    }

    @Override
    public String toString() {
        return "BIZ2";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("32");
        list.add("259");
        list.add("298");
        list.add("311");
        list.add("316");
        list.add("319");
        list.add("333");
        list.add("466");
        list.add("543");
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
        list.add("41");
        list.add("47");
        list.add("54");
        list.add("60");
        list.add("67");
        list.add("73");
        list.add("80");
        list.add("86");
        list.add("93");
        list.add("99");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("41");
        list.add("47");
        list.add("54");
        list.add("60");
        list.add("66");
        list.add("72");
        list.add("79");
        list.add("85");
        list.add("91");
        list.add("97");
        return list;
    }

}
