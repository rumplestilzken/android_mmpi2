package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Hy4 extends Scale {
    @Override
    public String getDescription() {
        return "Somatic Complaints";
    }

    @Override
    public String toString() {
        return "Hy4";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("11");
        list.add("18");
        list.add("40");
        list.add("44");
        list.add("101");
        list.add("172");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("8");
        list.add("47");
        list.add("91");
        list.add("159");
        list.add("164");
        list.add("173");
        list.add("176");
        list.add("179");
        list.add("208");
        list.add("224");
        list.add("249");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("38");
        list.add("43");
        list.add("48");
        list.add("52");
        list.add("57");
        list.add("62");
        list.add("67");
        list.add("72");
        list.add("77");
        list.add("82");
        list.add("86");
        list.add("91");
        list.add("96");
        list.add("101");
        list.add("106");
        list.add("111");
        list.add("115");
        list.add("120");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("37");
        list.add("41");
        list.add("45");
        list.add("49");
        list.add("53");
        list.add("57");
        list.add("61");
        list.add("65");
        list.add("69");
        list.add("73");
        list.add("77");
        list.add("81");
        list.add("85");
        list.add("89");
        list.add("93");
        list.add("97");
        list.add("101");
        list.add("105");
        return list;
    }
}
