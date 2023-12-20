package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Hy5 extends Scale {
    @Override
    public String getDescription() {
        return "Inhibition of Aggression";
    }

    @Override
    public String toString() {
        return "Hy5";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("7");
        list.add("14");
        list.add("29");
        list.add("115");
        list.add("116");
        list.add("135");
        list.add("157");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("30");
        list.add("33");
        list.add("40");
        list.add("48");
        list.add("55");
        list.add("63");
        list.add("71");
        list.add("78");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("30");
        list.add("31");
        list.add("39");
        list.add("46");
        list.add("54");
        list.add("62");
        list.add("70");
        list.add("77");
        return list;
    }
}
