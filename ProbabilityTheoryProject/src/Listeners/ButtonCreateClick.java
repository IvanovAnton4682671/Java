package Listeners;

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

    public ButtonCreateClick(JCheckBox []checkBoxesTheory, JCheckBox []checkBoxesPractice, JTextField textFieldQuantity, JRadioButton radioButtonMany, JRadioButton radioButtonOne, JTextField textFieldSave)
    {
        this.checkBoxesTheory = checkBoxesTheory;
        this.checkBoxesPractice = checkBoxesPractice;
        this.textFieldQuantity = textFieldQuantity;
        this.radioButtonMany = radioButtonMany;
        this.radioButtonOne = radioButtonOne;
        this.textFieldSave = textFieldSave;
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
        }
        else JOptionPane.showMessageDialog(null, "Пожалуйста, убедитесь, что вы ввели все данные корректно:" + "\nвыбран хотя бы 1 номер;"
                + "\nвведено корректное число вариантов;" + "\nвыбран способ сохранения;" + "\nуказан корректный путь сохранения.");
    }
}