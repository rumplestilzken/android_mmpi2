package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Es extends Scale {
    @Override
    public String getDescription() {
        return "Ego Strength";
    }

    @Override
    public String toString() {
        return "Es";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("2");
        list.add("33");
        list.add("45");
        list.add("98");
        list.add("141");
        list.add("159");
        list.add("169");
        list.add("177");
        list.add("179");
        list.add("189");
        list.add("199");
        list.add("209");
        list.add("213");
        list.add("230");
        list.add("245");
        list.add("325");
        list.add("385");
        list.add("406");
        list.add("413");
        list.add("425");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("23");
        list.add("31");
        list.add("32");
        list.add("36");
        list.add("39");
        list.add("53");
        list.add("60");
        list.add("70");
        list.add("82");
        list.add("87");
        list.add("119");
        list.add("128");
        list.add("175");
        list.add("196");
        list.add("215");
        list.add("221");
        list.add("225");
        list.add("229");
        list.add("236");
        list.add("246");
        list.add("307");
        list.add("310");
        list.add("316");
        list.add("328");
        list.add("391");
        list.add("394");
        list.add("441");
        list.add("447");
        list.add("458");
        list.add("464");
        list.add("469");
        list.add("471");
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
        list.add("54");
        list.add("56");
        list.add("58");
        list.add("60");
        list.add("63");
        list.add("65");
        list.add("67");
        list.add("69");
        list.add("72");
        list.add("74");
        list.add("76");
        list.add("78");
        list.add("81");
        list.add("83");
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
        list.add("30");
        list.add("31");
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
        list.add("53");
        list.add("55");
        list.add("57");
        list.add("59");
        list.add("61");
        list.add("64");
        list.add("66");
        list.add("68");
        list.add("70");
        list.add("72");
        list.add("74");
        list.add("76");
        list.add("78");
        list.add("80");
        list.add("82");
        list.add("84");
        list.add("86");
        return list;
    }
}
