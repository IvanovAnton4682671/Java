package Listeners;

import javax.swing.*;
import java.awt.event.*;

public class ButtonPracticeClick implements ActionListener
{
    /////////////////////////////////////////
    //передаём объект и создаём конструктор//
    /////////////////////////////////////////
    private final JCheckBox []checkBoxesPractice;

    public ButtonPracticeClick(JCheckBox []checkBoxesPractice)
    {
        this.checkBoxesPractice = checkBoxesPractice;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //тут всё просто - считаем кол-во нажатых чекбоксов и там уже туда-сюда (если все - отжимаем, иначе - дожимаем все)//
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void actionPerformed(ActionEvent e)
    {
        int kol = 0;
        for (JCheckBox cbp : checkBoxesPractice)
        {
            if (cbp.isSelected())
                kol++;
        }
        if (kol < 14)
        {
            for (JCheckBox cbp : checkBoxesPractice)
                cbp.setSelected(true);
        }
        else
        {
            for (JCheckBox cbp : checkBoxesPractice)
                cbp.setSelected(false);
        }
    }

    /////////////////////////////////////////////////
    //гетер (хз для чего, джава попросила сделать)//
    /////////////////////////////////////////////////
    public JCheckBox[] checkBoxesPractice() { return checkBoxesPractice; }
}