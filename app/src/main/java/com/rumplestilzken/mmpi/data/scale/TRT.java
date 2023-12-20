package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class TRT extends Scale {
    @Override
    public String getDescription() {
        return "Negative Treatment Indicators";
    }

    @Override
    public String toString() {
        return "TRT";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("22");
        list.add("92");
        list.add("274");
        list.add("306");
        list.add("364");
        list.add("368");
        list.add("373");
        list.add("375");
        list.add("376");
        list.add("377");
        list.add("391");
        list.add("399");
        list.add("482");
        list.add("488");
        list.add("491");
        list.add("495");
        list.add("497");
        list.add("499");
        list.add("500");
        list.add("504");
        list.add("528");
        list.add("539");
        list.add("554");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("493");
        list.add("494");
        list.add("501");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("35");
        list.add("39");
        list.add("43");
        list.add("47");
        list.add("49");
        list.add("52");
        list.add("54");
        list.add("56");
        list.add("59");
        list.add("61");
        list.add("64");
        list.add("66");
        list.add("69");
        list.add("71");
        list.add("74");
        list.add("76");
        list.add("79");
        list.add("81");
        list.add("84");
        list.add("86");
        list.add("89");
        list.add("91");
        list.add("94");
        list.add("96");
        list.add("99");
        list.add("101");
        list.add("104");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("35");
        list.add("39");
        list.add("43");
        list.add("46");
        list.add("49");
        list.add("51");
        list.add("53");
        list.add("55");
        list.add("57");
        list.add("59");
        list.add("61");
        list.add("64");
        list.add("67");
        list.add("69");
        list.add("72");
        list.add("74");
        list.add("77");
        list.add("79");
        list.add("82");
        list.add("84");
        list.add("87");
        list.add("89");
        list.add("92");
        list.add("95");
        list.add("97");
        list.add("100");
        list.add("102");
        return list;
    }
}
