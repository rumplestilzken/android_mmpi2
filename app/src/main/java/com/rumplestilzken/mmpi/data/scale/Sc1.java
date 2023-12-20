package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Sc1 extends Scale {
    @Override
    public String getDescription() {
        return "Social Alienation";
    }

    @Override
    public String toString() {
        return "Sc1";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("17");
        list.add("21");
        list.add("22");
        list.add("42");
        list.add("46");
        list.add("138");
        list.add("145");
        list.add("190");
        list.add("221");
        list.add("256");
        list.add("277");
        list.add("281");
        list.add("291");
        list.add("292");
        list.add("320");
        list.add("333");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("90");
        list.add("276");
        list.add("278");
        list.add("280");
        list.add("343");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("39");
        list.add("43");
        list.add("47");
        list.add("51");
        list.add("55");
        list.add("59");
        list.add("64");
        list.add("68");
        list.add("72");
        list.add("76");
        list.add("80");
        list.add("84");
        list.add("88");
        list.add("92");
        list.add("97");
        list.add("101");
        list.add("105");
        list.add("109");
        list.add("113");
        list.add("117");
        list.add("120");
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
        list.add("53");
        list.add("57");
        list.add("61");
        list.add("65");
        list.add("69");
        list.add("73");
        list.add("77");
        list.add("81");
        list.add("84");
        list.add("88");
        list.add("92");
        list.add("96");
        list.add("100");
        list.add("104");
        list.add("108");
        list.add("111");
        list.add("115");
        list.add("119");
        return list;
    }
}
