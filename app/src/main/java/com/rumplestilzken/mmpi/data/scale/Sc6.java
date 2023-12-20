package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Sc6 extends Scale {
    @Override
    public String getDescription() {
        return "Bizarre Sensory Experiences";
    }

    @Override
    public String toString() {
        return "Sc6";
    }
    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("23");
        list.add("32");
        list.add("44");
        list.add("168");
        list.add("182");
        list.add("229");
        list.add("247");
        list.add("252");
        list.add("296");
        list.add("298");
        list.add("307");
        list.add("311");
        list.add("319");
        list.add("355");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("91");
        list.add("106");
        list.add("177");
        list.add("179");
        list.add("255");
        list.add("295");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("41");
        list.add("46");
        list.add("51");
        list.add("55");
        list.add("60");
        list.add("65");
        list.add("70");
        list.add("75");
        list.add("80");
        list.add("85");
        list.add("90");
        list.add("95");
        list.add("99");
        list.add("104");
        list.add("109");
        list.add("114");
        list.add("119");
        list.add("120");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("41");
        list.add("45");
        list.add("50");
        list.add("54");
        list.add("59");
        list.add("63");
        list.add("68");
        list.add("72");
        list.add("77");
        list.add("81");
        list.add("86");
        list.add("91");
        list.add("95");
        list.add("100");
        list.add("104");
        list.add("109");
        list.add("113");
        list.add("118");
        list.add("120");
        return list;
    }
}
