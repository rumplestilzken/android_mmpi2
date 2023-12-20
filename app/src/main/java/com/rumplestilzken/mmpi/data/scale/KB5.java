package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class KB5 extends CriticalScale {
    @Override
    public String toString() {
        return "KB5";
    }

    @Override
    public String getDescription() {
        return "Koss-Butcher Critical Items - Mental Confusion";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("24");
        list.add("31");
        list.add("32");
        list.add("72");
        list.add("96");
        list.add("180");
        list.add("198");
        list.add("299");
        list.add("311");
        list.add("316");
        list.add("325");

        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        return list;
    }
}