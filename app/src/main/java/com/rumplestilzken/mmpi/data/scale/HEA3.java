package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class HEA3 extends Scale {
    @Override
    public String getDescription() {
        return "General Health Concerns";
    }

    @Override
    public String toString() {
        return "HEA3";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("175");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("33");
        list.add("45");
        list.add("118");
        list.add("141");
        list.add("224");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("40");
        list.add("48");
        list.add("56");
        list.add("64");
        list.add("72");
        list.add("81");
        list.add("89");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("40");
        list.add("48");
        list.add("56");
        list.add("64");
        list.add("71");
        list.add("79");
        list.add("87");
        return list;
    }

}
