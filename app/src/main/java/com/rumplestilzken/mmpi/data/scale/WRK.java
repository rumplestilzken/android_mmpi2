package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class WRK extends Scale {
    @Override
    public String getDescription() {
        return "Work Interference";
    }

    @Override
    public String toString() {
        return "WRK";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("15");
        list.add("17");
        list.add("31");
        list.add("54");
        list.add("73");
        list.add("98");
        list.add("135");
        list.add("233");
        list.add("243");
        list.add("299");
        list.add("302");
        list.add("339");
        list.add("364");
        list.add("368");
        list.add("394");
        list.add("409");
        list.add("428");
        list.add("445");
        list.add("464");
        list.add("491");
        list.add("505");
        list.add("509");
        list.add("517");
        list.add("525");
        list.add("545");
        list.add("554");
        list.add("559");
        list.add("566");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("10");
        list.add("108");
        list.add("318");
        list.add("521");
        list.add("561");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("33");
        list.add("36");
        list.add("39");
        list.add("41");
        list.add("44");
        list.add("46");
        list.add("48");
        list.add("50");
        list.add("52");
        list.add("54");
        list.add("56");
        list.add("57");
        list.add("59");
        list.add("61");
        list.add("63");
        list.add("65");
        list.add("67");
        list.add("68");
        list.add("70");
        list.add("72");
        list.add("74");
        list.add("76");
        list.add("78");
        list.add("79");
        list.add("81");
        list.add("83");
        list.add("85");
        list.add("87");
        list.add("89");
        list.add("90");
        list.add("92");
        list.add("94");
        list.add("96");
        list.add("98");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("31");
        list.add("34");
        list.add("37");
        list.add("40");
        list.add("43");
        list.add("45");
        list.add("46");
        list.add("48");
        list.add("50");
        list.add("51");
        list.add("52");
        list.add("54");
        list.add("55");
        list.add("57");
        list.add("59");
        list.add("61");
        list.add("63");
        list.add("65");
        list.add("67");
        list.add("69");
        list.add("70");
        list.add("73");
        list.add("76");
        list.add("78");
        list.add("80");
        list.add("82");
        list.add("84");
        list.add("86");
        list.add("88");
        list.add("90");
        list.add("92");
        list.add("95");
        list.add("97");
        list.add("99");
        return list;
    }
}
