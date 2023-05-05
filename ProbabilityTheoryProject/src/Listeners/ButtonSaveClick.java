package Listeners;

import javax.swing.*;
import java.awt.event.*;

public class ButtonSaveClick implements ActionListener
{
    //////////////////////////////////////////
    //передаём объекты и создаём конструктор//
    //////////////////////////////////////////
    private final JFileChooser fileChooser;
    private final JTextField textFieldSave;

    public ButtonSaveClick(JFileChooser fileChooser, JTextField textFieldSave)
    {
        this.fileChooser = fileChooser;
        this.textFieldSave = textFieldSave;
    }

    /////////////////////////////////////////////////////////////
    //просто вставляем выбранный путь в поле (шоб красиво было)//
    /////////////////////////////////////////////////////////////
    public void actionPerformed(ActionEvent e)
    {
        fileChooser.showOpenDialog(this.fileChooser);
        textFieldSave.setText(fileChooser.getSelectedFile().getAbsolutePath());
    }

    /////////////////////////////////////////////////
    //гетеры (хз для чего, джава попросила сделать)//
    /////////////////////////////////////////////////
    public JFileChooser getFileChooser() { return fileChooser; }
    public JTextField getTextFieldSave() { return textFieldSave; }
}