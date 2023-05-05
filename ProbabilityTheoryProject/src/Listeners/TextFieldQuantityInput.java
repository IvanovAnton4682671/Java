package Listeners;

import javax.swing.*;
import java.awt.event.*;

public class TextFieldQuantityInput extends KeyAdapter
{
    /////////////////////////////////////////
    //передаём объект и создаём конструктор//
    /////////////////////////////////////////
    private final JTextField textFieldQuantity;

    public TextFieldQuantityInput(JTextField textFieldQuantity)
    {
        this.textFieldQuantity = textFieldQuantity;
    }

    ////////////////////////////////////
    //если цифры - можно, иначе нельзя//
    ////////////////////////////////////
    public void keyTyped(KeyEvent e)
    {
        if (Character.isDigit(e.getKeyChar()))
            return;
        else e.consume();
    }

    ////////////////////////////////////////////////
    //гетер (хз для чего, джава попросила сделать)//
    ////////////////////////////////////////////////
    public JTextField getTextFieldQuantity() { return textFieldQuantity; }
}