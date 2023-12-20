package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class KB4 extends CriticalScale {
    @Override
    public String toString() {
        return "KB4";
    }

    @Override
    public String getDescription() {
        return "Koss-Butcher Critical Items - Situational Stress Due to Alcoholism";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("264");
        list.add("487");
        list.add("489");
        list.add("502");
        list.add("511");
        list.add("518");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("125");
        return list;
    }
}