package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class LW10 extends CriticalScale {
    @Override
    public String toString() {
        return "LW10";
    }

    @Override
    public String getDescription() {
        return "Lachar-Wrobel Critical Items - Sexual Concern and Deviation";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("62");
        list.add("166");
        list.add("268");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("12");
        list.add("34");
        list.add("121");
        return list;
    }
}