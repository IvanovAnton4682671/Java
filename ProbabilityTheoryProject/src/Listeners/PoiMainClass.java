package Listeners;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;

import java.io.*;
import java.math.BigInteger;

/////////////////////////////////////////////////////////////////////////
//это трогать не надо, если сломается этот класс - сломаются все задачи//
/////////////////////////////////////////////////////////////////////////

public class PoiMainClass {
    private final String nameFile;   //путь и его название
    private final XWPFDocument docx; //документ, с ним
    private XWPFTable table;         //создание таблицы
    private XWPFParagraph paragraph; //блок строк (даже картинки)
    private XWPFRun run;             //используем для установки текста, картинок
    private final String font;       //шрифт
    private final int fontSize;      //размер шрифта
    PoiMainClass(String nameFile, String font, int fontSize){
        this.nameFile = nameFile;
        this.font = font;
        this.fontSize = fontSize;
        docx = new XWPFDocument();
    }
    public void newParagraph(){
        paragraph = docx.createParagraph();
        run = paragraph.createRun();
    }
    public XWPFDocument getDocx(){
        return docx;
    }
    public void addHeader(String str){
        addTextBoltCenter(str);
        newParagraph();
        run.setFontSize(fontSize);
        run.setText("Фамилия______________________Группа________");
        run.addBreak();
        run.setFontFamily(font);
    }
    public void addTab(){
        run = paragraph.createRun();
        run.addTab();
    }
    public void addTextBreak(String str){
        run = paragraph.createRun();
        run.setFontSize(fontSize);
        run.setText(str);
        run.addBreak();
        run.setFontFamily(font);
    }
    public void addText(String str){
        run = paragraph.createRun();
        run.setFontSize(fontSize);
        run.setText(str);
        run.addTab();
        run.setFontFamily(font);
    }
    public void addTextLeft(String str, XWPFParagraph paragraph1){
        run = paragraph1.createRun();
        run.setFontSize(fontSize);
        run.setText(str);
        //run.addTab();
        run.setFontFamily(font);
    }
    public void addTextRight(String str, XWPFParagraph paragraph2){
        run = paragraph2.createRun();
        run.setFontSize(fontSize);
        run.setText(str);
        //run.addTab();
        run.setFontFamily(font);
    }
    public void addTextArray(int[] array){
        run.setFontSize(fontSize);
        run.setFontFamily(font);
        for (int j : array) run.setText(j + ", ");
    }
    public void addTextBoltCenter(String str){
        paragraph.setAlignment(ParagraphAlignment.CENTER); //right, left, bottom и т.д.
        run.setFontSize(fontSize);
        run.setBold(true);
        run.setText(str);
        run.addBreak();
        run.setFontFamily(font);
    }
    public void addTextBolt(String str){
        run.setFontSize(fontSize);
        run.setFontFamily(font);
        run.setBold(true);
        run.setText(str);
        //run.addTab();
    }
    public void setTableAlign(XWPFTable table,ParagraphAlignment align) {
        CTTblPr tblPr = table.getCTTbl().getTblPr();
        CTJc jc = (tblPr.isSetJc() ? tblPr.getJc() : tblPr.addNewJc());
        STJc.Enum en = STJc.Enum.forInt(align.getValue());
        jc.setVal(en);
    }
    public void initTable(int row, int col){
        table = docx.createTable(row, col);
        setTableAlign(table, ParagraphAlignment.CENTER);
        //table.setCellMargins(5, 200, 5, 200);
        table.setCellMargins(5, 100, 5, 100);
    }
    public void addTaleItem(String str, int row, int col){
        paragraph = table.getRow(row).getCell(col).getParagraphs().get(0);
        paragraph.setAlignment(ParagraphAlignment.CENTER);
        run = paragraph.createRun();
        run.setFontSize(fontSize);
        run.setText(str);
        run.setFontFamily(font);
    }
    public void addTableArrayRow(String[] s, int row){
        for(int i = 0; i < s.length; i++){
            addTaleItem(s[i], row, i);
        }
    }
    public void initCol(int[] taskArray){
        for(int i = 0; i < taskArray.length; i++) {
            addTaleItem(String.valueOf(taskArray[i]), i + 1, 0);
        }
    }
    public void initRow(int numRow){
        addTaleItem("№", 0, 0);
        for(int i = 1; i <= numRow; i++){
            addTaleItem("Вар-"+i, 0, i);
        }
    }
    public void initRow(int a, int b){
        addTaleItem("№", 0, 0);
        for(int i = 0; i < b; i++){
            addTaleItem("Вар-" + a, 0, i+1);
            a++;
        }
    }
    public void addPicture(String picture, int width, int height){
        File image = new File(picture);
        FileInputStream imageData = null;
        try {
            imageData = new FileInputStream(image);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int imageType = XWPFDocument.PICTURE_TYPE_JPEG;
        String imageFileName = image.getName();
        try {
            run.addPicture(imageData, imageType, imageFileName,
                    Units.toEMU(width),
                    Units.toEMU(height));
            run.addBreak();
        } catch (InvalidFormatException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void addPictureLeft(String picture, int width, int height, XWPFParagraph paragraph1){
        paragraph1.setAlignment(ParagraphAlignment.LEFT);
        File image = new File(picture);
        FileInputStream imageData = null;
        try {
            imageData = new FileInputStream(image);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int imageType = XWPFDocument.PICTURE_TYPE_JPEG;
        String imageFileName = image.getName();
        try {
            run.addPicture(imageData, imageType, imageFileName,
                    Units.toEMU(width),
                    Units.toEMU(height));
            //run.addBreak();
        } catch (InvalidFormatException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void addPictureRight(String picture, int width, int height, XWPFParagraph paragraph2){
        paragraph2.setAlignment(ParagraphAlignment.RIGHT);
        File image = new File(picture);
        FileInputStream imageData = null;
        try {
            imageData = new FileInputStream(image);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int imageType = XWPFDocument.PICTURE_TYPE_JPEG;
        String imageFileName = image.getName();
        try {
            run.addPicture(imageData, imageType, imageFileName,
                    Units.toEMU(width),
                    Units.toEMU(height));
            //run.addBreak();
        } catch (InvalidFormatException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void printToFile(){
        try {
            System.out.println(nameFile+".docx");
            FileOutputStream out = new FileOutputStream(nameFile+".docx");
            docx.write(out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*public void changeOrientation()
    {
        CTDocument1 doc1 = docx.getDocument();
        CTBody body = doc1.getBody();
        if (!body.isSetSectPr())
            body.addNewSectPr();
        CTSectPr section = body.getSectPr();
        if (!section.isSetPgSz())
            section.addNewPgSz();
        CTPageSz pageSize = section.getPgSz();
        pageSize.setW(BigInteger.valueOf(15840));
        pageSize.setH(BigInteger.valueOf(12240));
        pageSize.setOrient(STPageOrientation.LANDSCAPE);
    }*/
}