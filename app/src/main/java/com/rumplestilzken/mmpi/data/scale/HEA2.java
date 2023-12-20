package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class HEA2 extends Scale {
    @Override
    public String getDescription() {
        return "Neurological Symptoms";
    }

    @Override
    public String toString() {
        return "HEA2";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("44");
        list.add("53");
        list.add("101");
        list.add("149");
        list.add("247");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("91");
        list.add("142");
        list.add("159");
        list.add("164");
        list.add("179");
        list.add("255");
        list.add("295");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("40");
        list.add("47");
        list.add("54");
        list.add("60");
        list.add("67");
        list.add("74");
        list.add("80");
        list.add("87");
        list.add("94");
        list.add("100");
        list.add("107");
        list.add("114");
        list.add("120");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("39");
        list.add("45");
        list.add("50");
        list.add("56");
        list.add("61");
        list.add("67");
        list.add("72");
        list.add("78");
        list.add("83");
        list.add("89");
        list.add("94");
        list.add("99");
        list.add("105");
        return list;
    }

}
