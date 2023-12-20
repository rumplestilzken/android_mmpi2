package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class R extends Scale {
    @Override
    public String getDescription() {
        return "Repression";
    }

    @Override
    public String toString() {
        return "R";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("1");
        list.add("7");
        list.add("10");
        list.add("14");
        list.add("37");
        list.add("45");
        list.add("69");
        list.add("112");
        list.add("118");
        list.add("120");
        list.add("128");
        list.add("134");
        list.add("142");
        list.add("168");
        list.add("178");
        list.add("189");
        list.add("197");
        list.add("199");
        list.add("248");
        list.add("255");
        list.add("256");
        list.add("297");
        list.add("330");
        list.add("346");
        list.add("350");
        list.add("353");
        list.add("354");
        list.add("359");
        list.add("363");
        list.add("365");
        list.add("422");
        list.add("423");
        list.add("430");
        list.add("432");
        list.add("449");
        list.add("456");
        list.add("465");
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
        list.add("30");
        list.add("32");
        list.add("34");
        list.add("36");
        list.add("39");
        list.add("41");
        list.add("43");
        list.add("45");
        list.add("47");
        list.add("50");
        list.add("52");
        list.add("54");
        list.add("56");
        list.add("58");
        list.add("61");
        list.add("63");
        list.add("65");
        list.add("67");
        list.add("69");
        list.add("72");
        list.add("74");
        list.add("76");
        list.add("81");
        list.add("83");
        list.add("85");
        list.add("87");
        list.add("89");
        list.add("92");
        list.add("94");
        list.add("96");
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
        list.add("");
        list.add("");
        list.add("");
        list.add("30");
        list.add("31");
        list.add("33");
        list.add("36");
        list.add("39");
        list.add("41");
        list.add("44");
        list.add("46");
        list.add("49");
        list.add("52");
        list.add("54");
        list.add("57");
        list.add("60");
        list.add("62");
        list.add("65");
        list.add("67");
        list.add("70");
        list.add("73");
        list.add("75");
        list.add("78");
        list.add("81");
        list.add("83");
        list.add("86");
        list.add("88");
        list.add("91");
        list.add("94");
        list.add("96");
        list.add("99");
        list.add("102");
        list.add("104");
        return list;
    }
}
