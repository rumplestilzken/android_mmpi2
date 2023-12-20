package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class dne extends Scale {
    @Override
    public String getDescription() {
        return "Dysfunctional Negative Emotions";
    }

    @Override
    public String toString() {
        return "dne";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("37");
        list.add("127");
        list.add("161");
        list.add("251");
        list.add("274");
        list.add("289");
        list.add("301");
        list.add("302");
        list.add("310");
        list.add("320");
        list.add("327");
        list.add("328");
        list.add("329");
        list.add("390");
        list.add("421");
        list.add("424");
        list.add("430");
        list.add("442");
        list.add("451");
        list.add("463");
        list.add("471");
        list.add("507");
        list.add("513");
        list.add("519");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("34");
        list.add("38");
        list.add("42");
        list.add("45");
        list.add("47");
        list.add("49");
        list.add("52");
        list.add("54");
        list.add("56");
        list.add("58");
        list.add("60");
        list.add("63");
        list.add("65");
        list.add("67");
        list.add("70");
        list.add("72");
        list.add("75");
        list.add("77");
        list.add("80");
        list.add("82");
        list.add("85");
        list.add("87");
        list.add("90");
        list.add("92");
        list.add("95");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("32");
        list.add("36");
        list.add("40");
        list.add("42");
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
        list.add("74");
        list.add("76");
        list.add("79");
        list.add("82");
        list.add("84");
        list.add("87");
        list.add("90");
        list.add("92");
        return list;
    }

}
