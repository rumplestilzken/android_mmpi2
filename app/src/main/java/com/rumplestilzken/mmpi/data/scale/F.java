package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class F extends Scale {

    @Override
    public String getDescription() {
        return "Infrequency";
    }

    @Override
    public String toString() {
        return "F";
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("");
        list.add("36");
        list.add("39");
        list.add("42");
        list.add("45");
        list.add("48");
        list.add("51");
        list.add("55");
        list.add("58");
        list.add("61");
        list.add("64");
        list.add("67");
        list.add("70");
        list.add("73");
        list.add("76");
        list.add("79");
        list.add("82");
        list.add("85");
        list.add("89");
        list.add("92");
        list.add("95");
        list.add("98");
        list.add("101");
        list.add("104");
        list.add("107");
        list.add("110");
        list.add("113");
        list.add("116");
        list.add("119");
        list.add("120");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("37");
        list.add("41");
        list.add("44");
        list.add("48");
        list.add("51");
        list.add("55");
        list.add("58");
        list.add("61");
        list.add("65");
        list.add("68");
        list.add("72");
        list.add("75");
        list.add("79");
        list.add("82");
        list.add("85");
        list.add("89");
        list.add("92");
        list.add("96");
        list.add("99");
        list.add("103");
        list.add("106");
        list.add("109");
        list.add("113");
        list.add("116");
        list.add("120");
        return list;
    }

    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("6");
        list.add("12");
        list.add("78");
        list.add("90");
        list.add("102");
        list.add("108");
        list.add("120");
        list.add("126");
        list.add("132");
        list.add("174");
        list.add("186");
        list.add("192");
        list.add("204");
        list.add("210");
        list.add("222");
        list.add("276");
        list.add("318");
        list.add("330");
        list.add("343");
        return list;
    }

    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("18");
        list.add("24");
        list.add("30");
        list.add("36");
        list.add("42");
        list.add("48");
        list.add("54");
        list.add("60");
        list.add("66");
        list.add("72");
        list.add("84");
        list.add("96");
        list.add("114");
        list.add("138");
        list.add("144");
        list.add("150");
        list.add("156");
        list.add("162");
        list.add("168");
        list.add("180");
        list.add("198");
        list.add("216");
        list.add("228");
        list.add("234");
        list.add("240");
        list.add("246");
        list.add("252");
        list.add("258");
        list.add("264");
        list.add("270");
        list.add("282");
        list.add("288");
        list.add("294");
        list.add("300");
        list.add("306");
        list.add("312");
        list.add("324");
        list.add("336");
        list.add("349");
        list.add("355");
        list.add("361");
        return list;
    }
}
