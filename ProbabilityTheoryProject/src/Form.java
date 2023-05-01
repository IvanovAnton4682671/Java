import Listeners.ButtonPracticeClick;
import Listeners.ButtonTheoryClick;

import javax.swing.*;
import java.awt.event.*;

public class Form extends JFrame
{
    private JPanel mainPanel;
    private JTabbedPane tabbedPane;
    private JPanel firstPanel;
    private JPanel secondPanel;
    private JLabel labelChoice;
    private JLabel labelTheory;
    private JButton buttonTheory;
    private JLabel labelPractice;
    private JButton buttonPractice;
    private JCheckBox checkBoxTheory1;
    private JCheckBox checkBoxTheory2;
    private JCheckBox checkBoxTheory3;
    private JCheckBox checkBoxTheory4;
    private JCheckBox checkBoxTheory5;
    private JCheckBox checkBoxPractice1;
    private JCheckBox checkBoxPractice2;
    private JCheckBox checkBoxPractice3;
    private JCheckBox checkBoxPractice4;
    private JCheckBox checkBoxPractice5;
    private JCheckBox checkBoxPractice6;
    private JCheckBox checkBoxPractice7;
    private JCheckBox checkBoxPractice8;
    private JCheckBox checkBoxPractice9;
    private JCheckBox checkBoxPractice10;
    private JCheckBox checkBoxPractice11;
    private JCheckBox checkBoxPractice12;
    private JCheckBox checkBoxPractice13;
    private JCheckBox checkBoxPractice14;

    private ButtonTheoryClick buttonTheoryClick;
    private ButtonPracticeClick buttonPracticeClick;

    Form()
    {
        setContentPane(mainPanel);

        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Программа-генератор");
        ImageIcon img = new ImageIcon("src/dopRes/iconImage.png");
        setIconImage(img.getImage());
        setVisible(true);
        setResizable(false);

        JCheckBox []checkBoxesTheory = new JCheckBox[]
                {
                        checkBoxTheory1, checkBoxTheory2, checkBoxTheory3, checkBoxTheory4, checkBoxTheory5
                };

        JCheckBox []checkBoxesPractice = new JCheckBox[]
                {
                        checkBoxPractice1, checkBoxPractice2, checkBoxPractice3, checkBoxPractice4, checkBoxPractice5, checkBoxPractice6, checkBoxPractice7, checkBoxPractice8,
                        checkBoxPractice9, checkBoxPractice10, checkBoxPractice11, checkBoxPractice12, checkBoxPractice13, checkBoxPractice14
                };

        buttonTheoryClick = new ButtonTheoryClick(checkBoxesTheory);
        buttonTheory.addActionListener(buttonTheoryClick);

        buttonPracticeClick = new ButtonPracticeClick(checkBoxesPractice);
        buttonPractice.addActionListener(buttonPracticeClick);
    }
}