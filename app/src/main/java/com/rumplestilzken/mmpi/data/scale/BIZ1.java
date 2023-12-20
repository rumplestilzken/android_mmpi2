package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class BIZ1 extends Scale {
    @Override
    public String getDescription() {
        return "Psyhoctic Symptomatology";
    }

    @Override
    public String toString() {
        return "BIZ1";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("24");
        list.add("60");
        list.add("96");
        list.add("138");
        list.add("162");
        list.add("228");
        list.add("336");
        list.add("355");
        list.add("361");
        list.add("508");
        list.add("551");
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
        list.add("44");
        list.add("54");
        list.add("64");
        list.add("74");
        list.add("84");
        list.add("94");
        list.add("104");
        list.add("114");
        list.add("120");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("44");
        list.add("54");
        list.add("65");
        list.add("76");
        list.add("86");
        list.add("97");
        list.add("108");
        list.add("118");
        list.add("120");
        return list;
    }

}
