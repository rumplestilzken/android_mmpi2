package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class ANG1 extends Scale {
    @Override
    public String getDescription() {
        return "Explosive Behavior";
    }

    @Override
    public String toString() {
        return "ANG1";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("37");
        list.add("134");
        list.add("389");
        list.add("414");
        list.add("540");
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
        list.add("39");
        list.add("45");
        list.add("52");
        list.add("58");
        list.add("64");
        list.add("71");
        list.add("77");
        list.add("83");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("39");
        list.add("47");
        list.add("54");
        list.add("61");
        list.add("69");
        list.add("76");
        list.add("84");
        list.add("91");
        return list;
    }

}
