package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Do extends Scale {
    @Override
    public String getDescription() {
        return "Dominance";
    }

    @Override
    public String toString() {
        return "Do";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("55");
        list.add("207");
        list.add("232");
        list.add("245");
        list.add("386");
        list.add("416");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("31");
        list.add("52");
        list.add("70");
        list.add("73");
        list.add("82");
        list.add("172");
        list.add("201");
        list.add("202");
        list.add("220");
        list.add("227");
        list.add("243");
        list.add("244");
        list.add("275");
        list.add("309");
        list.add("325");
        list.add("399");
        list.add("412");
        list.add("470");
        list.add("473");
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
        list.add("30");
        list.add("31");
        list.add("34");
        list.add("38");
        list.add("41");
        list.add("45");
        list.add("48");
        list.add("51");
        list.add("55");
        list.add("58");
        list.add("61");
        list.add("65");
        list.add("68");
        list.add("72");
        list.add("75");
        list.add("78");
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
        list.add("30");
        list.add("32");
        list.add("35");
        list.add("39");
        list.add("42");
        list.add("46");
        list.add("49");
        list.add("53");
        list.add("56");
        list.add("59");
        list.add("63");
        list.add("66");
        list.add("70");
        list.add("73");
        list.add("77");
        list.add("80");
        return list;
    }
}
