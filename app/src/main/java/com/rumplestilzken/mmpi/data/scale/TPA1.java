package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class TPA1 extends Scale {
    @Override
    public String getDescription() {
        return "Impatience";
    }

    @Override
    public String toString() {
        return "TPA1";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("302");
        list.add("420");
        list.add("430");
        list.add("507");
        list.add("523");
        list.add("535");
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
        list.add("34");
        list.add("39");
        list.add("45");
        list.add("51");
        list.add("57");
        list.add("63");
        list.add("68");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("34");
        list.add("40");
        list.add("46");
        list.add("52");
        list.add("58");
        list.add("64");
        list.add("70");
        return list;
    }

}
