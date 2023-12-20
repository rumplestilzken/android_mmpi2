package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class LSE extends Scale {
    @Override
    public String getDescription() {
        return "Low Self-esteem";
    }

    @Override
    public String toString() {
        return "LSE";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("70");
        list.add("73");
        list.add("130");
        list.add("235");
        list.add("326");
        list.add("369");
        list.add("376");
        list.add("380");
        list.add("411");
        list.add("421");
        list.add("450");
        list.add("457");
        list.add("475");
        list.add("476");
        list.add("483");
        list.add("485");
        list.add("503");
        list.add("504");
        list.add("519");
        list.add("526");
        list.add("562");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("61");
        list.add("78");
        list.add("109");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("35");
        list.add("41");
        list.add("45");
        list.add("48");
        list.add("51");
        list.add("53");
        list.add("55");
        list.add("57");
        list.add("59");
        list.add("62");
        list.add("64");
        list.add("67");
        list.add("70");
        list.add("72");
        list.add("75");
        list.add("77");
        list.add("80");
        list.add("83");
        list.add("85");
        list.add("88");
        list.add("91");
        list.add("93");
        list.add("96");
        list.add("98");
        list.add("101");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("35");
        list.add("40");
        list.add("44");
        list.add("47");
        list.add("49");
        list.add("51");
        list.add("52");
        list.add("54");
        list.add("55");
        list.add("57");
        list.add("60");
        list.add("62");
        list.add("65");
        list.add("68");
        list.add("70");
        list.add("73");
        list.add("76");
        list.add("78");
        list.add("81");
        list.add("84");
        list.add("86");
        list.add("89");
        list.add("92");
        list.add("94");
        list.add("97");
        return list;
    }
}
