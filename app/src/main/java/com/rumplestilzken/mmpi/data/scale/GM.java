package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class GM extends Scale {
    @Override
    public String getDescription() {
        return "Masculine Gender Role";
    }

    @Override
    public String toString() {
        return "GM";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("8");
        list.add("20");
        list.add("143");
        list.add("152");
        list.add("159");
        list.add("163");
        list.add("176");
        list.add("199");
        list.add("214");
        list.add("237");
        list.add("321");
        list.add("331");
        list.add("350");
        list.add("385");
        list.add("388");
        list.add("401");
        list.add("440");
        list.add("462");
        list.add("467");
        list.add("474");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("4");
        list.add("23");
        list.add("44");
        list.add("64");
        list.add("70");
        list.add("73");
        list.add("74");
        list.add("80");
        list.add("100");
        list.add("137");
        list.add("146");
        list.add("187");
        list.add("289");
        list.add("351");
        list.add("364");
        list.add("392");
        list.add("395");
        list.add("435");
        list.add("438");
        list.add("441");
        list.add("469");
        list.add("471");
        list.add("498");
        list.add("509");
        list.add("519");
        list.add("532");
        list.add("536");
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
        list.add("");
        list.add("30");
        list.add("31");
        list.add("34");
        list.add("36");
        list.add("38");
        list.add("40");
        list.add("42");
        list.add("45");
        list.add("47");
        list.add("49");
        list.add("51");
        list.add("53");
        list.add("56");
        list.add("58");
        list.add("60");
        list.add("62");
        list.add("64");
        list.add("66");
        list.add("69");
        list.add("71");
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
        list.add("");
        list.add("");
        list.add("30");
        list.add("32");
        list.add("33");
        list.add("35");
        list.add("36");
        list.add("38");
        list.add("40");
        list.add("41");
        list.add("43");
        list.add("44");
        list.add("46");
        list.add("47");
        list.add("49");
        list.add("50");
        list.add("52");
        list.add("53");
        list.add("55");
        list.add("56");
        list.add("58");
        list.add("59");
        list.add("61");
        list.add("63");
        list.add("64");
        list.add("66");
        list.add("67");
        list.add("69");
        list.add("70");
        list.add("72");
        list.add("73");
        list.add("75");
        list.add("76");
        list.add("78");
        return list;
    }

}
