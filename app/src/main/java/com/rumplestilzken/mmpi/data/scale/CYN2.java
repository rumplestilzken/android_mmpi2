package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class CYN2 extends Scale {
    @Override
    public String getDescription() {
        return "Interpersonal Suspiciousness";
    }

    @Override
    public String toString() {
        return "CYN2";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("50");
        list.add("124");
        list.add("225");
        list.add("315");
        list.add("346");
        list.add("358");
        list.add("403");
        list.add("445");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("34");
        list.add("39");
        list.add("43");
        list.add("48");
        list.add("53");
        list.add("57");
        list.add("62");
        list.add("66");
        list.add("71");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("35");
        list.add("40");
        list.add("45");
        list.add("49");
        list.add("54");
        list.add("59");
        list.add("64");
        list.add("68");
        list.add("73");
        return list;
    }

}
