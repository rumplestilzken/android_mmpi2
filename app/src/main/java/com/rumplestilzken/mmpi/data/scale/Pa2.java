package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Pa2 extends Scale {
    @Override
    public String getDescription() {
        return "Poignancy";
    }

    @Override
    public String toString() {
        return "Pa2";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("22");
        list.add("146");
        list.add("271");
        list.add("277");
        list.add("285");
        list.add("307");
        list.add("334");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("100");
        list.add("244");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("34");
        list.add("41");
        list.add("48");
        list.add("55");
        list.add("62");
        list.add("69");
        list.add("76");
        list.add("82");
        list.add("89");
        list.add("96");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("34");
        list.add("40");
        list.add("46");
        list.add("53");
        list.add("59");
        list.add("65");
        list.add("72");
        list.add("78");
        list.add("84");
        list.add("91");
        return list;
    }
}
