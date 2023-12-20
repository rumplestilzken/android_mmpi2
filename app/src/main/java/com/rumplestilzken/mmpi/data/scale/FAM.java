package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class FAM extends Scale {
    @Override
    public String getDescription() {
        return "Family Problems";
    }

    @Override
    public String toString() {
        return "FAM";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("21");
        list.add("54");
        list.add("145");
        list.add("190");
        list.add("195");
        list.add("205");
        list.add("256");
        list.add("292");
        list.add("300");
        list.add("323");
        list.add("378");
        list.add("379");
        list.add("382");
        list.add("413");
        list.add("449");
        list.add("478");
        list.add("543");
        list.add("550");
        list.add("563");
        list.add("567");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("83");
        list.add("125");
        list.add("217");
        list.add("383");
        list.add("455");
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
        list.add("47");
        list.add("50");
        list.add("52");
        list.add("55");
        list.add("57");
        list.add("60");
        list.add("63");
        list.add("66");
        list.add("68");
        list.add("71");
        list.add("74");
        list.add("77");
        list.add("80");
        list.add("82");
        list.add("85");
        list.add("88");
        list.add("91");
        list.add("94");
        list.add("97");
        list.add("99");
        list.add("102");
        list.add("105");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("32");
        list.add("36");
        list.add("39");
        list.add("42");
        list.add("45");
        list.add("47");
        list.add("50");
        list.add("52");
        list.add("55");
        list.add("57");
        list.add("60");
        list.add("62");
        list.add("65");
        list.add("68");
        list.add("70");
        list.add("73");
        list.add("75");
        list.add("78");
        list.add("81");
        list.add("83");
        list.add("86");
        list.add("89");
        list.add("91");
        list.add("94");
        list.add("96");
        list.add("99");
        return list;
    }
}
