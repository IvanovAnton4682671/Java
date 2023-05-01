package Listeners;

import javax.swing.*;
import java.awt.event.*;

public class ButtonPracticeClick implements ActionListener
{
    private final JCheckBox []checkBoxesPractice;

    public ButtonPracticeClick(JCheckBox []checkBoxesPractice)
    {
        this.checkBoxesPractice = checkBoxesPractice;
    }

    public void actionPerformed(ActionEvent e)
    {
        int kol = 0;
        for (JCheckBox cbt : checkBoxesPractice)
        {
            if (cbt.isSelected())
                kol++;
        }
        if (kol < 14)
        {
            for (JCheckBox cbt : checkBoxesPractice)
                cbt.setSelected(true);
        }
        else
        {
            for (JCheckBox cbt : checkBoxesPractice)
                cbt.setSelected(false);
        }
    }

    public JCheckBox[] checkBoxesPractice() { return checkBoxesPractice; }
}