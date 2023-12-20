package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class MDS extends Scale {
    @Override
    public String getDescription() {
        return "Marital Distress";
    }

    @Override
    public String toString() {
        return "MDS";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("21");
        list.add("22");
        list.add("135");
        list.add("195");
        list.add("219");
        list.add("382");
        list.add("484");
        list.add("563");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("12");
        list.add("83");
        list.add("95");
        list.add("125");
        list.add("493");
        list.add("494");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("37");
        list.add("42");
        list.add("46");
        list.add("51");
        list.add("56");
        list.add("60");
        list.add("65");
        list.add("69");
        list.add("74");
        list.add("79");
        list.add("83");
        list.add("88");
        list.add("92");
        list.add("97");
        list.add("102");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("38");
        list.add("42");
        list.add("46");
        list.add("50");
        list.add("55");
        list.add("59");
        list.add("63");
        list.add("68");
        list.add("72");
        list.add("76");
        list.add("80");
        list.add("85");
        list.add("89");
        list.add("93");
        list.add("98");
        return list;
    }
}
