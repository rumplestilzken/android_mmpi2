package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class LW5 extends CriticalScale {
    @Override
    public String toString() {
        return "LW5";
    }

    @Override
    public String getDescription() {
        return "Lachar-Wrobel Critical Items - Deviant Thinking and Experiences";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("32");
        list.add("60");
        list.add("96");
        list.add("122");
        list.add("198");
        list.add("298");
        list.add("307");
        list.add("316");
        list.add("319");
        list.add("427");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        return list;
    }
}