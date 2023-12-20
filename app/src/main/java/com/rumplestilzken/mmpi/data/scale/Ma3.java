package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Ma3 extends Scale {
    @Override
    public String getDescription() {
        return "Imperturbability";
    }

    @Override
    public String toString() {
        return "Ma3";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("155");
        list.add("200");
        list.add("220");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("93");
        list.add("136");
        list.add("158");
        list.add("167");
        list.add("243");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("30");
        list.add("35");
        list.add("41");
        list.add("47");
        list.add("53");
        list.add("59");
        list.add("65");
        list.add("71");
        list.add("77");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("30");
        list.add("37");
        list.add("43");
        list.add("50");
        list.add("56");
        list.add("62");
        list.add("69");
        list.add("75");
        list.add("82");
        return list;
    }
}
