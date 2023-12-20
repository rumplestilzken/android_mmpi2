package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class OBS extends Scale {
    @Override
    public String getDescription() {
        return "Obsessivness";
    }

    @Override
    public String toString() {
        return "OBS";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("55");
        list.add("87");
        list.add("135");
        list.add("196");
        list.add("309");
        list.add("313");
        list.add("327");
        list.add("328");
        list.add("394");
        list.add("442");
        list.add("482");
        list.add("491");
        list.add("497");
        list.add("509");
        list.add("547");
        list.add("553");
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
        list.add("33");
        list.add("37");
        list.add("41");
        list.add("44");
        list.add("47");
        list.add("50");
        list.add("53");
        list.add("56");
        list.add("59");
        list.add("63");
        list.add("66");
        list.add("70");
        list.add("73");
        list.add("77");
        list.add("80");
        list.add("84");
        list.add("87");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("32");
        list.add("37");
        list.add("41");
        list.add("44");
        list.add("46");
        list.add("48");
        list.add("50");
        list.add("53");
        list.add("56");
        list.add("59");
        list.add("63");
        list.add("67");
        list.add("71");
        list.add("75");
        list.add("79");
        list.add("83");
        list.add("87");
        return list;
    }
}
