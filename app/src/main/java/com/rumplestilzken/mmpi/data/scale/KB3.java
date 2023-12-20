package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class KB3 extends CriticalScale {
    @Override
    public String toString() {
        return "KB3";
    }

    @Override
    public String getDescription() {
        return "Koss-Butcher Critical Items - Threatened Assault";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("37");
        list.add("85");
        list.add("134");
        list.add("213");
        list.add("389");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        return list;
    }
}
