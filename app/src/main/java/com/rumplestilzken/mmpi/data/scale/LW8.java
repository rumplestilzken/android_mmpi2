package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class LW8 extends CriticalScale {
    @Override
    public String toString() {
        return "LW8";
    }

    @Override
    public String getDescription() {
        return "Lachar-Wrobel Critical Items - Family Conflict";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("21");
        list.add("288");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("83");
        list.add("125");
        return list;
    }
}