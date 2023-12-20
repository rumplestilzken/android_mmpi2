package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class LW3 extends CriticalScale {
    @Override
    public String toString() {
        return "LW3";
    }

    @Override
    public String getDescription() {
        return "Lachar-Wrobel Critical Items - Sleep Disturbance";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("5");
        list.add("30");
        list.add("39");
        list.add("328");
        list.add("471");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("140");
        return list;
    }
}