package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class LW1 extends CriticalScale {
    @Override
    public String toString() {
        return "LW1";
    }

    @Override
    public String getDescription() {
        return "Lachar-Wrobel Critical Items - Anxiety and Tension";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("15");
        list.add("17");
        list.add("172");
        list.add("218");
        list.add("299");
        list.add("301");
        list.add("320");
        list.add("463");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("223");
        list.add("261");
        list.add("405");
        return list;
    }
}