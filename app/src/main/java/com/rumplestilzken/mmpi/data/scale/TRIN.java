package com.rumplestilzken.mmpi.data.scale;

import java.util.ArrayList;
import java.util.List;

public class TRIN extends Scale {

    public TRIN() {
        setRawScore(9);
    }

    @Override
    public String getDescription() {
        return "True Response Inconsistency";
    }

    @Override
    public String toString() {
        return "TRIN";
    }

    @Override
    public List<String> getMaleTScale() {
        List<String> list = super.getMaleTScale();
        list.add("114F");
        list.add("107F");
        list.add("99F");
        list.add("92F");
        list.add("85F");
        list.add("78F");
        list.add("71F");
        list.add("64F");
        list.add("57F");
        list.add("50");
        list.add("57T");
        list.add("65T");
        list.add("72T");
        list.add("79T");
        list.add("86T");
        list.add("93T");
        list.add("100T");
        list.add("107T");
        list.add("114T");
        list.add("120T");
        return list;
    }

    @Override
    public List<String> getFemaleTScale() {
        List<String> list = super.getFemaleTScale();
        list.add("118F");
        list.add("111F");
        list.add("103F");
        list.add("95F");
        list.add("88F");
        list.add("80F");
        list.add("73F");
        list.add("65F");
        list.add("58F");
        list.add("50");
        list.add("58T");
        list.add("65T");
        list.add("73T");
        list.add("80T");
        list.add("88T");
        list.add("95T");
        list.add("103T");
        list.add("111T");
        list.add("118T");
        list.add("120T");
        return list;
    }

    public static List<RINPair> getTRINPairs() {
        List<RINPair> pairs = new ArrayList<>();
        pairs.add(new RINPair(3,true,39,true,1));
        pairs.add(new RINPair(12,true,166,true,1));
        pairs.add(new RINPair(40,true,176,true,1));
        pairs.add(new RINPair(48,true,184,true,1));
        pairs.add(new RINPair(63,true,27,true,1));
        pairs.add(new RINPair(65,true,95,true,1));
        pairs.add(new RINPair(73,true,239,true,1));
        pairs.add(new RINPair(83,true,288,true,1));
        pairs.add(new RINPair(99,true,314,true,1));
        pairs.add(new RINPair(125,true,195,true,1));
        pairs.add(new RINPair(209,true,351,true,1));
        pairs.add(new RINPair(359,true,367,true,1));
        pairs.add(new RINPair(377,true,534,true,1));
        pairs.add(new RINPair(556,true,560,true,1));
        pairs.add(new RINPair(9,false,56,false,-1));
        pairs.add(new RINPair(65,false,95,false,-1));
        pairs.add(new RINPair(125,false,195,false,-1));
        pairs.add(new RINPair(140,false,196,false,-1));
        pairs.add(new RINPair(152,false,464,false,-1));
        pairs.add(new RINPair(265,false,360,false,-1));
        pairs.add(new RINPair(359,false,367,false,-1));
        return pairs;
    }
}
