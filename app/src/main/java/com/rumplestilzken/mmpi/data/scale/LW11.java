package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class LW11 extends CriticalScale {
    @Override
    public String toString() {
        return "LW11";
    }

    @Override
    public String getDescription() {
        return "Lachar-Wrobel Critical Items - Somatic Symptoms";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("18");
        list.add("28");
        list.add("40");
        list.add("44");
        list.add("53");
        list.add("57");
        list.add("59");
        list.add("101");
        list.add("111");
        list.add("175");
        list.add("182");
        list.add("229");
        list.add("247");
        list.add("464");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("33");
        list.add("47");
        list.add("142");
        list.add("159");
        list.add("164");
        list.add("176");
        list.add("224");
        list.add("255");
        list.add("295");
        return list;
    }
}

