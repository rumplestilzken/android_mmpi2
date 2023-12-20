package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Hy_O extends Scale {
    @Override
    public String getDescription() {
        return "Hysteria, Obvious";
    }

    @Override
    public String toString() {
        return "Hy-O";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("11");
        list.add("18");
        list.add("31");
        list.add("39");
        list.add("40");
        list.add("44");
        list.add("65");
        list.add("101");
        list.add("166");
        list.add("172");
        list.add("175");
        list.add("218");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("2");
        list.add("3");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("45");
        list.add("47");
        list.add("91");
        list.add("95");
        list.add("115");
        list.add("125");
        list.add("141");
        list.add("152");
        list.add("159");
        list.add("164");
        list.add("173");
        list.add("179");
        list.add("208");
        list.add("224");
        list.add("249");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("37");
        list.add("40");
        list.add("42");
        list.add("45");
        list.add("48");
        list.add("51");
        list.add("53");
        list.add("56");
        list.add("59");
        list.add("62");
        list.add("64");
        list.add("67");
        list.add("70");
        list.add("73");
        list.add("76");
        list.add("78");
        list.add("81");
        list.add("84");
        list.add("87");
        list.add("89");
        list.add("92");
        list.add("95");
        list.add("98");
        list.add("100");
        list.add("103");
        list.add("106");
        list.add("109");
        list.add("111");
        list.add("114");
        list.add("117");
        list.add("120");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("37");
        list.add("39");
        list.add("41");
        list.add("44");
        list.add("46");
        list.add("48");
        list.add("51");
        list.add("53");
        list.add("56");
        list.add("58");
        list.add("60");
        list.add("63");
        list.add("65");
        list.add("67");
        list.add("70");
        list.add("72");
        list.add("75");
        list.add("77");
        list.add("79");
        list.add("82");
        list.add("84");
        list.add("86");
        list.add("89");
        list.add("91");
        list.add("93");
        list.add("96");
        list.add("98");
        list.add("101");
        list.add("103");
        list.add("105");
        list.add("108");
        list.add("110");
        list.add("112");
        return list;
    }

}
