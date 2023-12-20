package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class KB1 extends CriticalScale {
    @Override
    public String toString() {
        return "KB1";
    }

    @Override
    public String getDescription() {
        return "Koss-Butcher Critical Items - Acute Anxiety Scale";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("5");
        list.add("15");
        list.add("28");
        list.add("39");
        list.add("59");
        list.add("172");
        list.add("218");
        list.add("301");
        list.add("444");
        list.add("463");
        list.add("469");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("2");
        list.add("3");
        list.add("10");
        list.add("140");
        list.add("208");
        list.add("223");

        return list;
    }
}
