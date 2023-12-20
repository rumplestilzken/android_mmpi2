package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class KB6 extends CriticalScale {
    @Override
    public String toString() {
        return "KB6";
    }

    @Override
    public String getDescription() {
        return "Koss-Butcher Critical Items - Persecutory Ideas";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("17");
        list.add("42");
        list.add("99");
        list.add("124");
        list.add("138");
        list.add("144");
        list.add("145");
        list.add("162");
        list.add("216");
        list.add("228");
        list.add("241");
        list.add("251");
        list.add("259");
        list.add("333");
        list.add("361");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("314");
        return list;
    }
}