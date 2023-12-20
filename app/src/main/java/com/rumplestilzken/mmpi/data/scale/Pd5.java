package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Pd5 extends Scale {
    @Override
    public String getDescription() {
        return "Self-alienation";
    }

    @Override
    public String toString() {
        return "Pd5";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("31");
        list.add("32");
        list.add("52");
        list.add("56");
        list.add("71");
        list.add("82");
        list.add("89");
        list.add("94");
        list.add("113");
        list.add("264");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("9");
        list.add("95");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("34");
        list.add("38");
        list.add("43");
        list.add("48");
        list.add("53");
        list.add("58");
        list.add("63");
        list.add("67");
        list.add("72");
        list.add("77");
        list.add("82");
        list.add("87");
        list.add("91");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("34");
        list.add("39");
        list.add("43");
        list.add("48");
        list.add("53");
        list.add("58");
        list.add("63");
        list.add("68");
        list.add("72");
        list.add("77");
        list.add("82");
        list.add("87");
        list.add("92");
        return list;
    }
}
