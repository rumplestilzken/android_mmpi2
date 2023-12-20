package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class FRS2 extends Scale {
    @Override
    public String getDescription() {
        return "Multiple Fears";
    }

    @Override
    public String toString() {
        return "FRS2";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("154");
        list.add("392");
        list.add("438");
        list.add("458");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("115");
        list.add("163");
        list.add("385");
        list.add("401");
        list.add("453");
        list.add("462");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("37");
        list.add("41");
        list.add("45");
        list.add("50");
        list.add("54");
        list.add("59");
        list.add("63");
        list.add("67");
        list.add("72");
        list.add("76");
        list.add("81");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("30");
        list.add("33");
        list.add("37");
        list.add("41");
        list.add("45");
        list.add("49");
        list.add("53");
        list.add("58");
        list.add("62");
        list.add("66");
        list.add("70");
        return list;
    }

}
