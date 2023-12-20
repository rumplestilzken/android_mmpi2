package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class LW7 extends CriticalScale {
    @Override
    public String toString() {
        return "LW7";
    }

    @Override
    public String getDescription() {
        return "Lachar-Wrobel Critical Items - Antisocial Attitude";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("27");
        list.add("35");
        list.add("84");
        list.add("105");
        list.add("227");
        list.add("240");
        list.add("254");
        list.add("324");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("266");
        return list;
    }
}