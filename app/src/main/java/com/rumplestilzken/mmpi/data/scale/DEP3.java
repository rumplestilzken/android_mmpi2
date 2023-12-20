package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class DEP3 extends Scale {
    @Override
    public String getDescription() {
        return "Self-Deprecation";
    }

    @Override
    public String toString() {
        return "DEP3";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("52");
        list.add("82");
        list.add("130");
        list.add("234");
        list.add("246");
        list.add("377");
        list.add("411");
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
        list.add("48");
        list.add("55");
        list.add("62");
        list.add("69");
        list.add("76");
        list.add("83");
        list.add("91");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("40");
        list.add("47");
        list.add("54");
        list.add("61");
        list.add("68");
        list.add("75");
        list.add("82");
        list.add("89");
        return list;
    }

}
