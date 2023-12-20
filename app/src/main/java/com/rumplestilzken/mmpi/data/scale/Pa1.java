package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Pa1 extends Scale {
    @Override
    public String getDescription() {
        return "Persecutory Ideas";
    }

    @Override
    public String toString() {
        return "Pa1";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("17");
        list.add("22");
        list.add("42");
        list.add("99");
        list.add("113");
        list.add("138");
        list.add("144");
        list.add("145");
        list.add("162");
        list.add("234");
        list.add("259");
        list.add("305");
        list.add("333");
        list.add("336");
        list.add("355");
        list.add("361");
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
        list.add("40");
        list.add("46");
        list.add("52");
        list.add("58");
        list.add("64");
        list.add("70");
        list.add("76");
        list.add("82");
        list.add("88");
        list.add("94");
        list.add("100");
        list.add("106");
        list.add("112");
        list.add("118");
        list.add("120");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("39");
        list.add("45");
        list.add("51");
        list.add("57");
        list.add("63");
        list.add("69");
        list.add("75");
        list.add("81");
        list.add("87");
        list.add("93");
        list.add("99");
        list.add("105");
        list.add("111");
        list.add("117");
        list.add("120");
        return list;
    }
}
