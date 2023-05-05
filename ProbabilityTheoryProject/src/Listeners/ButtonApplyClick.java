package Listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonApplyClick implements ActionListener
{
    //////////////////////////////////////////
    //передаём объекты и создаём конструктор//
    //////////////////////////////////////////
    private final JComboBox<String> comboBoxFonts;
    private final JComboBox<Integer> comboBoxSizes;
    private final JTextPane textPaneVariant;
    private final JTextPane textPaneAnswers;

    public ButtonApplyClick(JComboBox<String> comboBoxFonts, JComboBox<Integer> comboBoxSizes, JTextPane textPaneVariant, JTextPane textPaneAnswers)
    {
        this.comboBoxFonts = comboBoxFonts;
        this.comboBoxSizes = comboBoxSizes;
        this.textPaneVariant = textPaneVariant;
        this.textPaneAnswers = textPaneAnswers;
    }

    public void actionPerformed(ActionEvent e)
    {
        ///////////////////////////////////////
        //берём шрифт и размер из комбобоксов//
        ///////////////////////////////////////
        String s_font = String.valueOf(comboBoxFonts.getSelectedItem());
        String s_size = String.valueOf(comboBoxSizes.getSelectedItem());
        int size = Integer.parseInt(s_size);
        Font font = new Font(s_font, Font.PLAIN, size);
        textPaneVariant.setFont(font);
        textPaneAnswers.setFont(font);
    }

    /////////////////////////////////////////////////
    //гетеры (хз для чего, джава попросила сделать)//
    /////////////////////////////////////////////////
    public JComboBox<String> getComboBoxFonts() { return comboBoxFonts; }
    public JComboBox<Integer> getComboBoxSizes() { return comboBoxSizes; }
    public JTextPane getTextPaneVariant() { return textPaneVariant; }
    public JTextPane getTextPaneAnswers() { return textPaneAnswers; }
}