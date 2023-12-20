package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class dem extends Scale {
    @Override
    public String getDescription() {
        return "Demoralization";
    }

    @Override
    public String toString() {
        return "dem";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("31");
        list.add("56");
        list.add("64");
        list.add("73");
        list.add("82");
        list.add("94");
        list.add("130");
        list.add("180");
        list.add("215");
        list.add("233");
        list.add("273");
        list.add("277");
        list.add("339");
        list.add("400");
        list.add("411");
        list.add("464");
        list.add("469");
        list.add("482");
        list.add("485");
        list.add("491");
        list.add("505");
        list.add("554");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("95");
        list.add("388");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("37");
        list.add("42");
        list.add("47");
        list.add("50");
        list.add("52");
        list.add("54");
        list.add("56");
        list.add("57");
        list.add("58");
        list.add("60");
        list.add("62");
        list.add("64");
        list.add("66");
        list.add("68");
        list.add("70");
        list.add("71");
        list.add("73");
        list.add("75");
        list.add("77");
        list.add("79");
        list.add("81");
        list.add("83");
        list.add("85");
        list.add("86");
        list.add("88");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("36");
        list.add("41");
        list.add("45");
        list.add("48");
        list.add("50");
        list.add("52");
        list.add("53");
        list.add("54");
        list.add("55");
        list.add("56");
        list.add("58");
        list.add("60");
        list.add("61");
        list.add("63");
        list.add("65");
        list.add("67");
        list.add("69");
        list.add("71");
        list.add("73");
        list.add("75");
        list.add("77");
        list.add("79");
        list.add("81");
        list.add("83");
        list.add("85");
        return list;
    }

}
