package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class AAS extends Scale {
    @Override
    public String getDescription() {
        return "Addiction Acknowledgement";
    }

    @Override
    public String toString() {
        return "AAS";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("172");
        list.add("264");
        list.add("288");
        list.add("362");
        list.add("387");
        list.add("487");
        list.add("489");
        list.add("511");
        list.add("527");
        list.add("544");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("266");
        list.add("429");
        list.add("501");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("36");
        list.add("41");
        list.add("46");
        list.add("51");
        list.add("56");
        list.add("60");
        list.add("65");
        list.add("70");
        list.add("75");
        list.add("80");
        list.add("85");
        list.add("90");
        list.add("95");
        list.add("100");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("39");
        list.add("44");
        list.add("50");
        list.add("56");
        list.add("61");
        list.add("67");
        list.add("7");
        list.add("78");
        list.add("84");
        list.add("90");
        list.add("95");
        list.add("101");
        list.add("107");
        list.add("113");
        return list;
    }
}
