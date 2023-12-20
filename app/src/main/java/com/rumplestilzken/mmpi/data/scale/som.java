package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class som extends Scale {
    @Override
    public String getDescription() {
        return "Somatic Complaints";
    }

    @Override
    public String toString() {
        return "som";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("11");
        list.add("18");
        list.add("28");
        list.add("40");
        list.add("97");
        list.add("101");
        list.add("111");
        list.add("149");
        list.add("172");
        list.add("247");
        list.add("536");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("2");
        list.add("8");
        list.add("20");
        list.add("47");
        list.add("57");
        list.add("91");
        list.add("106");
        list.add("141");
        list.add("164");
        list.add("176");
        list.add("177");
        list.add("179");
        list.add("208");
        list.add("224");
        list.add("255");
        list.add("295");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("37");
        list.add("43");
        list.add("48");
        list.add("52");
        list.add("55");
        list.add("58");
        list.add("60");
        list.add("63");
        list.add("65");
        list.add("68");
        list.add("71");
        list.add("73");
        list.add("76");
        list.add("79");
        list.add("81");
        list.add("84");
        list.add("86");
        list.add("89");
        list.add("92");
        list.add("94");
        list.add("97");
        list.add("100");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("36");
        list.add("41");
        list.add("45");
        list.add("49");
        list.add("52");
        list.add("55");
        list.add("57");
        list.add("59");
        list.add("62");
        list.add("64");
        list.add("66");
        list.add("68");
        list.add("70");
        list.add("72");
        list.add("74");
        list.add("76");
        list.add("78");
        list.add("80");
        list.add("82");
        list.add("85");
        list.add("87");
        list.add("89");
        list.add("91");
        list.add("93");
        list.add("95");
        list.add("97");
        list.add("99");
        list.add("100");
        return list;
    }

}
