package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class abx extends Scale {
    @Override
    public String getDescription() {
        return "Aberrant Experiences";
    }

    @Override
    public String toString() {
        return "abx";
    }
    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("32");
        list.add("60");
        list.add("72");
        list.add("96");
        list.add("168");
        list.add("182");
        list.add("198");
        list.add("229");
        list.add("296");
        list.add("298");
        list.add("307");
        list.add("311");
        list.add("316");
        list.add("319");
        list.add("466");
        list.add("508");
        list.add("551");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("427");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("39");
        list.add("47");
        list.add("52");
        list.add("56");
        list.add("59");
        list.add("63");
        list.add("66");
        list.add("70");
        list.add("73");
        list.add("76");
        list.add("80");
        list.add("83");
        list.add("87");
        list.add("90");
        list.add("93");
        list.add("97");
        list.add("100");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("39");
        list.add("47");
        list.add("52");
        list.add("56");
        list.add("60");
        list.add("63");
        list.add("66");
        list.add("69");
        list.add("73");
        list.add("76");
        list.add("79");
        list.add("82");
        list.add("85");
        list.add("89");
        list.add("92");
        list.add("95");
        list.add("98");
        list.add("100");
        return list;
    }



}
