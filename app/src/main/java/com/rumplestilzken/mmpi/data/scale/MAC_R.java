package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class MAC_R extends Scale {
    @Override
    public String getDescription() {
        return "MacAndrew Alcoholism Scale-Revised";
    }

    @Override
    public String toString() {
        return "MAC-R";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("7");
        list.add("24");
        list.add("36");
        list.add("49");
        list.add("52");
        list.add("69");
        list.add("72");
        list.add("82");
        list.add("84");
        list.add("103");
        list.add("105");
        list.add("113");
        list.add("115");
        list.add("128");
        list.add("168");
        list.add("172");
        list.add("202");
        list.add("214");
        list.add("224");
        list.add("229");
        list.add("238");
        list.add("257");
        list.add("280");
        list.add("342");
        list.add("344");
        list.add("407");
        list.add("412");
        list.add("414");
        list.add("422");
        list.add("434");
        list.add("439");
        list.add("445");
        list.add("456");
        list.add("473");
        list.add("502");
        list.add("506");
        list.add("549");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("73");
        list.add("107");
        list.add("117");
        list.add("137");
        list.add("160");
        list.add("166");
        list.add("251");
        list.add("266");
        list.add("287");
        list.add("299");
        list.add("325");
        list.add("387");
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
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("30");
        list.add("32");
        list.add("34");
        list.add("37");
        list.add("39");
        list.add("41");
        list.add("44");
        list.add("46");
        list.add("48");
        list.add("51");
        list.add("53");
        list.add("55");
        list.add("58");
        list.add("60");
        list.add("62");
        list.add("64");
        list.add("67");
        list.add("69");
        list.add("72");
        list.add("74");
        list.add("76");
        list.add("78");
        list.add("81");
        list.add("83");
        list.add("85");
        list.add("88");
        list.add("90");
        list.add("92");
        list.add("95");
        list.add("97");
        list.add("99");
        list.add("102");
        list.add("104");
        list.add("106");
        list.add("109");
        list.add("111");
        list.add("113");
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
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("30");
        list.add("31");
        list.add("34");
        list.add("37");
        list.add("40");
        list.add("42");
        list.add("45");
        list.add("48");
        list.add("50");
        list.add("53");
        list.add("56");
        list.add("59");
        list.add("61");
        list.add("64");
        list.add("67");
        list.add("69");
        list.add("72");
        list.add("75");
        list.add("78");
        list.add("80");
        list.add("83");
        list.add("86");
        list.add("88");
        list.add("91");
        list.add("94");
        list.add("96");
        list.add("99");
        list.add("102");
        list.add("105");
        list.add("107");
        list.add("110");
        list.add("113");
        list.add("115");
        list.add("116");
        list.add("120");
        return list;
    }
}
