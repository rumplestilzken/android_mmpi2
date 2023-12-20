package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Pa_O extends Scale {
    @Override
    public String getDescription() {
        return "Paranoia, Obvious";
    }

    @Override
    public String toString() {
        return "Pa-O";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("17");
        list.add("22");
        list.add("23");
        list.add("24");
        list.add("42");
        list.add("99");
        list.add("138");
        list.add("144");
        list.add("146");
        list.add("162");
        list.add("234");
        list.add("259");
        list.add("277");
        list.add("285");
        list.add("305");
        list.add("307");
        list.add("333");
        list.add("336");
        list.add("355");
        list.add("361");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("255");
        list.add("266");
        list.add("314");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("38");
        list.add("43");
        list.add("47");
        list.add("52");
        list.add("57");
        list.add("61");
        list.add("66");
        list.add("70");
        list.add("75");
        list.add("80");
        list.add("84");
        list.add("89");
        list.add("93");
        list.add("98");
        list.add("102");
        list.add("107");
        list.add("112");
        list.add("116");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("38");
        list.add("42");
        list.add("47");
        list.add("51");
        list.add("55");
        list.add("60");
        list.add("64");
        list.add("68");
        list.add("72");
        list.add("77");
        list.add("81");
        list.add("85");
        list.add("90");
        list.add("94");
        list.add("98");
        list.add("103");
        list.add("107");
        list.add("111");
        list.add("115");
        list.add("120");
        return list;
    }

}
