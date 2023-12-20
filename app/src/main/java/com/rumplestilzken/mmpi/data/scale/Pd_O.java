package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Pd_O extends Scale {
    @Override
    public String getDescription() {
        return "Psychopathic Deviate, Obvious";
    }

    @Override
    public String toString() {
        return "Pd-O";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("17");
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
        list.add("94");
        list.add("99");
        list.add("105");
        list.add("195");
        list.add("202");
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
        list.add("79");
        list.add("95");
        list.add("125");
        list.add("261");
        list.add("266");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("34");
        list.add("36");
        list.add("39");
        list.add("42");
        list.add("44");
        list.add("47");
        list.add("50");
        list.add("52");
        list.add("55");
        list.add("58");
        list.add("60");
        list.add("63");
        list.add("66");
        list.add("68");
        list.add("71");
        list.add("74");
        list.add("76");
        list.add("79");
        list.add("82");
        list.add("84");
        list.add("87");
        list.add("90");
        list.add("92");
        list.add("95");
        list.add("98");
        list.add("100");
        list.add("103");
        list.add("106");
        list.add("108");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("35");
        list.add("38");
        list.add("41");
        list.add("44");
        list.add("46");
        list.add("49");
        list.add("52");
        list.add("54");
        list.add("57");
        list.add("60");
        list.add("62");
        list.add("65");
        list.add("68");
        list.add("70");
        list.add("73");
        list.add("76");
        list.add("79");
        list.add("81");
        list.add("84");
        list.add("87");
        list.add("89");
        list.add("92");
        list.add("95");
        list.add("97");
        list.add("100");
        list.add("103");
        list.add("105");
        list.add("108");
        list.add("111");
        return list;
    }

}
