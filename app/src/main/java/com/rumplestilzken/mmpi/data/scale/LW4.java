package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class LW4 extends CriticalScale {
    @Override
    public String toString() {
        return "LW4";
    }

    @Override
    public String getDescription() {
        return "Lachar-Wrobel Critical Items - Deviant Beliefs";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("42");
        list.add("99");
        list.add("138");
        list.add("144");
        list.add("162");
        list.add("216");
        list.add("228");
        list.add("259");
        list.add("333");
        list.add("336");
        list.add("355");
        list.add("466");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("106");
        list.add("314");
        return list;
    }
}