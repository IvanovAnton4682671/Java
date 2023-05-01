package Listeners;

import javax.swing.*;
import java.awt.event.*;

public class TextFieldSaveInput extends KeyAdapter
{
    private final JTextField textFieldSave;

    public TextFieldSaveInput(JTextField textFieldSave)
    {
        this.textFieldSave = textFieldSave;
    }

    public void keyTyped(KeyEvent e)
    {
        if(Character.isAlphabetic(e.getKeyChar()) || Character.isDigit(e.getKeyChar()) || Character.isDefined(e.getKeyChar()))
            e.consume();
    }

    public JTextField getTextFieldSave() { return textFieldSave; }
}