package com.rumplestilzken.mmpi.data.scale;

import java.util.ArrayList;
import java.util.List;

public class CriticalScale extends Scale {
    boolean isVisible = false;
    List<String> trueValues = new ArrayList<>();
    List<String> falseValues = new ArrayList<>();

    public List<String> getTrueValues() {
        return trueValues;
    }

    public void setTrueValues(List<String> trueValues) {
        this.trueValues = trueValues;
    }

    public List<String> getFalseValues() {
        return falseValues;
    }

    public void setFalseValues(List<String> falseValues) {
        this.falseValues = falseValues;
    }
    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }
}
