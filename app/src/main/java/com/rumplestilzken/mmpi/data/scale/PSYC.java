package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class PSYC extends Scale {
    @Override
    public String getDescription() {
        return "Psychoticism";
    }

    @Override
    public String toString() {
        return "PSYC";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("24");
        list.add("42");
        list.add("48");
        list.add("72");
        list.add("96");
        list.add("99");
        list.add("138");
        list.add("144");
        list.add("198");
        list.add("241");
        list.add("259");
        list.add("315");
        list.add("319");
        list.add("336");
        list.add("355");
        list.add("361");
        list.add("374");
        list.add("448");
        list.add("466");
        list.add("490");
        list.add("508");
        list.add("549");
        list.add("551");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("184");
        list.add("427");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("35");
        list.add("40");
        list.add("45");
        list.add("49");
        list.add("52");
        list.add("56");
        list.add("59");
        list.add("62");
        list.add("65");
        list.add("68");
        list.add("72");
        list.add("75");
        list.add("78");
        list.add("81");
        list.add("84");
        list.add("88");
        list.add("91");
        list.add("94");
        list.add("97");
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
        list.add("");
        list.add("35");
        list.add("41");
        list.add("46");
        list.add("50");
        list.add("53");
        list.add("56");
        list.add("60");
        list.add("63");
        list.add("66");
        list.add("69");
        list.add("72");
        list.add("75");
        list.add("78");
        list.add("81");
        list.add("84");
        list.add("87");
        list.add("90");
        list.add("93");
        list.add("96");
        list.add("99");
        list.add("103");
        list.add("106");
        list.add("109");
        list.add("112");
        list.add("115");
        list.add("118");
        return list;
    }

}
