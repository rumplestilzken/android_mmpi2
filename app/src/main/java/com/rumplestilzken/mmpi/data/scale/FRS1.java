package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class FRS1 extends Scale {
    @Override
    public String getDescription() {
        return "Generalized Fearfulness";
    }

    @Override
    public String toString() {
        return "FRS1";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("317");
        list.add("322");
        list.add("329");
        list.add("334");
        list.add("395");
        list.add("435");
        list.add("441");
        list.add("447");
        list.add("468");
        list.add("471");
        list.add("555");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("186");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("44");
        list.add("53");
        list.add("62");
        list.add("71");
        list.add("80");
        list.add("89");
        list.add("98");
        list.add("107");
        list.add("113");
        list.add("120");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("42");
        list.add("48");
        list.add("55");
        list.add("61");
        list.add("68");
        list.add("74");
        list.add("81");
        list.add("88");
        list.add("94");
        list.add("101");
        list.add("107");
        return list;
    }

}
