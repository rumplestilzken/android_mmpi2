package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Ma extends Scale {
    @Override
    public String getDescription() {
        return "Hypomania";
    }

    @Override
    public String toString() {
        return "Ma";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("13");
        list.add("15");
        list.add("21");
        list.add("23");
        list.add("50");
        list.add("55");
        list.add("61");
        list.add("85");
        list.add("87");
        list.add("98");
        list.add("113");
        list.add("122");
        list.add("131");
        list.add("145");
        list.add("155");
        list.add("168");
        list.add("169");
        list.add("182");
        list.add("190");
        list.add("200");
        list.add("205");
        list.add("206");
        list.add("211");
        list.add("212");
        list.add("218");
        list.add("220");
        list.add("227");
        list.add("229");
        list.add("238");
        list.add("242");
        list.add("244");
        list.add("248");
        list.add("250");
        list.add("253");
        list.add("269");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("88");
        list.add("93");
        list.add("100");
        list.add("106");
        list.add("107");
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
        list.add("0.2");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("30");
        list.add("31");
        list.add("33");
        list.add("35");
        list.add("36");
        list.add("38");
        list.add("39");
        list.add("41");
        list.add("43");
        list.add("45");
        list.add("47");
        list.add("49");
        list.add("51");
        list.add("53");
        list.add("56");
        list.add("59");
        list.add("62");
        list.add("65");
        list.add("59");
        list.add("72");
        list.add("75");
        list.add("78");
        list.add("81");
        list.add("82");
        list.add("88");
        list.add("91");
        list.add("94");
        list.add("98");
        list.add("101");
        list.add("104");
        list.add("107");
        list.add("110");
        list.add("114");
        list.add("117");
        list.add("120");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("0.2");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("30");
        list.add("31");
        list.add("33");
        list.add("35");
        list.add("37");
        list.add("39");
        list.add("41");
        list.add("43");
        list.add("45");
        list.add("47");
        list.add("49");
        list.add("51");
        list.add("53");
        list.add("56");
        list.add("59");
        list.add("62");
        list.add("65");
        list.add("68");
        list.add("71");
        list.add("74");
        list.add("76");
        list.add("79");
        list.add("82");
        list.add("85");
        list.add("88");
        list.add("91");
        list.add("94");
        list.add("97");
        list.add("100");
        list.add("103");
        list.add("106");
        list.add("109");
        list.add("112");
        list.add("115");
        list.add("118");
        list.add("120");
        return list;
    }
}
