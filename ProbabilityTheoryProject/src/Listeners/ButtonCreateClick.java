package Listeners;

import Functions.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class ButtonCreateClick implements ActionListener
{
    //////////////////////////////////////////
    //самая главная кнопка, делает все файлы//
    //////////////////////////////////////////
    //передаём объекты и создаём конструктор//
    //////////////////////////////////////////
    private final JCheckBox []checkBoxesTheory;
    private final JCheckBox []checkBoxesPractice;
    private final JTextField textFieldQuantity;
    private final JRadioButton radioButtonMany;
    private final JRadioButton radioButtonOne;
    private final JTextField textFieldSave;
    private final JComboBox<String> comboBoxFonts;
    private final JComboBox<Integer> comboBoxSizes;
    private final JCheckBox checkBoxTheory1;
    private final JCheckBox checkBoxTheory2;
    private final JCheckBox checkBoxTheory3;
    private final JCheckBox checkBoxTheory4;
    private final JCheckBox checkBoxTheory5;
    private final JCheckBox checkBoxPractice1;
    private final JCheckBox checkBoxPractice2;
    private final JCheckBox checkBoxPractice3;
    private final JCheckBox checkBoxPractice4;
    private final JCheckBox checkBoxPractice5;
    private final JCheckBox checkBoxPractice6;
    private final JCheckBox checkBoxPractice7;
    private final JCheckBox checkBoxPractice8;
    private final JCheckBox checkBoxPractice9;
    private final JCheckBox checkBoxPractice10;
    private final JCheckBox checkBoxPractice11;
    private final JCheckBox checkBoxPractice12;
    private final JCheckBox checkBoxPractice13;
    private final JCheckBox checkBoxPractice14;

    public ButtonCreateClick(JCheckBox []checkBoxesTheory, JCheckBox []checkBoxesPractice, JTextField textFieldQuantity, JRadioButton radioButtonMany, JRadioButton radioButtonOne,
                             JTextField textFieldSave, JComboBox<String> comboBoxFonts, JComboBox<Integer> comboBoxSizes, JCheckBox checkBoxTheory1, JCheckBox checkBoxTheory2,
                             JCheckBox checkBoxTheory3, JCheckBox checkBoxTheory4, JCheckBox checkBoxTheory5, JCheckBox checkBoxPractice1, JCheckBox checkBoxPractice2,
                             JCheckBox checkBoxPractice3, JCheckBox checkBoxPractice4, JCheckBox checkBoxPractice5, JCheckBox checkBoxPractice6, JCheckBox checkBoxPractice7,
                             JCheckBox checkBoxPractice8, JCheckBox checkBoxPractice9, JCheckBox checkBoxPractice10, JCheckBox checkBoxPractice11, JCheckBox checkBoxPractice12,
                             JCheckBox checkBoxPractice13, JCheckBox checkBoxPractice14)
    {
        this.checkBoxesTheory = checkBoxesTheory;
        this.checkBoxesPractice = checkBoxesPractice;
        this.textFieldQuantity = textFieldQuantity;
        this.radioButtonMany = radioButtonMany;
        this.radioButtonOne = radioButtonOne;
        this.textFieldSave = textFieldSave;
        this.comboBoxFonts = comboBoxFonts;
        this.comboBoxSizes = comboBoxSizes;
        this.checkBoxTheory1 = checkBoxTheory1;
        this.checkBoxTheory2 = checkBoxTheory2;
        this.checkBoxTheory3 = checkBoxTheory3;
        this.checkBoxTheory4 = checkBoxTheory4;
        this.checkBoxTheory5 = checkBoxTheory5;
        this.checkBoxPractice1 = checkBoxPractice1;
        this.checkBoxPractice2 = checkBoxPractice2;
        this.checkBoxPractice3 = checkBoxPractice3;
        this.checkBoxPractice4 = checkBoxPractice4;
        this.checkBoxPractice5 = checkBoxPractice5;
        this.checkBoxPractice6 = checkBoxPractice6;
        this.checkBoxPractice7 = checkBoxPractice7;
        this.checkBoxPractice8 = checkBoxPractice8;
        this.checkBoxPractice9 = checkBoxPractice9;
        this.checkBoxPractice10 = checkBoxPractice10;
        this.checkBoxPractice11 = checkBoxPractice11;
        this.checkBoxPractice12 = checkBoxPractice12;
        this.checkBoxPractice13 = checkBoxPractice13;
        this.checkBoxPractice14 = checkBoxPractice14;
    }

    public void actionPerformed(ActionEvent e)
    {
        ///////////////////////////////////////////////////////////////
        //считаем выбранные чекбоксы, смотрим указанное кол-во и путь//
        ///////////////////////////////////////////////////////////////
        int kolTheory = 0;
        for (JCheckBox cbt : checkBoxesTheory)
            if (cbt.isSelected())
                kolTheory ++;
        int kolPractice = 0;
        for (JCheckBox cbp : checkBoxesPractice)
            if (cbp.isSelected())
                kolPractice++;
        int generalKol = kolTheory + kolPractice;
        String strQuantity = textFieldQuantity.getText();
        String strSave = textFieldSave.getText();
        //////////////////////////////////
        //если всё гуд - начинается мясо//
        //////////////////////////////////
        if ((kolTheory > 0 || kolPractice > 0) && !strQuantity.isEmpty() && strQuantity.charAt(0) != '0' && (radioButtonMany.isSelected() || radioButtonOne.isSelected()) && !strSave.isEmpty())
        {
            ////////////////////////////
            //сохраняем в разные файлы//
            ////////////////////////////
            if (radioButtonMany.isSelected())
            {
                ////////////////////////////////////////////////////////////
                //создаю папку по указанному пути, в которой всё сохраняем//
                ////////////////////////////////////////////////////////////
                new File(strSave).mkdirs();

                //////////////////////////
                //передаю шрифт и размер//
                //////////////////////////
                String font = String.valueOf(comboBoxFonts.getSelectedItem());
                String f_size = String.valueOf(comboBoxSizes.getSelectedItem());
                int fontSize = Integer.parseInt(f_size);

                ///////////////////////////////////////
                //передаю директорию файла с ответами//
                ///////////////////////////////////////
                String nameFileAnswers = "\\Ответы";
                String nameFileSaveAnswer = strSave + nameFileAnswers;

                /////////////////////////////
                //записываю в него "Ответы"//
                /////////////////////////////
                //PoiMainClass poiMainClassAnswers = new PoiMainClass(nameFileSaveAnswer, font, fontSize);
                String fontTable = "Times New Roman";
                int fontSizeTable = 10;
                if (generalKol < 14)
                    fontSizeTable = 18;
                else if (generalKol < 16)
                    fontSizeTable = 16;
                else if (generalKol < 17)
                    fontSizeTable = 14;
                else if (generalKol < 19)
                    fontSizeTable = 12;
                else if (generalKol < 20)
                    fontSizeTable = 11;
                PoiMainClass poiMainClassAnswers = new PoiMainClass(nameFileSaveAnswer, fontTable, fontSizeTable);
                poiMainClassAnswers.newParagraph();
                poiMainClassAnswers.addTextBoltCenter("Ответы.");
                ///////////////////////////////////////////////////////////////////////////////////
                //создаю таблицу с ответами, заполняю её вариантами и выбранными задачами(шаблон)//
                ///////////////////////////////////////////////////////////////////////////////////
                int kol = Integer.parseInt(strQuantity);
                poiMainClassAnswers.newParagraph();
                poiMainClassAnswers.initTable((kol + 1), (generalKol + 1));
                for (int q = 1; q <= kol; q++)
                    poiMainClassAnswers.addTaleItem("Вар " + q, q, 0);
                int var = 1;
                for (int i = 0; i < 5; i++)
                {
                    if (checkBoxesTheory[i].isSelected())
                    {
                        poiMainClassAnswers.addTaleItem(String.valueOf(i + 1), 0, var);
                        var++;
                    }
                }
                for (int i = 0; i < 14; i++)
                {
                    if (checkBoxesPractice[i].isSelected())
                    {
                        poiMainClassAnswers.addTaleItem(String.valueOf(i + 6), 0, var);
                        var++;
                    }
                }
                //poiMainClassAnswers.newParagraph();

                /////////////////////////////////////
                //берём число вариантов и делаем их//
                /////////////////////////////////////
                kol = Integer.parseInt(strQuantity);
                for (int i = 1; i <= kol; i++)
                {
                    //////////////////////////////////////////////////////////////////////////////
                    //передаём номер колонки, увеличиваем каждый раз, как записываем в неё номер//
                    //////////////////////////////////////////////////////////////////////////////
                    var = 1;
                    ////////////////////////////////////////////////////////////////////////////////////////////////////////
                    //создаю файлы вариантов, записываю в них номер варианта, и пишу в ответах ответы для данного варианта//
                    ////////////////////////////////////////////////////////////////////////////////////////////////////////
                    String nameFileVariant = "\\Вариант " + i;
                    String nameFileSaveVariant = strSave + nameFileVariant;
                    PoiMainClass poiMainClassVariant = new PoiMainClass(nameFileSaveVariant, font, fontSize);
                    poiMainClassVariant.newParagraph();
                    poiMainClassVariant.addTextBoltCenter("Вариант " + i + ".");
                    //poiMainClassAnswers.newParagraph();
                    //poiMainClassAnswers.addText("Вариант " + i + ":");
                    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    //просматриваем каждый чекбокс, нажат - делаем соответствующее ему задание (реализовано всрато, но я не придумал как сделать иначе)//
                    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    if (checkBoxTheory1.isSelected())
                    {
                        //////////////////////////////////////////////////////////////////////////////////////////
                        //передаём номер строки в таблице, чтобы записывать в строку с соответствующим вариантом//
                        //////////////////////////////////////////////////////////////////////////////////////////
                        int num = i;
                        TheoryTask1 theoryTask1 = new TheoryTask1(poiMainClassVariant, poiMainClassAnswers, num, var);
                        theoryTask1.theoryTask1Function();
                        var++;
                    }
                    if (checkBoxTheory2.isSelected())
                    {
                        int num = i;
                        TheoryTask2 theoryTask2 = new TheoryTask2(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        theoryTask2.theoryTask2Function();
                        var++;
                    }
                    if (checkBoxTheory3.isSelected())
                    {
                        int num = i;
                        TheoryTask3 theoryTask3 = new TheoryTask3(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        theoryTask3.theoryTask3Function();
                        var++;
                    }
                    if (checkBoxTheory4.isSelected())
                    {
                        int num = i;
                        TheoryTask4 theoryTask4 = new TheoryTask4(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        theoryTask4.theoryTask4Function();
                        var++;
                    }
                    if (checkBoxTheory5.isSelected())
                    {
                        int num = i;
                        TheoryTask5 theoryTask5 = new TheoryTask5(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        theoryTask5.theoryTask5Function();
                        var++;
                    }
                    if (checkBoxPractice1.isSelected())
                    {
                        int num = i;
                        PracticeTask6 practiceTask6 = new PracticeTask6(poiMainClassVariant, poiMainClassAnswers, num, var);
                        practiceTask6.practiceTask6Function();
                        var++;
                    }
                    if (checkBoxPractice2.isSelected())
                    {
                        int num = i;
                        PracticeTask7 practiceTask7 = new PracticeTask7(poiMainClassVariant, poiMainClassAnswers, num, var);
                        practiceTask7.practiceTask7Function();
                        var++;
                    }
                    if (checkBoxPractice3.isSelected())
                    {
                        int num = i;
                        PracticeTask8 practiceTask8 = new PracticeTask8(poiMainClassVariant, poiMainClassAnswers, num, var);
                        practiceTask8.practiceTask8Function();
                        var++;
                    }
                    if (checkBoxPractice4.isSelected())
                    {
                        int num = i;
                        PracticeTask9 practiceTask9 = new PracticeTask9(poiMainClassVariant, poiMainClassAnswers, num, var);
                        practiceTask9.practiceTask9Function();
                        var++;
                    }
                    if (checkBoxPractice5.isSelected())
                    {
                        int num = i;
                        PracticeTask10 practiceTask10 = new PracticeTask10(poiMainClassVariant, poiMainClassAnswers, num, var);
                        practiceTask10.practiceTask10Function();
                        var++;
                    }
                    if (checkBoxPractice6.isSelected())
                    {
                        int num = i;
                        PracticeTask11 practiceTask11 = new PracticeTask11(poiMainClassVariant, poiMainClassAnswers, num, var);
                        practiceTask11.practiceTask11Function();
                        var++;
                    }
                    if (checkBoxPractice7.isSelected())
                    {
                        int num = i;
                        PracticeTask12 practiceTask12 = new PracticeTask12(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        practiceTask12.practiceTask12Function();
                        var++;
                    }
                    if (checkBoxPractice8.isSelected())
                    {
                        int num = i;
                        PracticeTask13 practiceTask13 = new PracticeTask13(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        practiceTask13.practiceTask13Function();
                        var++;
                    }
                    if (checkBoxPractice9.isSelected())
                    {
                        int num = i;
                        PracticeTask14 practiceTask14 = new PracticeTask14(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        practiceTask14.practiceTask14Function();
                        var++;
                    }
                    if (checkBoxPractice10.isSelected())
                    {
                        int num = i;
                        PracticeTask15 practiceTask15 = new PracticeTask15(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        practiceTask15.practiceTask15Function();
                        var++;
                    }
                    if (checkBoxPractice11.isSelected())
                    {
                        int num = i;
                        PracticeTask16 practiceTask16 = new PracticeTask16(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        practiceTask16.practiceTask16Function();
                        var++;
                    }
                    if (checkBoxPractice12.isSelected())
                    {
                        int num = i;
                        PracticeTask17 practiceTask17 = new PracticeTask17(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        practiceTask17.practiceTask17Function();
                        var++;
                    }
                    if (checkBoxPractice13.isSelected())
                    {
                        int num = i;
                        PracticeTask18 practiceTask18 = new PracticeTask18(poiMainClassVariant, poiMainClassAnswers, num, var);
                        practiceTask18.practiceTask18Function();
                        var++;
                    }
                    if (checkBoxPractice14.isSelected())
                    {
                        int num = i;
                        PracticeTask19 practiceTask19 = new PracticeTask19(poiMainClassVariant, poiMainClassAnswers, num, var);
                        practiceTask19.practiceTask19Function();
                        var++;
                    }
                    poiMainClassVariant.printToFile();
                }
                poiMainClassAnswers.printToFile();
            }
            if (radioButtonOne.isSelected())
            {
                ////////////////////////////////////////////////////////////
                //создаю папку по указанному пути, в которой всё сохраняем//
                ////////////////////////////////////////////////////////////
                new File(strSave).mkdirs();

                //////////////////////////
                //передаю шрифт и размер//
                //////////////////////////
                String font = String.valueOf(comboBoxFonts.getSelectedItem());
                String f_size = String.valueOf(comboBoxSizes.getSelectedItem());
                int fontSize = Integer.parseInt(f_size);

                ///////////////////////////////////////
                //передаю директорию файла с ответами//
                ///////////////////////////////////////
                String nameFileAnswers = "\\Ответы";
                String nameFileSaveAnswer = strSave + nameFileAnswers;

                /////////////////////////////
                //записываю в него "Ответы"//
                /////////////////////////////
                //PoiMainClass poiMainClassAnswers = new PoiMainClass(nameFileSaveAnswer, font, fontSize);
                String fontTable = "Times New Roman";
                int fontSizeTable = 10;
                if (generalKol < 14)
                    fontSizeTable = 18;
                else if (generalKol < 16)
                    fontSizeTable = 16;
                else if (generalKol < 17)
                    fontSizeTable = 14;
                else if (generalKol < 19)
                    fontSizeTable = 12;
                else if (generalKol < 20)
                    fontSizeTable = 11;
                PoiMainClass poiMainClassAnswers = new PoiMainClass(nameFileSaveAnswer, fontTable, fontSizeTable);
                poiMainClassAnswers.newParagraph();
                poiMainClassAnswers.addTextBoltCenter("Ответы.");
                ///////////////////////////////////////////////////////////////////////////////////
                //создаю таблицу с ответами, заполняю её вариантами и выбранными задачами(шаблон)//
                ///////////////////////////////////////////////////////////////////////////////////
                int kol = Integer.parseInt(strQuantity);
                poiMainClassAnswers.newParagraph();
                poiMainClassAnswers.initTable((kol + 1), (generalKol + 1));
                for (int q = 1; q <= kol; q++)
                    poiMainClassAnswers.addTaleItem("Вар " + q, q, 0);
                int var = 1;
                for (int i = 0; i < 5; i++)
                {
                    if (checkBoxesTheory[i].isSelected())
                    {
                        poiMainClassAnswers.addTaleItem(String.valueOf(i + 1), 0, var);
                        var++;
                    }
                }
                for (int i = 0; i < 14; i++)
                {
                    if (checkBoxesPractice[i].isSelected())
                    {
                        poiMainClassAnswers.addTaleItem(String.valueOf(i + 6), 0, var);
                        var++;
                    }
                }
                //poiMainClassAnswers.newParagraph();

                ////////////////////////////////////
                //создали файл со всеми вариантами//
                ////////////////////////////////////
                String nameFileVariant = "\\Варианты";
                String nameFileSaveVariant = strSave + nameFileVariant;
                PoiMainClass poiMainClassVariant = new PoiMainClass(nameFileSaveVariant, font, fontSize);

                /////////////////////////////////////
                //берём число вариантов и делаем их//
                /////////////////////////////////////
                kol = Integer.parseInt(strQuantity);
                for (int i = 1; i <= kol; i++)
                {
                    var = 1;
                    poiMainClassVariant.newParagraph();
                    poiMainClassVariant.addTextBoltCenter("Вариант " + i + ".");
                    //poiMainClassAnswers.newParagraph();
                    //poiMainClassAnswers.addText("Вариант " + i + ":");
                    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    //просматриваем каждый чекбокс, нажат - делаем соответствующее ему задание (реализовано всрато, но я не придумал как сделать иначе)//
                    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    if (checkBoxTheory1.isSelected())
                    {
                         int num = i;
                        TheoryTask1 theoryTask1 = new TheoryTask1(poiMainClassVariant, poiMainClassAnswers, num, var);
                        theoryTask1.theoryTask1Function();
                        var++;
                    }
                    if (checkBoxTheory2.isSelected())
                    {
                        int num = i;
                        TheoryTask2 theoryTask2 = new TheoryTask2(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        theoryTask2.theoryTask2Function();
                        var++;
                    }
                    if (checkBoxTheory3.isSelected())
                    {
                        int num = i;
                        TheoryTask3 theoryTask3 = new TheoryTask3(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        theoryTask3.theoryTask3Function();
                        var++;
                    }
                    if (checkBoxTheory4.isSelected())
                    {
                        int num = i;
                        TheoryTask4 theoryTask4 = new TheoryTask4(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        theoryTask4.theoryTask4Function();
                        var++;
                    }
                    if (checkBoxTheory5.isSelected())
                    {
                        int num = i;
                        TheoryTask5 theoryTask5 = new TheoryTask5(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        theoryTask5.theoryTask5Function();
                        var++;
                    }
                    if (checkBoxPractice1.isSelected())
                    {
                        int num = i;
                        PracticeTask6 practiceTask6 = new PracticeTask6(poiMainClassVariant, poiMainClassAnswers, num, var);
                        practiceTask6.practiceTask6Function();
                        var++;
                    }
                    if (checkBoxPractice2.isSelected())
                    {
                        int num = i;
                        PracticeTask7 practiceTask7 = new PracticeTask7(poiMainClassVariant, poiMainClassAnswers, num, var);
                        practiceTask7.practiceTask7Function();
                        var++;
                    }
                    if (checkBoxPractice3.isSelected())
                    {
                        int num = i;
                        PracticeTask8 practiceTask8 = new PracticeTask8(poiMainClassVariant, poiMainClassAnswers, num, var);
                        practiceTask8.practiceTask8Function();
                        var++;
                    }
                    if (checkBoxPractice4.isSelected())
                    {
                        int num = i;
                        PracticeTask9 practiceTask9 = new PracticeTask9(poiMainClassVariant, poiMainClassAnswers, num, var);
                        practiceTask9.practiceTask9Function();
                        var++;
                    }
                    if (checkBoxPractice5.isSelected())
                    {
                        int num = i;
                        PracticeTask10 practiceTask10 = new PracticeTask10(poiMainClassVariant, poiMainClassAnswers, num, var);
                        practiceTask10.practiceTask10Function();
                        var++;
                    }
                    if (checkBoxPractice6.isSelected())
                    {
                        int num = i;
                        PracticeTask11 practiceTask11 = new PracticeTask11(poiMainClassVariant, poiMainClassAnswers, num, var);
                        practiceTask11.practiceTask11Function();
                        var++;
                    }
                    if (checkBoxPractice7.isSelected())
                    {
                        int num = i;
                        PracticeTask12 practiceTask12 = new PracticeTask12(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        practiceTask12.practiceTask12Function();
                        var++;
                    }
                    if (checkBoxPractice8.isSelected())
                    {
                        int num = i;
                        PracticeTask13 practiceTask13 = new PracticeTask13(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        practiceTask13.practiceTask13Function();
                        var++;
                    }
                    if (checkBoxPractice9.isSelected())
                    {
                        int num = i;
                        PracticeTask14 practiceTask14 = new PracticeTask14(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        practiceTask14.practiceTask14Function();
                        var++;
                    }
                    if (checkBoxPractice10.isSelected())
                    {
                        int num = i;
                        PracticeTask15 practiceTask15 = new PracticeTask15(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        practiceTask15.practiceTask15Function();
                        var++;
                    }
                    if (checkBoxPractice11.isSelected())
                    {
                        int num = i;
                        PracticeTask16 practiceTask16 = new PracticeTask16(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        practiceTask16.practiceTask16Function();
                        var++;
                    }
                    if (checkBoxPractice12.isSelected())
                    {
                        int num = i;
                        PracticeTask17 practiceTask17 = new PracticeTask17(poiMainClassVariant, poiMainClassAnswers, fontSize, num, var);
                        practiceTask17.practiceTask17Function();
                        var++;
                    }
                    if (checkBoxPractice13.isSelected())
                    {
                        int num = i;
                        PracticeTask18 practiceTask18 = new PracticeTask18(poiMainClassVariant, poiMainClassAnswers, num, var);
                        practiceTask18.practiceTask18Function();
                        var++;
                    }
                    if (checkBoxPractice14.isSelected())
                    {
                        int num = i;
                        PracticeTask19 practiceTask19 = new PracticeTask19(poiMainClassVariant, poiMainClassAnswers, num, var);
                        practiceTask19.practiceTask19Function();
                        var++;
                    }
                    poiMainClassVariant.printToFile();
                    if (i < kol) poiMainClassVariant.newPage();
                }
                poiMainClassAnswers.printToFile();
            }
            ///////////////////////////////////////////////////////////
            //когда всё создалось - показываем пользователю сообщение//
            ///////////////////////////////////////////////////////////
            int kol = Integer.parseInt(strQuantity);
            if (kol == 1)
                JOptionPane.showMessageDialog(null, "Ваш " + kol + " вариант готов и находится по пути " + strSave);
            else
                JOptionPane.showMessageDialog(null, "Ваши варианты в количестве " + kol + " готовы и находятся по пути " + strSave);
            ///////////////////////////////////////////
            //открываем папку с созданными вариантами//
            ///////////////////////////////////////////
            Desktop desktop = null;
            if (Desktop.isDesktopSupported())
            {
                desktop = Desktop.getDesktop();
            }
            try
            {
                desktop.open(new File(strSave));
            }
            catch (IOException ioe)
            {
                ioe.printStackTrace();
            }
        }
        //////////////////////////////////////////////////////////
        //если егог - сообщаем пользователю, что он что-то забыл//
        //////////////////////////////////////////////////////////
        else JOptionPane.showMessageDialog(null, "Пожалуйста, убедитесь, что вы ввели все данные корректно:" + "\nвыбран хотя бы 1 номер;"
                + "\nвведено корректное число вариантов;" + "\nвыбран способ сохранения;" + "\nуказан корректный путь сохранения.");
    }

    /////////////////////////////////////////////////
    //гетеры (хз для чего, джава попросила сделать)//
    /////////////////////////////////////////////////
    public JComboBox<String> getComboBoxFonts() { return comboBoxFonts; }
    public JComboBox<Integer> getComboBoxSizes() { return comboBoxSizes; }
    public JCheckBox getCheckBoxTheory1() { return checkBoxTheory1; }
    public JCheckBox getCheckBoxTheory2() { return checkBoxTheory2; }
    public JCheckBox getCheckBoxTheory3() { return checkBoxTheory3; }
    public JCheckBox getCheckBoxTheory4() { return checkBoxTheory4; }
    public JCheckBox getCheckBoxTheory5() { return checkBoxTheory5; }
    public JCheckBox getCheckBoxPractice1() { return checkBoxPractice1; }
    public JCheckBox getCheckBoxPractice2() { return checkBoxPractice2; }
    public JCheckBox getCheckBoxPractice3() { return checkBoxPractice3; }
    public JCheckBox getCheckBoxPractice4() { return checkBoxPractice4; }
    public JCheckBox getCheckBoxPractice5() { return checkBoxPractice5; }
    public JCheckBox getCheckBoxPractice6() { return checkBoxPractice6; }
    public JCheckBox getCheckBoxPractice7() { return checkBoxPractice7; }
    public JCheckBox getCheckBoxPractice8() { return checkBoxPractice8; }
    public JCheckBox getCheckBoxPractice9() { return checkBoxPractice9; }
    public JCheckBox getCheckBoxPractice10() { return checkBoxPractice10; }
    public JCheckBox getCheckBoxPractice11() { return checkBoxPractice11; }
    public JCheckBox getCheckBoxPractice12() { return checkBoxPractice12; }
    public JCheckBox getCheckBoxPractice13() { return checkBoxPractice13; }
    public JCheckBox getCheckBoxPractice14() { return checkBoxPractice14; }
}