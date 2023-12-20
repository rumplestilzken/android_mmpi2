package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class KB2 extends CriticalScale {
    @Override
    public String toString() {
        return "KB2";
    }

    @Override
    public String getDescription() {
        return "Koss-Butcher Critical Items - Depressed Suicidal Ideation";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("38");
        list.add("65");
        list.add("71");
        list.add("92");
        list.add("130");
        list.add("146");
        list.add("215");
        list.add("233");
        list.add("273");
        list.add("303");
        list.add("306");
        list.add("411");
        list.add("454");
        list.add("485");
        list.add("506");
        list.add("518");
        list.add("520");
        list.add("524");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("9");
        list.add("75");
        list.add("95");
        list.add("388");
        return list;
    }
}
