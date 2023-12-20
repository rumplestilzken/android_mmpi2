package com.rumplestilzken.mmpi.data.scale;

import java.util.ArrayList;
import java.util.List;

public class VRIN extends Scale {
    public VRIN() {
        setRawScore(0);
    }

    @Override
    public String getDescription() {
        return "Variable Response Inconsistency";
    }

    @Override
    public String toString() {
        return "VRIN";
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("31");
        list.add("34");
        list.add("38");
        list.add("42");
        list.add("46");
        list.add("50");
        list.add("54");
        list.add("57");
        list.add("61");
        list.add("65");
        list.add("69");
        list.add("73");
        list.add("76");
        list.add("80");
        list.add("84");
        list.add("88");
        list.add("92");
        list.add("96");
        list.add("99");
        list.add("103");
        list.add("107");
        list.add("111");
        list.add("115");
        list.add("118");
        list.add("120");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("30");
        list.add("34");
        list.add("38");
        list.add("42");
        list.add("46");
        list.add("50");
        list.add("54");
        list.add("58");
        list.add("62");
        list.add("66");
        list.add("70");
        list.add("74");
        list.add("78");
        list.add("82");
        list.add("86");
        list.add("90");
        list.add("94");
        list.add("98");
        list.add("102");
        list.add("106");
        list.add("110");
        list.add("114");
        list.add("118");
        list.add("120");
        return list;
    }

    public static List<RINPair> getVRINPairs() {
        List<RINPair> pairs = new ArrayList<>();
        pairs.add(new RINPair(3, true, 39, true, 1));
        pairs.add(new RINPair(6, true, 90, false, 1));
        pairs.add(new RINPair(6, false, 90, true, 1));
        pairs.add(new RINPair(9, false, 56, false, 1));
        pairs.add(new RINPair(28,true,59,false,1));
        pairs.add(new RINPair(31,true,299,false,1));
        pairs.add(new RINPair(32,false,316,true,1));
        pairs.add(new RINPair(40,true,176,true,1));
        pairs.add(new RINPair(46,true,265,false,1));
        pairs.add(new RINPair(48,true,184,true,1));
        pairs.add(new RINPair(49,true,280,false,1));
        pairs.add(new RINPair(73,true,377,false,1));
        pairs.add(new RINPair(81,true,284,false,1));
        pairs.add(new RINPair(81,false,284,true,1));
        pairs.add(new RINPair(83,true,288,true,1));
        pairs.add(new RINPair(84,true,105,false,1));
        pairs.add(new RINPair(86,true,359,false,1));
        pairs.add(new RINPair(95,false,388,true,1));
        pairs.add(new RINPair(99,false,138,true,1));
        pairs.add(new RINPair(103,true,344,false,1));
        pairs.add(new RINPair(110,true,374,false,1));
        pairs.add(new RINPair(125,false,195,false,1));
        pairs.add(new RINPair(135,false,482,true,1));
        pairs.add(new RINPair(136,true,507,false,1));
        pairs.add(new RINPair(136,false,507,true,1));
        pairs.add(new RINPair(152,false,464,false,1));
        pairs.add(new RINPair(161,true,185,false,1));
        pairs.add(new RINPair(161,false,185,true,1));
        pairs.add(new RINPair(165,false,565,false,1));
        pairs.add(new RINPair(166,true,268,false,1));
        pairs.add(new RINPair(166,false,268,true,1));
        pairs.add(new RINPair(167,true,243,false,1));
        pairs.add(new RINPair(167,false,243,true,1));
        pairs.add(new RINPair(196,false,415,true,1));
        pairs.add(new RINPair(199,true,467,false,1));
        pairs.add(new RINPair(199,false,467,true,1));
        pairs.add(new RINPair(226,true,267,false,1));
        pairs.add(new RINPair(259,false,333,true,1));
        pairs.add(new RINPair(262,false,275,false,1));
        pairs.add(new RINPair(290,true,556,false,1));
        pairs.add(new RINPair(290,false,556,true,1));
        pairs.add(new RINPair(339,false,394,true,1));
        pairs.add(new RINPair(349,true,515,false,1));
        pairs.add(new RINPair(349,false,515,true,1));
        pairs.add(new RINPair(350,false,521,true,1));
        pairs.add(new RINPair(353,true,370,false,1));
        pairs.add(new RINPair(353,false,370,true,1));
        pairs.add(new RINPair(364,false,554,true,1));
        pairs.add(new RINPair(369,false,421,true,1));
        pairs.add(new RINPair(372,true,405,false,1));
        pairs.add(new RINPair(372,false,405,true,1));
        pairs.add(new RINPair(380,true,562,false,1));
        pairs.add(new RINPair(395,true,435,false,1));
        pairs.add(new RINPair(395,false,435,true,1));
        pairs.add(new RINPair(396,true,403,false,1));
        pairs.add(new RINPair(396,false,403,true,1));
        pairs.add(new RINPair(411,true,485,false,1));
        pairs.add(new RINPair(414,false,485,true,1));
        pairs.add(new RINPair(472,true,533,false,1));
        pairs.add(new RINPair(472,false,533,true,1));
        pairs.add(new RINPair(491,true,509,false,1));
        pairs.add(new RINPair(506,true,520,false,1));
        pairs.add(new RINPair(506,false,520,true,1));
        pairs.add(new RINPair(513,true,542,false,1));
        return pairs;
    }


}
