import Listeners.*;

import javax.swing.*;

public class Form extends JFrame
{
    private JPanel mainPanel;

    private JTabbedPane tabbedPane;

    //////////////////////////////////////////////////
    ////////// Вкладка "Задания" /////////////////////
    //////////////////////////////////////////////////
    private JPanel tasksPanel;
    private JLabel labelChoice, labelTheory, labelPractice;
    private JButton buttonTheory, buttonPractice;
    private JCheckBox checkBoxTheory1, checkBoxTheory2, checkBoxTheory3, checkBoxTheory4, checkBoxTheory5, checkBoxPractice1, checkBoxPractice2,
            checkBoxPractice3, checkBoxPractice4, checkBoxPractice5, checkBoxPractice6, checkBoxPractice7, checkBoxPractice8,
            checkBoxPractice9, checkBoxPractice10, checkBoxPractice11, checkBoxPractice12, checkBoxPractice13, checkBoxPractice14;
    private ButtonTheoryClick buttonTheoryClick;
    private ButtonPracticeClick buttonPracticeClick;

    //////////////////////////////////////////////////
    ////////// Вкладка "Предпросмотр" ////////////////
    //////////////////////////////////////////////////
    private JPanel previewPanel;
    private JLabel labelFontsAndSize;
    private JComboBox<String> comboBoxFonts;
    private JComboBox<Integer> comboBoxSizes;
    private JTextPane textPaneVariant, textPaneAnswers;
    private JButton buttonApply;
    private ButtonApplyClick buttonApplyClick;

    //////////////////////////////////////////////////
    ////////// Вкладка "Сохранение и генерация" //////
    //////////////////////////////////////////////////
    private JPanel savingAndGeneratingPanel;
    private JLabel labelQuantity, labelHow, labelWay;
    private JTextField textFieldQuantity, textFieldSave;
    private JRadioButton radioButtonMany, radioButtonOne;
    private JButton buttonSave, buttonCreate;
    private JFileChooser fileChooser;
    private TextFieldQuantityInput textFieldQuantityInput;
    private ButtonSaveClick buttonSaveClick;
    private ButtonCreateClick buttonCreateClick;

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

        //////////////////////////////////////////////////
        ////////// Вкладка "Задания" /////////////////////
        //////////////////////////////////////////////////
        //массивы чекбоксов для более удобной работы в обработчиках
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

        //////////////////////////////////////////////////
        ////////// Вкладка "Предпросмотр" ////////////////
        //////////////////////////////////////////////////
        //не обработано исключение, если пользователь не нажмёт на кнопку
        buttonApplyClick = new ButtonApplyClick(comboBoxFonts, comboBoxSizes, textPaneVariant, textPaneAnswers);
        buttonApply.addActionListener(buttonApplyClick);

        //////////////////////////////////////////////////
        ////////// Вкладка "Сохранение и генерация" //////
        //////////////////////////////////////////////////
        //добавление радиокнопок в одну группу
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButtonMany);
        buttonGroup.add(radioButtonOne);

        textFieldQuantityInput = new TextFieldQuantityInput(textFieldQuantity);
        textFieldQuantity.addKeyListener(textFieldQuantityInput);

        fileChooser = new JFileChooser();
        buttonSaveClick = new ButtonSaveClick(fileChooser, textFieldSave);
        buttonSave.addActionListener(buttonSaveClick);

        buttonCreateClick = new ButtonCreateClick(checkBoxesTheory, checkBoxesPractice, textFieldQuantity, radioButtonMany, radioButtonOne, textFieldSave);
        buttonCreate.addActionListener(buttonCreateClick);
    }
}