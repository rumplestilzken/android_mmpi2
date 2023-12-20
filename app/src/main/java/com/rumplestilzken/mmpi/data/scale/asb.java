package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class asb extends Scale {
    @Override
    public String getDescription() {
        return "Antisocial behavior";
    }

    @Override
    public String toString() {
        return "asb";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("21");
        list.add("35");
        list.add("84");
        list.add("105");
        list.add("202");
        list.add("240");
        list.add("264");
        list.add("362");
        list.add("379");
        list.add("412");
        list.add("431");
        list.add("487");
        list.add("489");
        list.add("511");
        list.add("540");
        list.add("548");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("34");
        list.add("83");
        list.add("160");
        list.add("266");
        list.add("429");
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
        list.add("49");
        list.add("52");
        list.add("54");
        list.add("57");
        list.add("59");
        list.add("62");
        list.add("65");
        list.add("68");
        list.add("71");
        list.add("74");
        list.add("77");
        list.add("80");
        list.add("83");
        list.add("86");
        list.add("89");
        list.add("92");
        list.add("95");
        list.add("98");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("35");
        list.add("40");
        list.add("44");
        list.add("48");
        list.add("52");
        list.add("55");
        list.add("58");
        list.add("60");
        list.add("63");
        list.add("66");
        list.add("69");
        list.add("71");
        list.add("74");
        list.add("77");
        list.add("80");
        list.add("83");
        list.add("85");
        list.add("88");
        list.add("91");
        list.add("94");
        list.add("96");
        list.add("99");
        list.add("100");
        return list;
    }

}
