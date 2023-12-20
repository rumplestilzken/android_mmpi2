package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Fp extends Scale {
    @Override
    public String getDescription() {
        return "Infrequent Psychopathology";
    }

    @Override
    public String toString() {
        return "Fp";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("66");
        list.add("114");
        list.add("162");
        list.add("193");
        list.add("216");
        list.add("228");
        list.add("252");
        list.add("270");
        list.add("282");
        list.add("291");
        list.add("294");
        list.add("322");
        list.add("323");
        list.add("336");
        list.add("371");
        list.add("387");
        list.add("478");
        list.add("555");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("51");
        list.add("77");
        list.add("90");
        list.add("93");
        list.add("102");
        list.add("126");
        list.add("192");
        list.add("276");
        list.add("501");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("41");
        list.add("48");
        list.add("56");
        list.add("63");
        list.add("70");
        list.add("77");
        list.add("80");
        list.add("94");
        list.add("99");
        list.add("106");
        list.add("113");
        list.add("120");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("41");
        list.add("49");
        list.add("57");
        list.add("65");
        list.add("73");
        list.add("81");
        list.add("89");
        list.add("97");
        list.add("105");
        list.add("113");
        list.add("120");
        return list;
    }
}
