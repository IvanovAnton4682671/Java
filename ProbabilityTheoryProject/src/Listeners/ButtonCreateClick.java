package Listeners;

import Functions.TheoryTask1;
import Functions.TheoryTask2;
import Functions.TheoryTask3;

import javax.swing.*;
import java.awt.event.*;

public class ButtonCreateClick implements ActionListener
{
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

    public ButtonCreateClick(JCheckBox []checkBoxesTheory, JCheckBox []checkBoxesPractice, JTextField textFieldQuantity, JRadioButton radioButtonMany, JRadioButton radioButtonOne, JTextField textFieldSave, JComboBox<String> comboBoxFonts, JComboBox<Integer> comboBoxSizes, JCheckBox checkBoxTheory1, JCheckBox checkBoxTheory2, JCheckBox checkBoxTheory3, JCheckBox checkBoxTheory4, JCheckBox checkBoxTheory5, JCheckBox checkBoxPractice1, JCheckBox checkBoxPractice2, JCheckBox checkBoxPractice3, JCheckBox checkBoxPractice4, JCheckBox checkBoxPractice5, JCheckBox checkBoxPractice6, JCheckBox checkBoxPractice7, JCheckBox checkBoxPractice8, JCheckBox checkBoxPractice9, JCheckBox checkBoxPractice10, JCheckBox checkBoxPractice11, JCheckBox checkBoxPractice12, JCheckBox checkBoxPractice13, JCheckBox checkBoxPractice14)
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
        int kolTheory = 0;
        for (JCheckBox cbt : checkBoxesTheory)
            if (cbt.isSelected())
                kolTheory ++;
        int kolPractice = 0;
        for (JCheckBox cbp : checkBoxesPractice)
            if (cbp.isSelected())
                kolPractice++;
        String strQuantity = textFieldQuantity.getText();
        String strSave = textFieldSave.getText();
        if ((kolTheory > 0 || kolPractice > 0) && !strQuantity.isEmpty() && strQuantity.charAt(0) != '0' && (radioButtonMany.isSelected() || radioButtonOne.isSelected()) && !strSave.isEmpty())
        {
            if (radioButtonMany.isSelected())
            {
                //передаю шрифт и размер
                String font = String.valueOf(comboBoxFonts.getSelectedItem());
                String f_size = String.valueOf(comboBoxSizes.getSelectedItem());
                int fontSize = Integer.parseInt(f_size);

                //передаю директорию файла с ответами
                String nameFileAnswers = "\\Ответы";
                //String nameFileSaveAnswer = strSave + nameFileAnswers;
                String nameFileSaveAnswer = "Ответы";

                //записываю в него "Ответы"
                PoiMainClass poiMainClassAnswers = new PoiMainClass(nameFileSaveAnswer, font, fontSize);
                poiMainClassAnswers.newParagraph();
                poiMainClassAnswers.addTextBoltCenter("Ответы.");
                poiMainClassAnswers.newParagraph();

                int kol = Integer.parseInt(strQuantity);
                for (int i = 1; i <= kol; i++)
                {
                    //создаю фаылй вариантов, записываю в них номер варианта, и пишу в ответах ответы для данного варианта
                    String nameFileVariant = "\\Вариант " + i;
                    //String nameFileSaveVariant = strSave + nameFileVariant;
                    String nameFileSaveVariant = "Вариант" + i;
                    PoiMainClass poiMainClassVariant = new PoiMainClass(nameFileSaveVariant, font, fontSize);
                    poiMainClassVariant.newParagraph();
                    poiMainClassVariant.addTextBoltCenter("Вариант " + i + ".");
                    poiMainClassAnswers.newParagraph();
                    poiMainClassAnswers.addText("Вариант " + i + ":");
                    if (checkBoxTheory1.isSelected())
                    {
                        TheoryTask1 theoryTask1 = new TheoryTask1(poiMainClassVariant, poiMainClassAnswers);
                        theoryTask1.theoryTask1Function();
                    }
                    if (checkBoxTheory2.isSelected())
                    {
                        TheoryTask2 theoryTask2 = new TheoryTask2(poiMainClassVariant, poiMainClassAnswers);
                        theoryTask2.theoryTask2Function();
                    }
                    if (checkBoxTheory3.isSelected())
                    {
                        TheoryTask3 theoryTask3 = new TheoryTask3(poiMainClassVariant, poiMainClassAnswers);
                        theoryTask3.theoryTask3Function();
                    }
                    poiMainClassVariant.printToFile();
                }
                poiMainClassAnswers.printToFile();
            }
            if (radioButtonOne.isSelected())
            {
            }
        }
        else JOptionPane.showMessageDialog(null, "Пожалуйста, убедитесь, что вы ввели все данные корректно:" + "\nвыбран хотя бы 1 номер;"
                + "\nвведено корректное число вариантов;" + "\nвыбран способ сохранения;" + "\nуказан корректный путь сохранения.");
    }
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