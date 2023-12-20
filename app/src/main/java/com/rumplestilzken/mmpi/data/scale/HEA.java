package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class HEA extends Scale {
    @Override
    public String getDescription() {
        return "Health Concerns";
    }

    @Override
    public String toString() {
        return "HEA";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("11");
        list.add("18");
        list.add("28");
        list.add("36");
        list.add("40");
        list.add("44");
        list.add("53");
        list.add("59");
        list.add("97");
        list.add("101");
        list.add("111");
        list.add("149");
        list.add("175");
        list.add("247");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("20");
        list.add("33");
        list.add("45");
        list.add("47");
        list.add("57");
        list.add("91");
        list.add("117");
        list.add("118");
        list.add("141");
        list.add("142");
        list.add("159");
        list.add("164");
        list.add("176");
        list.add("179");
        list.add("181");
        list.add("194");
        list.add("204");
        list.add("224");
        list.add("249");
        list.add("255");
        list.add("295");
        list.add("404");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("33");
        list.add("37");
        list.add("41");
        list.add("44");
        list.add("48");
        list.add("51");
        list.add("53");
        list.add("56");
        list.add("58");
        list.add("60");
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
        list.add("81");
        list.add("83");
        list.add("85");
        list.add("87");
        list.add("89");
        list.add("91");
        list.add("93");
        list.add("95");
        list.add("97");
        list.add("99");
        list.add("101");
        list.add("103");
        list.add("105");
        list.add("106");
        list.add("108");
        list.add("110");
        list.add("112");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("32");
        list.add("36");
        list.add("40");
        list.add("43");
        list.add("46");
        list.add("49");
        list.add("51");
        list.add("53");
        list.add("55");
        list.add("57");
        list.add("59");
        list.add("61");
        list.add("63");
        list.add("64");
        list.add("66");
        list.add("68");
        list.add("70");
        list.add("72");
        list.add("74");
        list.add("76");
        list.add("77");
        list.add("79");
        list.add("81");
        list.add("83");
        list.add("85");
        list.add("87");
        list.add("89");
        list.add("90");
        list.add("92");
        list.add("94");
        list.add("96");
        list.add("98");
        list.add("100");
        list.add("101");
        list.add("103");
        list.add("105");
        list.add("107");
        return list;
    }


}
