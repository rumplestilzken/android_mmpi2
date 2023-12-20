package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class TPA extends Scale {
    @Override
    public String getDescription() {
        return "Type A";
    }

    @Override
    public String toString() {
        return "TPA";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("27");
        list.add("136");
        list.add("151");
        list.add("212");
        list.add("302");
        list.add("358");
        list.add("414");
        list.add("419");
        list.add("420");
        list.add("423");
        list.add("430");
        list.add("437");
        list.add("507");
        list.add("510");
        list.add("523");
        list.add("531");
        list.add("535");
        list.add("541");
        list.add("545");
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
        list.add("30");
        list.add("33");
        list.add("36");
        list.add("38");
        list.add("41");
        list.add("43");
        list.add("45");
        list.add("48");
        list.add("50");
        list.add("53");
        list.add("56");
        list.add("60");
        list.add("64");
        list.add("69");
        list.add("73");
        list.add("77");
        list.add("81");
        list.add("85");
        list.add("90");
        list.add("94");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("30");
        list.add("33");
        list.add("36");
        list.add("38");
        list.add("41");
        list.add("43");
        list.add("45");
        list.add("48");
        list.add("50");
        list.add("53");
        list.add("56");
        list.add("60");
        list.add("64");
        list.add("69");
        list.add("73");
        list.add("77");
        list.add("81");
        list.add("85");
        list.add("90");
        list.add("94");
        return list;
    }}
