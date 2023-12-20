package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Ma_S extends Scale {
    @Override
    public String getDescription() {
        return "Hypomania, Subtle";
    }

    @Override
    public String toString() {
        return "MA-s";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("13");
        list.add("21");
        list.add("55");
        list.add("98");
        list.add("113");
        list.add("122");
        list.add("131");
        list.add("169");
        list.add("200");
        list.add("206");
        list.add("211");
        list.add("212");
        list.add("220");
        list.add("244");
        list.add("248");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("88");
        list.add("93");
        list.add("136");
        list.add("154");
        list.add("158");
        list.add("167");
        list.add("243");
        list.add("263");
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
        list.add("31");
        list.add("35");
        list.add("39");
        list.add("42");
        list.add("46");
        list.add("50");
        list.add("54");
        list.add("57");
        list.add("61");
        list.add("65");
        list.add("69");
        list.add("72");
        list.add("76");
        list.add("80");
        list.add("83");
        list.add("87");
        list.add("91");
        list.add("95");
        list.add("98");
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
        list.add("32");
        list.add("36");
        list.add("40");
        list.add("44");
        list.add("47");
        list.add("51");
        list.add("55");
        list.add("59");
        list.add("63");
        list.add("67");
        list.add("70");
        list.add("74");
        list.add("78");
        list.add("82");
        list.add("86");
        list.add("90");
        list.add("93");
        list.add("97");
        list.add("101");
        return list;
    }

}
