package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Pa extends Scale {
    @Override
    public String getDescription() {
        return "Paranoia";
    }

    @Override
    public String toString() {
        return "Pa";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("16");
        list.add("17");
        list.add("22");
        list.add("23");
        list.add("24");
        list.add("42");
        list.add("99");
        list.add("113");
        list.add("138");
        list.add("144");
        list.add("145");
        list.add("146");
        list.add("162");
        list.add("234");
        list.add("259");
        list.add("271");
        list.add("277");
        list.add("285");
        list.add("305");
        list.add("307");
        list.add("333");
        list.add("334");
        list.add("336");
        list.add("355");
        list.add("361");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("81");
        list.add("95");
        list.add("98");
        list.add("100");
        list.add("104");
        list.add("110");
        list.add("244");
        list.add("255");
        list.add("266");
        list.add("283");
        list.add("284");
        list.add("286");
        list.add("297");
        list.add("314");
        list.add("315");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("");
        list.add("");
        list.add("30");
        list.add("31");
        list.add("32");
        list.add("34");
        list.add("37");
        list.add("39");
        list.add("42");
        list.add("46");
        list.add("49");
        list.add("53");
        list.add("57");
        list.add("61");
        list.add("64");
        list.add("68");
        list.add("72");
        list.add("75");
        list.add("79");
        list.add("83");
        list.add("86");
        list.add("90");
        list.add("94");
        list.add("97");
        list.add("101");
        list.add("105");
        list.add("108");
        list.add("112");
        list.add("116");
        list.add("119");
        list.add("120");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("");
        list.add("");
        list.add("30");
        list.add("31");
        list.add("32");
        list.add("34");
        list.add("37");
        list.add("39");
        list.add("42");
        list.add("45");
        list.add("49");
        list.add("52");
        list.add("56");
        list.add("59");
        list.add("63");
        list.add("67");
        list.add("70");
        list.add("74");
        list.add("78");
        list.add("81");
        list.add("85");
        list.add("89");
        list.add("92");
        list.add("96");
        list.add("100");
        list.add("103");
        list.add("107");
        list.add("111");
        list.add("114");
        list.add("118");
        list.add("120");
        return list;
    }
}
