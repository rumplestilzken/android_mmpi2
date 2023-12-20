package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class SOD extends Scale {
    @Override
    public String getDescription() {
        return "Social Discomfort";
    }

    @Override
    public String toString() {
        return "SOD";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("46");
        list.add("158");
        list.add("167");
        list.add("185");
        list.add("265");
        list.add("275");
        list.add("281");
        list.add("337");
        list.add("349");
        list.add("367");
        list.add("479");
        list.add("480");
        list.add("515");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("49");
        list.add("86");
        list.add("262");
        list.add("280");
        list.add("321");
        list.add("340");
        list.add("353");
        list.add("359");
        list.add("360");
        list.add("363");
        list.add("370");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("32");
        list.add("35");
        list.add("39");
        list.add("41");
        list.add("43");
        list.add("45");
        list.add("47");
        list.add("49");
        list.add("50");
        list.add("52");
        list.add("54");
        list.add("55");
        list.add("58");
        list.add("60");
        list.add("63");
        list.add("65");
        list.add("68");
        list.add("71");
        list.add("73");
        list.add("76");
        list.add("78");
        list.add("81");
        list.add("84");
        list.add("86");
        list.add("89");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("32");
        list.add("35");
        list.add("39");
        list.add("41");
        list.add("44");
        list.add("46");
        list.add("48");
        list.add("49");
        list.add("51");
        list.add("52");
        list.add("54");
        list.add("56");
        list.add("58");
        list.add("60");
        list.add("63");
        list.add("65");
        list.add("68");
        list.add("70");
        list.add("72");
        list.add("75");
        list.add("77");
        list.add("80");
        list.add("82");
        list.add("84");
        list.add("87");
        return list;
    }
}
