package com.rumplestilzken.mmpi.data;

import com.rumplestilzken.mmpi.data.scale.CriticalScale;
import com.rumplestilzken.mmpi.data.scale.Scale;

import java.util.List;

public class Storage {

    public static List<QuestionData.QuestionAnswerData> getAnswers() {
        return answers;
    }

    public static void setAnswers(List<QuestionData.QuestionAnswerData> answers) {
        Storage.answers = answers;
    }

    public static List<Scale> getScales() {
        return scales;
    }

    public static void setScales(List<Scale> scales) {
        Storage.scales = scales;
    }

    public static List<CriticalScale> getCriticalScales() {
        return criticalScales;
    }

    public static void setCriticalScales(List<CriticalScale> criticalScales) {
        Storage.criticalScales = criticalScales;
    }

    public static double getProfileEvaluation() {
        return profileEvaluation;
    }

    public static void setProfileEvaluation(double profileEvaluation) {
        Storage.profileEvaluation = profileEvaluation;
    }

    public static boolean isIsMale() {
        return isMale;
    }

    public static void setIsMale(boolean isMale) {
        Storage.isMale = isMale;
    }

    private static boolean isMale = false;
    private static boolean isLong = false;
    private static double profileEvaluation = 0;
    private static List<Scale> scales = null;
    private static List<CriticalScale> criticalScales = null;
    private static List<QuestionData.QuestionAnswerData> answers = null;

    public static void setIsLong(boolean isLong) {
        Storage.isLong = isLong;
    }
}
