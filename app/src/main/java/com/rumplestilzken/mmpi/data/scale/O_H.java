package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class O_H extends Scale {
    @Override
    public String getDescription() {
        return "Overcontrolled Hostility";
    }

    @Override
    public String toString() {
        return "O-H";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("67");
        list.add("79");
        list.add("207");
        list.add("286");
        list.add("305");
        list.add("398");
        list.add("471");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("1");
        list.add("15");
        list.add("29");
        list.add("69");
        list.add("77");
        list.add("89");
        list.add("98");
        list.add("116");
        list.add("117");
        list.add("129");
        list.add("153");
        list.add("169");
        list.add("171");
        list.add("293");
        list.add("344");
        list.add("390");
        list.add("400");
        list.add("420");
        list.add("433");
        list.add("440");
        list.add("460");
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
        list.add("31");
        list.add("35");
        list.add("38");
        list.add("41");
        list.add("45");
        list.add("48");
        list.add("52");
        list.add("55");
        list.add("59");
        list.add("62");
        list.add("65");
        list.add("69");
        list.add("72");
        list.add("76");
        list.add("79");
        list.add("82");
        list.add("86");
        list.add("89");
        list.add("93");
        list.add("96");
        list.add("99");
        list.add("103");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();list.add("");
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
        list.add("37");
        list.add("41");
        list.add("44");
        list.add("48");
        list.add("52");
        list.add("55");
        list.add("59");
        list.add("63");
        list.add("66");
        list.add("70");
        list.add("74");
        list.add("77");
        list.add("81");
        list.add("85");
        list.add("88");
        list.add("92");
        list.add("96");
        list.add("99");
        list.add("103");
        return list;
    }
}
