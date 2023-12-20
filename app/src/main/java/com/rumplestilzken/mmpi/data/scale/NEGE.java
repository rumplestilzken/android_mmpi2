package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class NEGE extends Scale {
    @Override
    public String getDescription() {
        return "Negative Emotionality / Neuroticism";
    }

    @Override
    public String toString() {
        return "NEGE";
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("37");
        list.add("52");
        list.add("82");
        list.add("93");
        list.add("116");
        list.add("166");
        list.add("196");
        list.add("213");
        list.add("290");
        list.add("301");
        list.add("305");
        list.add("329");
        list.add("375");
        list.add("389");
        list.add("390");
        list.add("395");
        list.add("397");
        list.add("407");
        list.add("409");
        list.add("415");
        list.add("435");
        list.add("442");
        list.add("444");
        list.add("451");
        list.add("513");
        list.add("542");
        list.add("556");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("63");
        list.add("223");
        list.add("372");
        list.add("405");
        list.add("496");
        list.add("564");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("31");
        list.add("34");
        list.add("36");
        list.add("39");
        list.add("41");
        list.add("43");
        list.add("44");
        list.add("46");
        list.add("48");
        list.add("49");
        list.add("51");
        list.add("52");
        list.add("54");
        list.add("56");
        list.add("57");
        list.add("59");
        list.add("61");
        list.add("64");
        list.add("66");
        list.add("68");
        list.add("70");
        list.add("72");
        list.add("74");
        list.add("76");
        list.add("78");
        list.add("80");
        list.add("82");
        list.add("84");
        list.add("86");
        list.add("89");
        list.add("91");
        list.add("93");
        list.add("95");
        list.add("97");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("30");
        list.add("31");
        list.add("34");
        list.add("36");
        list.add("38");
        list.add("40");
        list.add("42");
        list.add("44");
        list.add("45");
        list.add("46");
        list.add("48");
        list.add("49");
        list.add("50");
        list.add("52");
        list.add("53");
        list.add("55");
        list.add("57");
        list.add("59");
        list.add("61");
        list.add("63");
        list.add("66");
        list.add("68");
        list.add("70");
        list.add("72");
        list.add("75");
        list.add("77");
        list.add("79");
        list.add("81384");
        list.add("86");
        list.add("88");
        list.add("90");
        list.add("93");
        list.add("95");
        return list;
    }

}
