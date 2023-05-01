package Listeners;

import javax.swing.*;
import java.awt.event.*;

public class TextFieldQuantityInput extends KeyAdapter
{
    private final JTextField textFieldQuantity;

    public TextFieldQuantityInput(JTextField textFieldQuantity)
    {
        this.textFieldQuantity = textFieldQuantity;
    }

    public void keyTyped(KeyEvent e)
    {
        if (Character.isDigit(e.getKeyChar()))
            return;
        else e.consume();
    }

    public JTextField getTextFieldQuantity() { return textFieldQuantity; }
}