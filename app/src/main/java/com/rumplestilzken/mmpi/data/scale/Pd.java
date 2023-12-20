package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Pd extends Scale {
    @Override
    public String getDescription() {
        return "Psychopathic Deviate";
    }

    @Override
    public String toString() {
        return "Pd";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("17");
        list.add("21");
        list.add("22");
        list.add("31");
        list.add("32");
        list.add("35");
        list.add("42");
        list.add("52");
        list.add("54");
        list.add("56");
        list.add("71");
        list.add("82");
        list.add("89");
        list.add("94");
        list.add("99");
        list.add("105");
        list.add("113");
        list.add("195");
        list.add("202");
        list.add("219");
        list.add("225");
        list.add("259");
        list.add("264");
        list.add("288");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("9");
        list.add("12");
        list.add("34");
        list.add("70");
        list.add("79");
        list.add("83");
        list.add("95");
        list.add("122");
        list.add("125");
        list.add("129");
        list.add("143");
        list.add("157");
        list.add("158");
        list.add("160");
        list.add("167");
        list.add("171");
        list.add("185");
        list.add("209");
        list.add("214");
        list.add("217");
        list.add("226");
        list.add("243");
        list.add("261");
        list.add("263");
        list.add("266");
        list.add("267");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("0.4");
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
        list.add("33");
        list.add("34");
        list.add("35");
        list.add("37");
        list.add("39");
        list.add("40");
        list.add("42");
        list.add("44");
        list.add("46");
        list.add("48");
        list.add("50");
        list.add("52");
        list.add("54");
        list.add("57");
        list.add("59");
        list.add("62");
        list.add("64");
        list.add("67");
        list.add("69");
        list.add("72");
        list.add("74");
        list.add("77");
        list.add("79");
        list.add("82");
        list.add("84");
        list.add("87");
        list.add("90");
        list.add("92");
        list.add("95");
        list.add("97");
        list.add("100");
        list.add("102");
        list.add("105");
        list.add("107");
        list.add("110");
        list.add("112");
        list.add("115");
        list.add("117");
        list.add("120");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("0.4");
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
        list.add("36");
        list.add("37");
        list.add("39");
        list.add("41");
        list.add("43");
        list.add("45");
        list.add("47");
        list.add("49");
        list.add("51");
        list.add("53");
        list.add("55");
        list.add("58");
        list.add("60");
        list.add("63");
        list.add("66");
        list.add("68");
        list.add("71");
        list.add("73");
        list.add("76");
        list.add("79");
        list.add("81");
        list.add("84");
        list.add("87");
        list.add("89");
        list.add("92");
        list.add("94");
        list.add("97");
        list.add("100");
        list.add("102");
        list.add("105");
        list.add("107");
        list.add("110");
        list.add("113");
        list.add("115");
        list.add("118");
        list.add("120");
        return list;
    }
}
