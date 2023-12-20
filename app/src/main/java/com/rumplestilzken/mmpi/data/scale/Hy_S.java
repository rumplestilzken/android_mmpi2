package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Hy_S extends Scale {
    @Override
    public String getDescription() {
        return "Hysteria, Subtle";
    }

    @Override
    public String toString() {
        return "Hy-S";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("230");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("7");
        list.add("14");
        list.add("26");
        list.add("29");
        list.add("58");
        list.add("76");
        list.add("81");
        list.add("98");
        list.add("110");
        list.add("116");
        list.add("124");
        list.add("129");
        list.add("135");
        list.add("148");
        list.add("151");
        list.add("157");
        list.add("161");
        list.add("167");
        list.add("176");
        list.add("185");
        list.add("193");
        list.add("213");
        list.add("241");
        list.add("243");
        list.add("253");
        list.add("263");
        list.add("265");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("31");
        list.add("34");
        list.add("36");
        list.add("38");
        list.add("41");
        list.add("43");
        list.add("45");
        list.add("47");
        list.add("50");
        list.add("52");
        list.add("54");
        list.add("57");
        list.add("59");
        list.add("61");
        list.add("64");
        list.add("66");
        list.add("68");
        list.add("71");
        list.add("73");
        list.add("75");
        list.add("78");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("32");
        list.add("34");
        list.add("37");
        list.add("39");
        list.add("42");
        list.add("44");
        list.add("47");
        list.add("49");
        list.add("51");
        list.add("54");
        list.add("56");
        list.add("59");
        list.add("61");
        list.add("64");
        list.add("66");
        list.add("69");
        list.add("71");
        list.add("73");
        list.add("76");
        list.add("78");
        return list;
    }

}
