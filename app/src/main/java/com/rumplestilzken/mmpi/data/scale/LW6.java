package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class LW6 extends CriticalScale {
    @Override
    public String toString() {
        return "LW6";
    }

    @Override
    public String getDescription() {
        return "Lachar-Wrobel Critical Items - Substance Abuse";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("168");
        list.add("264");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("429");
        return list;
    }
}