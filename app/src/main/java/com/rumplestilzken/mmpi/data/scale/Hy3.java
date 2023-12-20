package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Hy3 extends Scale {
    @Override
    public String getDescription() {
        return "Lassitude-malaise";
    }

    @Override
    public String toString() {
        return "Hy3";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("31");
        list.add("39");
        list.add("65");
        list.add("175");
        list.add("218");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("2");
        list.add("3");
        list.add("9");
        list.add("10");
        list.add("45");
        list.add("95");
        list.add("125");
        list.add("141");
        list.add("148");
        list.add("152");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("38");
        list.add("43");
        list.add("48");
        list.add("52");
        list.add("57");
        list.add("61");
        list.add("66");
        list.add("70");
        list.add("75");
        list.add("79");
        list.add("84");
        list.add("88");
        list.add("93");
        list.add("97");
        list.add("102");
        list.add("106");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("39");
        list.add("43");
        list.add("47");
        list.add("51");
        list.add("55");
        list.add("59");
        list.add("63");
        list.add("67");
        list.add("71");
        list.add("75");
        list.add("79");
        list.add("83");
        list.add("87");
        list.add("91");
        list.add("95");
        list.add("99");
        return list;
    }
}
