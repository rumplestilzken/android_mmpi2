package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class per extends Scale {
    @Override
    public String getDescription() {
        return "Ideas of Persecution";
    }

    @Override
    public String toString() {
        return "per";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("24");
        list.add("42");
        list.add("99");
        list.add("138");
        list.add("144");
        list.add("145");
        list.add("162");
        list.add("216");
        list.add("228");
        list.add("259");
        list.add("333");
        list.add("336");
        list.add("355");
        list.add("361");
        list.add("484");
        list.add("490");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("314");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("41");
        list.add("56");
        list.add("62");
        list.add("65");
        list.add("67");
        list.add("70");
        list.add("73");
        list.add("76");
        list.add("79");
        list.add("82");
        list.add("85");
        list.add("88");
        list.add("90");
        list.add("93");
        list.add("96");
        list.add("99");
        list.add("100");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("43");
        list.add("58");
        list.add("64");
        list.add("67");
        list.add("70");
        list.add("73");
        list.add("76");
        list.add("79");
        list.add("82");
        list.add("85");
        list.add("88");
        list.add("91");
        list.add("94");
        list.add("97");
        list.add("99");
        list.add("100");
        return list;
    }

}
