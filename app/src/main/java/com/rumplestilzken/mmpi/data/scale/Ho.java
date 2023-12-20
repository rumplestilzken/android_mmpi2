package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class Ho extends Scale {
    @Override
    public String getDescription() {
        return "Hostility";
    }

    @Override
    public String toString() {
        return "Ho";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("19");
        list.add("27");
        list.add("46");
        list.add("50");
        list.add("58");
        list.add("76");
        list.add("81");
        list.add("99");
        list.add("104");
        list.add("110");
        list.add("124");
        list.add("136");
        list.add("145");
        list.add("171");
        list.add("205");
        list.add("225");
        list.add("227");
        list.add("241");
        list.add("248");
        list.add("251");
        list.add("254");
        list.add("259");
        list.add("265");
        list.add("286");
        list.add("306");
        list.add("315");
        list.add("338");
        list.add("346");
        list.add("347");
        list.add("352");
        list.add("357");
        list.add("358");
        list.add("386");
        list.add("393");
        list.add("398");
        list.add("406");
        list.add("414");
        list.add("419");
        list.add("423");
        list.add("425");
        list.add("436");
        list.add("443");
        list.add("445");
        list.add("452");
        list.add("457");
        list.add("466");
        list.add("470");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("217");
        list.add("230");
        list.add("372");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("");
        list.add("30");
        list.add("31");
        list.add("32");
        list.add("33");
        list.add("34");
        list.add("35");
        list.add("36");
        list.add("38");
        list.add("39");
        list.add("40");
        list.add("41");
        list.add("42");
        list.add("44");
        list.add("45");
        list.add("46");
        list.add("47");
        list.add("48");
        list.add("50");
        list.add("51");
        list.add("52");
        list.add("53");
        list.add("54");
        list.add("56");
        list.add("57");
        list.add("58");
        list.add("59");
        list.add("60");
        list.add("62");
        list.add("63");
        list.add("64");
        list.add("65");
        list.add("66");
        list.add("67");
        list.add("69");
        list.add("70");
        list.add("71");
        list.add("72");
        list.add("73");
        list.add("75");
        list.add("76");
        list.add("77");
        list.add("78");
        list.add("79");
        list.add("81");
        list.add("82");
        list.add("83");
        list.add("84");
        list.add("85");
        list.add("87");
        list.add("88");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("");
        list.add("30");
        list.add("31");
        list.add("32");
        list.add("34");
        list.add("35");
        list.add("36");
        list.add("37");
        list.add("39");
        list.add("40");
        list.add("41");
        list.add("42");
        list.add("44");
        list.add("45");
        list.add("46");
        list.add("47");
        list.add("49");
        list.add("50");
        list.add("51");
        list.add("52");
        list.add("54");
        list.add("55");
        list.add("56");
        list.add("58");
        list.add("59");
        list.add("60");
        list.add("61");
        list.add("63");
        list.add("64");
        list.add("65");
        list.add("66");
        list.add("68");
        list.add("69");
        list.add("70");
        list.add("71");
        list.add("73");
        list.add("74");
        list.add("75");
        list.add("76");
        list.add("78");
        list.add("79");
        list.add("80");
        list.add("82");
        list.add("83");
        list.add("84");
        list.add("85");
        list.add("87");
        list.add("88");
        list.add("89");
        list.add("90");
        list.add("92");
        return list;
    }
}
