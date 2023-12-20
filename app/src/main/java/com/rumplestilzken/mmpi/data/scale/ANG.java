package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class ANG extends Scale {
    @Override
    public String getDescription() {
        return "Anger";
    }

    @Override
    public String toString() {
        return "ANG";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("29");
        list.add("37");
        list.add("116");
        list.add("134");
        list.add("302");
        list.add("389");
        list.add("410");
        list.add("414");
        list.add("430");
        list.add("461");
        list.add("486");
        list.add("513");
        list.add("540");
        list.add("542");
        list.add("548");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("564");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("32");
        list.add("36");
        list.add("40");
        list.add("43");
        list.add("46");
        list.add("48");
        list.add("50");
        list.add("53");
        list.add("56");
        list.add("59");
        list.add("63");
        list.add("67");
        list.add("70");
        list.add("74");
        list.add("78");
        list.add("82");
        list.add("86");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("31");
        list.add("36");
        list.add("39");
        list.add("42");
        list.add("45");
        list.add("47");
        list.add("50");
        list.add("53");
        list.add("56");
        list.add("60");
        list.add("64");
        list.add("68");
        list.add("72");
        list.add("76");
        list.add("80");
        list.add("84");
        list.add("88");
        return list;
    }
}
