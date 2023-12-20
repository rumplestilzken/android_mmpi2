package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class K extends Scale {
    @Override
    public String getDescription() {
        return "Correction";
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("83");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("29");
        list.add("37");
        list.add("58");
        list.add("76");
        list.add("110");
        list.add("116");
        list.add("122");
        list.add("127");
        list.add("130");
        list.add("136");
        list.add("148");
        list.add("157");
        list.add("158");
        list.add("167");
        list.add("171");
        list.add("196");
        list.add("213");
        list.add("243");
        list.add("267");
        list.add("284");
        list.add("290");
        list.add("330");
        list.add("338");
        list.add("339");
        list.add("341");
        list.add("346");
        list.add("348");
        list.add("356");
        list.add("365");
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
        list.add("33");
        list.add("35");
        list.add("37");
        list.add("39");
        list.add("41");
        list.add("43");
        list.add("45");
        list.add("47");
        list.add("49");
        list.add("51");
        list.add("54");
        list.add("56");
        list.add("58");
        list.add("60");
        list.add("62");
        list.add("64");
        list.add("66");
        list.add("68");
        list.add("70");
        list.add("72");
        list.add("75");
        list.add("77");
        list.add("79");
        list.add("81");
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
        list.add("30");
        list.add("32");
        list.add("35");
        list.add("37");
        list.add("39");
        list.add("41");
        list.add("43");
        list.add("46");
        list.add("48");
        list.add("50");
        list.add("52");
        list.add("54");
        list.add("56");
        list.add("59");
        list.add("61");
        list.add("63");
        list.add("65");
        list.add("67");
        list.add("70");
        list.add("72");
        list.add("74");
        list.add("76");
        list.add("78");
        list.add("81");
        list.add("83");
        return list;
    }
}
