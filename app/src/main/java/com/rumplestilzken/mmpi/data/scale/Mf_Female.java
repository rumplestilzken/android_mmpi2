package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Mf_Female extends Scale {
    @Override
    public String getDescription() {
        return "Masculinity-Femininity - Female";
    }

    @Override
    public String toString() {
        return "Mf-f";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("4");
        list.add("25");
        list.add("62");
        list.add("64");
        list.add("67");
        list.add("74");
        list.add("80");
        list.add("112");
        list.add("119");
        list.add("121");
        list.add("122");
        list.add("128");
        list.add("137");
        list.add("177");
        list.add("187");
        list.add("191");
        list.add("196");
        list.add("205");
        list.add("219");
        list.add("236");
        list.add("251");
        list.add("256");
        list.add("271");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("1");
        list.add("19");
        list.add("26");
        list.add("27");
        list.add("63");
        list.add("68");
        list.add("69");
        list.add("76");
        list.add("86");
        list.add("103");
        list.add("104");
        list.add("107");
        list.add("120");
        list.add("132");
        list.add("133");
        list.add("163");
        list.add("166");
        list.add("184");
        list.add("193");
        list.add("194");
        list.add("197");
        list.add("199");
        list.add("201");
        list.add("207");
        list.add("209");
        list.add("231");
        list.add("235");
        list.add("237");
        list.add("239");
        list.add("254");
        list.add("257");
        list.add("268");
        list.add("272");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
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
        list.add("120");
        list.add("118");
        list.add("116");
        list.add("114");
        list.add("111");
        list.add("109");
        list.add("106");
        list.add("104");
        list.add("101");
        list.add("99");
        list.add("96");
        list.add("94");
        list.add("92");
        list.add("89");
        list.add("87");
        list.add("84");
        list.add("82");
        list.add("79");
        list.add("77");
        list.add("74");
        list.add("72");
        list.add("69");
        list.add("67");
        list.add("65");
        list.add("62");
        list.add("60");
        list.add("57");
        list.add("55");
        list.add("52");
        list.add("50");
        list.add("47");
        list.add("45");
        list.add("43");
        list.add("40");
        list.add("38");
        list.add("35");
        list.add("33");
        list.add("30");
        return list;
    }
}
