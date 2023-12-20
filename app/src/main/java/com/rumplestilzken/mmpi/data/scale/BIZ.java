package com.rumplestilzken.mmpi.data.scale;

import java.util.List;

public class BIZ extends Scale {
    @Override
    public String getDescription() {
        return "Bizarre Mentation";
    }

    @Override
    public String toString() {
        return "BIZ";
    }


    @Override
    public List<String> getTrueQuestions() {
        List<String> list = super.getTrueQuestions();
        list.add("24");
        list.add("32");
        list.add("60");
        list.add("96");
        list.add("138");
        list.add("162");
        list.add("198");
        list.add("228");
        list.add("259");
        list.add("298");
        list.add("311");
        list.add("316");
        list.add("319");
        list.add("333");
        list.add("336");
        list.add("355");
        list.add("361");
        list.add("466");
        list.add("490");
        list.add("508");
        list.add("543");
        list.add("551");
        return list;
    }

    @Override
    public List<String> getFalseQuestions() {
        List<String> list = super.getFalseQuestions();
        list.add("427");
        return list;
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();list.add("");
        list.add("39");
        list.add("46");
        list.add("51");
        list.add("54");
        list.add("57");
        list.add("60");
        list.add("63");
        list.add("67");
        list.add("70");
        list.add("74");
        list.add("77");
        list.add("81");
        list.add("84");
        list.add("88");
        list.add("91");
        list.add("94");
        list.add("98");
        list.add("101");
        list.add("105");
        list.add("108");
        list.add("112");
        list.add("115");
        list.add("119");
        list.add("120");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("");
        list.add("39");
        list.add("47");
        list.add("52");
        list.add("56");
        list.add("58");
        list.add("61");
        list.add("64");
        list.add("67");
        list.add("70");
        list.add("73");
        list.add("76");
        list.add("79");
        list.add("81");
        list.add("84");
        list.add("87");
        list.add("90");
        list.add("93");
        list.add("96");
        list.add("99");
        list.add("102");
        list.add("105");
        list.add("108");
        list.add("110");
        list.add("113");
        return list;
    }
}
