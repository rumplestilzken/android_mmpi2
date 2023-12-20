package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class ANG2 extends Scale {
    @Override
    public String getDescription() {
        return "Irritability";
    }

    @Override
    public String toString() {
        return "ANG2";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("116");
        list.add("302");
        list.add("430");
        list.add("461");
        list.add("486");
        list.add("513");
        list.add("542");
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
        list.add("35");
        list.add("41");
        list.add("46");
        list.add("51");
        list.add("56");
        list.add("61");
        list.add("67");
        list.add("72");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("33");
        list.add("39");
        list.add("44");
        list.add("49");
        list.add("54");
        list.add("59");
        list.add("65");
        list.add("70");
        return list;
    }

}
