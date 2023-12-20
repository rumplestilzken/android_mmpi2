package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class D2 extends Scale {
    @Override
    public String getDescription() {
        return "Psychomotor Retardation";
    }

    @Override
    public String toString() {
        return "D2";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("38");
        list.add("46");
        list.add("170");
        list.add("233");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("9");
        list.add("29");
        list.add("37");
        list.add("49");
        list.add("55");
        list.add("76");
        list.add("134");
        list.add("188");
        list.add("189");
        list.add("212");

        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("");
        list.add("30");
        list.add("32");
        list.add("37");
        list.add("43");
        list.add("48");
        list.add("54");
        list.add("59");
        list.add("65");
        list.add("70");
        list.add("76");
        list.add("81");
        list.add("87");
        list.add("92");
        list.add("98");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("");
        list.add("");
        list.add("30");
        list.add("35");
        list.add("41");
        list.add("46");
        list.add("51");
        list.add("57");
        list.add("62");
        list.add("68");
        list.add("73");
        list.add("79");
        list.add("84");
        list.add("90");
        list.add("95");
        return list;
    }
}
