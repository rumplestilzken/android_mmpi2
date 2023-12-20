package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class TRT2 extends Scale {
    @Override
    public String getDescription() {
        return "Inability to Disclose";
    }

    @Override
    public String toString() {
        return "TRT2";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("274");
        list.add("373");
        list.add("375");
        list.add("391");
        list.add("495");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("37");
        list.add("45");
        list.add("52");
        list.add("60");
        list.add("68");
        list.add("75");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("38");
        list.add("46");
        list.add("53");
        list.add("60");
        list.add("68");
        list.add("75");
        return list;
    }

}
