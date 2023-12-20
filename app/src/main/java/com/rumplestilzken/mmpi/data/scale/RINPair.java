package com.rumplestilzken.mmpi.data.scale;

public class RINPair {
    public RINPair(int index1, boolean bool1, int index2, boolean bool2, int value) {
        this.index1 = index1;
        this.index2 = index2;
        this.value = value;
        this.bool1 = bool1;
        this.bool2 = bool2;
    }

    public int getIndex1() {
        return index1;
    }

    public void setIndex1(int index1) {
        this.index1 = index1;
    }

    public int getIndex2() {
        return index2;
    }

    public void setIndex2(int index2) {
        this.index2 = index2;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isBool1() {
        return bool1;
    }

    public void setBool1(boolean bool1) {
        this.bool1 = bool1;
    }

    public boolean isBool2() {
        return bool2;
    }

    public void setBool2(boolean bool2) {
        this.bool2 = bool2;
    }

    int index1 = -1;
    int index2 = -1;
    int value = -1;

    boolean bool1 = false;
    boolean bool2 = false;
}
