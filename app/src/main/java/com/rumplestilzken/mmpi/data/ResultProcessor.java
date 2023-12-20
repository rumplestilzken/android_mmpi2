package com.rumplestilzken.mmpi.data;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.rumplestilzken.mmpi.data.scale.*;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResultProcessor {

    public ResultProcessor(boolean isMale, boolean isLong) {
        this.isLong = isLong;
        this.isMale = isMale;
    }

    boolean isMale = false;
    boolean isLong = false;

    public String getJSONFromAnswers(List<QuestionData.QuestionAnswerData> answers) {
        JSONObject answerObject = new JSONObject();
        JSONObject scales = new JSONObject();
        List<Scale> scaleList = Scales.getScales();
        List<CriticalScale> criticalScales = Scales.getCriticalScales();

        data.scale.ScaleProcessor sp = new data.scale.ScaleProcessor();
        try {
            answerObject.put("Profile Evaluation", sp.process(answers, scaleList, criticalScales, isMale));
            answerObject.put("gender", isMale ? "Male" : "Female");
            answerObject.put("form", isLong ? "Long" : "Short");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        scaleList.stream().forEachOrdered(i -> {
            Map<String, String> map = new HashMap<>();
            map.put("description", i.getDescription());
            map.put("rawScore", Long.toString(i.getRawScore()));
            map.put("kScore", Long.toString(i.getkScore()));
            map.put("tScore", i.gettScore());
            map.put("index", Integer.toString(i.getIndex()));
            try {
                scales.put(i.toString(), map);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        });
        try {
            answerObject.put("scales", scales);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        JSONObject criticalScalesObject = new JSONObject();
        criticalScales.forEach(i -> {
            JSONObject object = new JSONObject();
            try {
                object.put("description", i.getDescription());
                object.put("true", i.getTrueValues());
                object.put("false", i.getFalseValues());
                criticalScalesObject.put(i.toString(), object);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        });
        try {
            answerObject.put("critical_scales", criticalScalesObject);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        JSONObject answerWrapper = new JSONObject();
        for(QuestionData.QuestionAnswerData answer : answers) {
            try {
                answerWrapper.put(Integer.toString(answer.getIndex()), answer.getAnswer() == null ? "?" : answer.getAnswer());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            answerObject.put("Answers", answerWrapper);
            answerObject.put("origin", "http://www.ohiofamilyrights.com/docs/MMPI_scoring.html");
            answerObject.put("creator", "https://github.com/rumplestilzken/mmpi2/");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        ObjectMapper objectMapper = new ObjectMapper();
        Object jsonObject = null;
        String prettyPrint = "";
        try {
            jsonObject = objectMapper.readValue(answerObject.toString(), Object.class);
            prettyPrint = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return prettyPrint;
    }

    public boolean writePDFDocument(List<QuestionData.QuestionAnswerData> answers, String path) {
        List<Scale> scaleList = Scales.getScales();
        List<CriticalScale> criticalScales = Scales.getCriticalScales();

        data.scale.ScaleProcessor sp = new data.scale.ScaleProcessor();
        double profileEvaluation = sp.process(answers, scaleList, criticalScales, isMale);

        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(path));
            document.open();
            addMetadataToDocument(document);
            addTitlePage(document);
            addScalesPages(scaleList, document);
            addCriticalScalePages(document, criticalScales);
            addSummaryPages(answers, profileEvaluation, document);
            document.close();
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return true;
    }

    private static void addMetadataToDocument(Document document) {
        document.addTitle("MMPI-2");
        document.addSubject("MMPI-2");
        document.addAuthor("rumplestilzken");
        document.addCreator("https://github.com/rumplestilzken/mmpi2/");
    }

    private static void addSummaryPages(List<QuestionData.QuestionAnswerData> answers, double profileEvaluation, Document document) throws DocumentException {
        document.newPage();
        Paragraph peParagraph = new Paragraph("Profile Evaluation: " + profileEvaluation);
        document.add(peParagraph);

        StringBuilder answerString = new StringBuilder();
        for(int i = 0; i < answers.size(); i++){
            QuestionData.QuestionAnswerData a = answers.get(i);
            if(a.getAnswer() == null) {
                answerString.append("?");
            }
            else if(a.getAnswer()) {
                answerString.append("T");
            }
            else if (!a.getAnswer()) {
                answerString.append("F");
            }
        }

        Paragraph answerSummaryParagraph = new Paragraph("Answer Summary");
        Paragraph answerParagraph = new Paragraph(answerString.toString());
        document.add(answerSummaryParagraph);
        document.add(answerParagraph);
    }

    private static void addCriticalScalePages(Document document, List<CriticalScale> criticalScales) throws DocumentException {
        document.newPage();
        Paragraph criticalItemsText = new Paragraph("Critical Scale Items");
        document.add(criticalItemsText);

        addEmptyLine(criticalItemsText, 2);

        PdfPTable criticalTable = new PdfPTable(5);
        criticalTable.setHeaderRows(1);
        criticalTable.setWidths(new int[] {100, 230, 100, 100, 230});

        PdfPCell critScale = new PdfPCell(new Phrase("Scale"));
        critScale.setHorizontalAlignment(Element.ALIGN_CENTER);
        criticalTable.addCell(critScale);

        PdfPCell critScaleDesc = new PdfPCell(new Phrase("Scale Description"));
        critScaleDesc.setHorizontalAlignment(Element.ALIGN_CENTER);
        criticalTable.addCell(critScaleDesc);

        PdfPCell critQuestion = new PdfPCell(new Phrase("Question"));
        critQuestion.setHorizontalAlignment(Element.ALIGN_CENTER);
        criticalTable.addCell(critQuestion);

        PdfPCell critAnswer = new PdfPCell(new Phrase("Answer"));
        critAnswer.setHorizontalAlignment(Element.ALIGN_CENTER);
        criticalTable.addCell(critAnswer);

        PdfPCell critQuestionText = new PdfPCell(new Phrase("Question Text"));
        critQuestionText.setHorizontalAlignment(Element.ALIGN_CENTER);
        criticalTable.addCell(critQuestionText);

        List<QuestionData.Question> qd = new QuestionData().getQuestions();

        for (CriticalScale critScaleObject: criticalScales) {
            for(String index : critScaleObject.getTrueValues())
            {
                criticalTable.addCell(critScaleObject.toString());
                criticalTable.addCell(critScaleObject.getDescription());
                criticalTable.addCell(index);
                criticalTable.addCell("True" );
                criticalTable.addCell(qd.stream().filter(i -> Integer.toString(i.getIndex()).equals(index)).findFirst().get().getText());
            }
            for(String index : critScaleObject.getFalseValues())
            {
                criticalTable.addCell(critScaleObject.toString());
                criticalTable.addCell(critScaleObject.getDescription());
                criticalTable.addCell(index);
                criticalTable.addCell("False");
                criticalTable.addCell(qd.stream().filter(i -> Integer.toString(i.getIndex()).equals(index)).findFirst().get().getText());
            }
        }

        document.add(criticalTable);
    }

    private static void addScalesPages(List<Scale> scaleList, Document document) throws DocumentException {
        document.newPage();
        PdfPTable table = new PdfPTable(5);
        PdfPCell scale = new PdfPCell((new Phrase("Scale")));
        scale.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(scale);

        PdfPCell scaleDesc = new PdfPCell((new Phrase("Scale Description")));
        scaleDesc.setHorizontalAlignment(Element.ALIGN_CENTER);
//            scaleDesc.setColspan(2);
        table.addCell(scaleDesc);

        PdfPCell rawScore = new PdfPCell((new Phrase("Raw Score")));
        rawScore.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(rawScore);

        PdfPCell kScore = new PdfPCell((new Phrase("K Score")));
        kScore.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(kScore);

        PdfPCell tScore = new PdfPCell((new Phrase("T Score")));
        tScore.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(tScore);

        table.setHeaderRows(1);
        table.setWidths(new int[] {50, 230, 50, 50, 60});

        scaleList.forEach(currentScale -> {
            boolean modify = currentScale instanceof True || currentScale instanceof False || currentScale instanceof QuestionScale;

            String scaleId = currentScale.toString();
            if(currentScale.toString().startsWith("Mf"))
            {
                scaleId = "Mf";
            }
            table.addCell(scaleId);

            if(modify)
            {
                table.addCell(" ");
            }
            else
            {
                table.addCell(currentScale.getDescription().isEmpty() ? " " : currentScale.getDescription());
            }

            table.addCell(Long.toString(currentScale.getRawScore()));
            table.addCell(Long.toString(currentScale.getkScore()).equals("-1") ? " " : Long.toString(currentScale.getkScore()));

            if(modify)
            {
                table.addCell(" ");
            }
            else {
                PdfPCell cell = new PdfPCell();
                Phrase paragraph = null;
                Font font = null;
                String cellText = "";
                try {
                    double d = Double.parseDouble(currentScale.gettScore());
                    if(d > 75)
                    {
                        font = FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.RED);
                    }
                }
                catch (Exception e) {

                }
                paragraph = new Phrase(currentScale.gettScore());
                if(font != null)
                {
                    paragraph.setFont(font);
                }
                cell.addElement(paragraph);
                table.addCell(cell);
            }

        });

        document.add(table);
    }

    private void addTitlePage(Document document) throws DocumentException {
        document.newPage();

        Paragraph titlePage = new Paragraph();
        addEmptyLine(titlePage, 1);
        titlePage.add(new Paragraph("MMPI-2"));

        addEmptyLine(titlePage, 1);
        titlePage.add(new Paragraph(
                "Report generated by: " + System.getProperty("user.name") + ", " + new Date()));
        addEmptyLine(titlePage, 3);
        titlePage.add(new Paragraph(
                "Originally Implemented: http://www.ohiofamilyrights.com/docs/MMPI_scoring.html"));

        addEmptyLine(titlePage, 3);
        titlePage.add(new Paragraph(
                "Software used to generate report: https://github.com/rumplestilzken/mmpi2/"));

        addEmptyLine(titlePage, 3);

        titlePage.add(new Paragraph("T Scale Used: " + (isMale ? "Male" : "Female")));

        addEmptyLine(titlePage, 3);

        titlePage.add(new Paragraph("Form: " + (isLong ? "Long" : "Short")));

        document.add(titlePage);
    }

    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }
}
