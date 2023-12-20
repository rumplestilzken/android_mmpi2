package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class LW2 extends CriticalScale {
    @Override
    public String toString() {
        return "LW2";
    }

    @Override
    public String getDescription() {
        return "Lachar-Wrobel Critical Items - Depression and Worry";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("65");
        list.add("73");
        list.add("130");
        list.add("150");
        list.add("180");
        list.add("273");
        list.add("303");
        list.add("339");
        list.add("411");
        list.add("415");
        list.add("454");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("2");
        list.add("3");
        list.add("10");
        list.add("75");
        list.add("165");
        return list;
    }
}