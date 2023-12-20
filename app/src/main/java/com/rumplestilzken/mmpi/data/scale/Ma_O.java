package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Ma_O extends Scale {
    @Override
    public String getDescription() {
        return "Hypomania, Obvious";
    }

    @Override
    public String toString() {
        return "MA-O";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("15");
        list.add("23");
        list.add("50");
        list.add("61");
        list.add("85");
        list.add("87");
        list.add("145");
        list.add("155");
        list.add("168");
        list.add("182");
        list.add("190");
        list.add("205");
        list.add("218");
        list.add("227");
        list.add("229");
        list.add("238");
        list.add("242");
        list.add("250");
        list.add("253");
        list.add("269");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("100");
        list.add("106");
        list.add("107");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("");
        list.add("30");
        list.add("34");
        list.add("37");
        list.add("40");
        list.add("44");
        list.add("47");
        list.add("51");
        list.add("54");
        list.add("57");
        list.add("61");
        list.add("64");
        list.add("67");
        list.add("71");
        list.add("74");
        list.add("78");
        list.add("81");
        list.add("84");
        list.add("88");
        list.add("91");
        list.add("95");
        list.add("98");
        list.add("101");
        list.add("105");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("");
        list.add("32");
        list.add("35");
        list.add("39");
        list.add("42");
        list.add("45");
        list.add("49");
        list.add("52");
        list.add("55");
        list.add("59");
        list.add("62");
        list.add("66");
        list.add("69");
        list.add("72");
        list.add("76");
        list.add("79");
        list.add("82");
        list.add("86");
        list.add("89");
        list.add("92");
        list.add("96");
        list.add("99");
        list.add("103");
        list.add("106");
        return list;
    }

}
