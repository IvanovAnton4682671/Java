package Listeners;

import javax.swing.*;
import java.awt.event.*;

public class ButtonTheoryClick implements ActionListener
{
    /////////////////////////////////////////
    //передаём объект и создаём конструктор//
    /////////////////////////////////////////
    private final JCheckBox []checkBoxesTheory;

    public ButtonTheoryClick(JCheckBox []checkBoxesTheory)
    {
        this.checkBoxesTheory = checkBoxesTheory;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //тут всё просто - считаем кол-во нажатых чекбоксов и там уже туда-сюда (если все - отжимаем, иначе - дожимаем все)//
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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

    ////////////////////////////////////////////////
    //гетер (хз для чего, джава попросила сделать)//
    ////////////////////////////////////////////////
    public JCheckBox[] getCheckBoxesTheory() { return checkBoxesTheory; }
}