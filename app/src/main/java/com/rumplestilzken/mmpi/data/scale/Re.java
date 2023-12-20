package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Re extends Scale {
    @Override
    public String getDescription() {
        return "Social Responsibility";
    }

    @Override
    public String toString() {
        return "Re";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("100");
        list.add("160");
        list.add("199");
        list.add("266");
        list.add("440");
        list.add("467");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("7");
        list.add("27");
        list.add("29");
        list.add("32");
        list.add("84");
        list.add("103");
        list.add("105");
        list.add("145");
        list.add("164");
        list.add("169");
        list.add("201");
        list.add("202");
        list.add("235");
        list.add("275");
        list.add("358");
        list.add("412");
        list.add("417");
        list.add("418");
        list.add("430");
        list.add("431");
        list.add("432");
        list.add("456");
        list.add("468");
        list.add("470");
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
        list.add("30");
        list.add("32");
        list.add("34");
        list.add("37");
        list.add("39");
        list.add("42");
        list.add("45");
        list.add("47");
        list.add("50");
        list.add("52");
        list.add("55");
        list.add("57");
        list.add("60");
        list.add("63");
        list.add("65");
        list.add("68");
        list.add("70");
        list.add("73");
        list.add("76");
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
        list.add("");
        list.add("");
        list.add("");
        list.add("30");
        list.add("32");
        list.add("35");
        list.add("38");
        list.add("41");
        list.add("44");
        list.add("47");
        list.add("50");
        list.add("53");
        list.add("56");
        list.add("59");
        list.add("62");
        list.add("65");
        list.add("68");
        list.add("71");
        list.add("74");
        list.add("77");
        return list;
    }
}
