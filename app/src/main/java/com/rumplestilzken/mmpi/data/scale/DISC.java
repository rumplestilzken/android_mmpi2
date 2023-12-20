package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class DISC extends Scale {
    @Override
    public String getDescription() {
        return "Disconstraint";
    }

    @Override
    public String toString() {
        return "DISC";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("35");
        list.add("84");
        list.add("88");
        list.add("103");
        list.add("105");
        list.add("123");
        list.add("209");
        list.add("222");
        list.add("250");
        list.add("284");
        list.add("344");
        list.add("362");
        list.add("385");
        list.add("412");
        list.add("417");
        list.add("418");
        list.add("431");
        list.add("477");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("34");
        list.add("100");
        list.add("121");
        list.add("126");
        list.add("154");
        list.add("263");
        list.add("266");
        list.add("309");
        list.add("351");
        list.add("402");
        list.add("497");
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
        list.add("30");
        list.add("31");
        list.add("33");
        list.add("35");
        list.add("37");
        list.add("39");
        list.add("41");
        list.add("42");
        list.add("44");
        list.add("46");
        list.add("49");
        list.add("51");
        list.add("54");
        list.add("57");
        list.add("60");
        list.add("64");
        list.add("67");
        list.add("71");
        list.add("75");
        list.add("78");
        list.add("82");
        list.add("82");
        list.add("89");
        list.add("93");
        list.add("96");
        list.add("100");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("");
        list.add("");
        list.add("30");
        list.add("31");
        list.add("34");
        list.add("37");
        list.add("39");
        list.add("42");
        list.add("44");
        list.add("46");
        list.add("49");
        list.add("51");
        list.add("54");
        list.add("56");
        list.add("60");
        list.add("63");
        list.add("66");
        list.add("69");
        list.add("73");
        list.add("76");
        list.add("79");
        list.add("83");
        list.add("86");
        list.add("89");
        list.add("93");
        list.add("96");
        list.add("99");
        list.add("102");
        list.add("106");
        list.add("109");
        return list;
    }

}
