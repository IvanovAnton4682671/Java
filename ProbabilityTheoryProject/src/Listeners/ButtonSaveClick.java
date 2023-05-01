package Listeners;

import javax.swing.*;
import java.awt.event.*;

public class ButtonSaveClick implements ActionListener
{
    private final JFileChooser fileChooser;
    private final JTextField textFieldSave;

    public ButtonSaveClick(JFileChooser fileChooser, JTextField textFieldSave)
    {
        this.fileChooser = fileChooser;
        this.textFieldSave = textFieldSave;
    }

    public void actionPerformed(ActionEvent e)
    {
        fileChooser.showOpenDialog(this.fileChooser);
        textFieldSave.setText(fileChooser.getSelectedFile().getAbsolutePath());
    }

    public JFileChooser getFileChooser() { return fileChooser; }

    public JTextField getTextFieldSave() { return textFieldSave; }
}