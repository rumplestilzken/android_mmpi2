package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Sc5 extends Scale {
    @Override
    public String getDescription() {
        return "Lack of Ego mastery, Defective Inhibition";
    }

    @Override
    public String toString() {
        return "Sc5";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("23");
        list.add("85");
        list.add("168");
        list.add("182");
        list.add("218");
        list.add("242");
        list.add("274");
        list.add("320");
        list.add("322");
        list.add("329");
        list.add("355");
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
        list.add("40");
        list.add("47");
        list.add("54");
        list.add("61");
        list.add("68");
        list.add("75");
        list.add("82");
        list.add("89");
        list.add("96");
        list.add("103");
        list.add("110");
        list.add("117");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("40");
        list.add("46");
        list.add("53");
        list.add("59");
        list.add("65");
        list.add("72");
        list.add("78");
        list.add("85");
        list.add("91");
        list.add("97");
        list.add("104");
        list.add("110");
        return list;
    }
}
