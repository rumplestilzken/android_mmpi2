package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class FRS extends Scale {
    @Override
    public String getDescription() {
        return "Fears";
    }

    @Override
    public String toString() {
        return "FRS";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("154");
        list.add("317");
        list.add("322");
        list.add("329");
        list.add("334");
        list.add("392");
        list.add("395");
        list.add("397");
        list.add("435");
        list.add("438");
        list.add("441");
        list.add("447");
        list.add("458");
        list.add("468");
        list.add("471");
        list.add("555");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("115");
        list.add("163");
        list.add("186");
        list.add("385");
        list.add("401");
        list.add("453");
        list.add("462");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("35");
        list.add("41");
        list.add("45");
        list.add("48");
        list.add("51");
        list.add("54");
        list.add("57");
        list.add("60");
        list.add("64");
        list.add("67");
        list.add("70");
        list.add("74");
        list.add("77");
        list.add("80");
        list.add("84");
        list.add("87");
        list.add("90");
        list.add("93");
        list.add("97");
        list.add("100");
        list.add("103");
        list.add("107");
        list.add("110");
        list.add("113");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("31");
        list.add("35");
        list.add("38");
        list.add("41");
        list.add("43");
        list.add("46");
        list.add("48");
        list.add("51");
        list.add("53");
        list.add("56");
        list.add("59");
        list.add("62");
        list.add("65");
        list.add("68");
        list.add("72");
        list.add("75");
        list.add("78");
        list.add("81");
        list.add("85");
        list.add("88");
        list.add("91");
        list.add("94");
        list.add("98");
        list.add("101");
        return list;
    }
}
