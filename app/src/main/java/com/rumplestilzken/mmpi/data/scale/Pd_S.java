package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Pd_S extends Scale {
    @Override
    public String getDescription() {
        return "Psychopathic Deviate, Subtle";
    }

    @Override
    public String toString() {
        return "Pd-S";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("21");
        list.add("89");
        list.add("113");
        list.add("219");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("70");
        list.add("83");
        list.add("122");
        list.add("129");
        list.add("143");
        list.add("157");
        list.add("158");
        list.add("160");
        list.add("167");
        list.add("171");
        list.add("185");
        list.add("209");
        list.add("214");
        list.add("217");
        list.add("226");
        list.add("243");
        list.add("263");
        list.add("267");
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
        list.add("33");
        list.add("37");
        list.add("41");
        list.add("45");
        list.add("48");
        list.add("52");
        list.add("56");
        list.add("60");
        list.add("64");
        list.add("68");
        list.add("72");
        list.add("76");
        list.add("79");
        list.add("83");
        list.add("87");
        list.add("91");
        list.add("95");
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
        list.add("31");
        list.add("35");
        list.add("39");
        list.add("43");
        list.add("47");
        list.add("51");
        list.add("55");
        list.add("59");
        list.add("63");
        list.add("67");
        list.add("71");
        list.add("75");
        list.add("79");
        list.add("83");
        list.add("87");
        list.add("91");
        list.add("95");
        return list;
    }

}
