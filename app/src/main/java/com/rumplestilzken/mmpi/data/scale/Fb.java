package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Fb extends Scale {
    @Override
    public String getDescription() {
        return "Backside F";
    }

    @Override
    public String toString() {
        return "Fb";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("281");
        list.add("291");
        list.add("303");
        list.add("311");
        list.add("317");
        list.add("319");
        list.add("322");
        list.add("323");
        list.add("329");
        list.add("332");
        list.add("333");
        list.add("334");
        list.add("387");
        list.add("395");
        list.add("407");
        list.add("431");
        list.add("450");
        list.add("454");
        list.add("463");
        list.add("468");
        list.add("476");
        list.add("478");
        list.add("484");
        list.add("489");
        list.add("506");
        list.add("516");
        list.add("517");
        list.add("520");
        list.add("524");
        list.add("525");
        list.add("526");
        list.add("528");
        list.add("530");
        list.add("539");
        list.add("540");
        list.add("544");
        list.add("555");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("383");
        list.add("404");
        list.add("501");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("42");
        list.add("46");
        list.add("51");
        list.add("55");
        list.add("59");
        list.add("63");
        list.add("67");
        list.add("71");
        list.add("75");
        list.add("79");
        list.add("83");
        list.add("87");
        list.add("92");
        list.add("96");
        list.add("100");
        list.add("104");
        list.add("108");
        list.add("112");
        list.add("116");
        list.add("120");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("42");
        list.add("46");
        list.add("50");
        list.add("54");
        list.add("58");
        list.add("62");
        list.add("66");
        list.add("70");
        list.add("74");
        list.add("77");
        list.add("81");
        list.add("85");
        list.add("89");
        list.add("93");
        list.add("97");
        list.add("101");
        list.add("105");
        list.add("108");
        list.add("112");
        list.add("116");
        list.add("120");
        return list;
    }
}
