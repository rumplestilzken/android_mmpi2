package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class S extends Scale {
    @Override
    public String getDescription() {
        return "Superlative Self-Presentation";
    }

    @Override
    public String toString() {
        return "S";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("121");
        list.add("148");
        list.add("184");
        list.add("194");
        list.add("534");
        list.add("560");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("15");
        list.add("50");
        list.add("58");
        list.add("76");
        list.add("81");
        list.add("87");
        list.add("89");
        list.add("104");
        list.add("110");
        list.add("120");
        list.add("123");
        list.add("154");
        list.add("196");
        list.add("205");
        list.add("213");
        list.add("225");
        list.add("264");
        list.add("279");
        list.add("284");
        list.add("290");
        list.add("302");
        list.add("337");
        list.add("341");
        list.add("346");
        list.add("352");
        list.add("373");
        list.add("374");
        list.add("403");
        list.add("420");
        list.add("423");
        list.add("428");
        list.add("430");
        list.add("433");
        list.add("442");
        list.add("445");
        list.add("449");
        list.add("461");
        list.add("486");
        list.add("487");
        list.add("523");
        list.add("538");
        list.add("542");
        list.add("545");
        list.add("547");
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
        list.add("30");
        list.add("32");
        list.add("33");
        list.add("34");
        list.add("35");
        list.add("36");
        list.add("37");
        list.add("38");
        list.add("40");
        list.add("41");
        list.add("42");
        list.add("43");
        list.add("44");
        list.add("45");
        list.add("47");
        list.add("48");
        list.add("49");
        list.add("50");
        list.add("51");
        list.add("52");
        list.add("53");
        list.add("55");
        list.add("56");
        list.add("57");
        list.add("58");
        list.add("59");
        list.add("60");
        list.add("61");
        list.add("63");
        list.add("64");
        list.add("65");
        list.add("66");
        list.add("67");
        list.add("68");
        list.add("70");
        list.add("71");
        list.add("72");
        list.add("73");
        list.add("74");
        list.add("75");
        list.add("76");
        list.add("78");
        list.add("79");
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
        list.add("30");
        list.add("31");
        list.add("33");
        list.add("34");
        list.add("35");
        list.add("36");
        list.add("37");
        list.add("39");
        list.add("40");
        list.add("41");
        list.add("42");
        list.add("43");
        list.add("45");
        list.add("46");
        list.add("47");
        list.add("48");
        list.add("49");
        list.add("51");
        list.add("52");
        list.add("53");
        list.add("54");
        list.add("55");
        list.add("57");
        list.add("58");
        list.add("59");
        list.add("60");
        list.add("61");
        list.add("63");
        list.add("64");
        list.add("65");
        list.add("66");
        list.add("68");
        list.add("69");
        list.add("70");
        list.add("71");
        list.add("72");
        list.add("74");
        list.add("75");
        list.add("76");
        list.add("77");
        list.add("78");
        list.add("80");
        return list;
    }
}
