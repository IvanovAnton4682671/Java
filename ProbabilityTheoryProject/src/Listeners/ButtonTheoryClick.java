package Listeners;

import javax.swing.*;
import java.awt.event.*;

public class ButtonTheoryClick implements ActionListener
{
    private final JCheckBox []checkBoxesTheory;

    public ButtonTheoryClick(JCheckBox []checkBoxesTheory)
    {
        this.checkBoxesTheory = checkBoxesTheory;
    }

    public void actionPerformed(ActionEvent e)
    {
        int kol = 0;
        for (JCheckBox cbt : checkBoxesTheory)
        {
            if (cbt.isSelected())
                kol++;
        }
        if (kol < 5)
        {
            for (JCheckBox cbt : checkBoxesTheory)
                cbt.setSelected(true);
        }
        else
        {
            for (JCheckBox cbt : checkBoxesTheory)
                cbt.setSelected(false);
        }
    }

    public JCheckBox[] getCheckBoxesTheory() { return checkBoxesTheory; }
}