package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class GF extends Scale {
    @Override
    public String getDescription() {
        return "Feminine Gender Role";
    }

    @Override
    public String toString() {
        return "GF";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("62");
        list.add("67");
        list.add("119");
        list.add("121");
        list.add("128");
        list.add("263");
        list.add("266");
        list.add("353");
        list.add("384");
        list.add("426");
        list.add("449");
        list.add("456");
        list.add("475");
        list.add("552");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("1");
        list.add("27");
        list.add("63");
        list.add("68");
        list.add("79");
        list.add("84");
        list.add("105");
        list.add("123");
        list.add("133");
        list.add("155");
        list.add("197");
        list.add("201");
        list.add("203");
        list.add("220");
        list.add("231");
        list.add("238");
        list.add("239");
        list.add("250");
        list.add("257");
        list.add("264");
        list.add("272");
        list.add("287");
        list.add("406");
        list.add("417");
        list.add("465");
        list.add("477");
        list.add("487");
        list.add("510");
        list.add("511");
        list.add("537");
        list.add("548");
        list.add("550");
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
        list.add("30");
        list.add("32");
        list.add("34");
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
        list.add("71");
        list.add("73");
        list.add("75");
        list.add("77");
        list.add("79");
        list.add("81");
        list.add("83");
        list.add("85");
        list.add("88");
        list.add("90");
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
        list.add("33");
        list.add("35");
        list.add("38");
        list.add("40");
        list.add("43");
        list.add("46");
        list.add("48");
        list.add("51");
        list.add("53");
        list.add("56");
        list.add("59");
        list.add("61");
        list.add("64");
        list.add("66");
        list.add("69");
        list.add("71");
        return list;
    }

}
