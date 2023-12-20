package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class A extends Scale {
    @Override
    public String getDescription() {
        return "Anxiety";
    }

    @Override
    public String toString() {
        return "A";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("31");
        list.add("38");
        list.add("56");
        list.add("65");
        list.add("82");
        list.add("127");
        list.add("135");
        list.add("215");
        list.add("233");
        list.add("243");
        list.add("251");
        list.add("273");
        list.add("277");
        list.add("289");
        list.add("301");
        list.add("309");
        list.add("310");
        list.add("311");
        list.add("325");
        list.add("328");
        list.add("338");
        list.add("339");
        list.add("341");
        list.add("347");
        list.add("390");
        list.add("391");
        list.add("394");
        list.add("400");
        list.add("408");
        list.add("411");
        list.add("415");
        list.add("421");
        list.add("428");
        list.add("442");
        list.add("448");
        list.add("451");
        list.add("464");
        list.add("469");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("388");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("36");
        list.add("37");
        list.add("39");
        list.add("40");
        list.add("42");
        list.add("43");
        list.add("44");
        list.add("46");
        list.add("47");
        list.add("49");
        list.add("50");
        list.add("51");
        list.add("53");
        list.add("54");
        list.add("56");
        list.add("57");
        list.add("58");
        list.add("60");
        list.add("61");
        list.add("63");
        list.add("64");
        list.add("65");
        list.add("67");
        list.add("68");
        list.add("70");
        list.add("71");
        list.add("73");
        list.add("74");
        list.add("75");
        list.add("77");
        list.add("78");
        list.add("80");
        list.add("81");
        list.add("82");
        list.add("84");
        list.add("85");
        list.add("87");
        list.add("88");
        list.add("89");
        list.add("91");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("35");
        list.add("37");
        list.add("38");
        list.add("39");
        list.add("40");
        list.add("42");
        list.add("43");
        list.add("44");
        list.add("45");
        list.add("47");
        list.add("48");
        list.add("49");
        list.add("50");
        list.add("52");
        list.add("53");
        list.add("54");
        list.add("56");
        list.add("57");
        list.add("58");
        list.add("59");
        list.add("61");
        list.add("62");
        list.add("63");
        list.add("64");
        list.add("66");
        list.add("67");
        list.add("68");
        list.add("69");
        list.add("71");
        list.add("72");
        list.add("73");
        list.add("74");
        list.add("76");
        list.add("77");
        list.add("76");
        list.add("80");
        list.add("81");
        list.add("82");
        list.add("83");
        list.add("85");
        return list;
    }
}
