import Listeners.*;

import javax.swing.*;
import java.awt.*;

public class Form extends JFrame
{
    private JPanel mainPanel;

    private JTabbedPane tabbedPane;

    //////////////////////////////////////
    //Вкладка "Задания", все её элементы//
    //////////////////////////////////////
    private JPanel tasksPanel;
    private JLabel labelChoice, labelTheory, labelPractice;
    private JButton buttonTheory, buttonPractice;
    private JCheckBox checkBoxTheory1, checkBoxTheory2, checkBoxTheory3, checkBoxTheory4, checkBoxTheory5, checkBoxPractice6, checkBoxPractice7,
            checkBoxPractice8, checkBoxPractice9, checkBoxPractice10, checkBoxPractice11, checkBoxPractice12, checkBoxPractice13,
            checkBoxPractice14, checkBoxPractice15, checkBoxPractice16, checkBoxPractice17, checkBoxPractice18, checkBoxPractice19;

    ///////////////////////////////////////////
    //Вкладка "Предпросмотр", все её элементы//
    ///////////////////////////////////////////
    private JPanel previewPanel;
    private JLabel labelFontsAndSize;
    private JComboBox<String> comboBoxFonts;
    private JComboBox<Integer> comboBoxSizes;
    private JTextPane textPaneVariant, textPaneAnswers;
    private JButton buttonApply;

    /////////////////////////////////////////////////////
    //Вкладка "Сохранение и генерация", все её элементы//
    /////////////////////////////////////////////////////
    private JPanel savingAndGeneratingPanel;
    private JLabel labelQuantity, labelHow, labelWay;
    private JTextField textFieldQuantity, textFieldSave;
    private JRadioButton radioButtonMany, radioButtonOne;
    private JButton buttonSave, buttonCreate;

    Form()
    {
        //////////////////////////////////////////
        //добавление всех элементов тип на экран//
        //////////////////////////////////////////
        setContentPane(mainPanel);

        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Программа-генератор");
        ImageIcon img = new ImageIcon("src\\dopRes\\iconImage.png");
        setIconImage(img.getImage());
        setVisible(true);
        setResizable(false);

        /////////////////////
        //Вкладка "Задания"//
        /////////////////////////////////////////////////////////////
        //массивы чекбоксов для более удобной работы в обработчиках//
        /////////////////////////////////////////////////////////////
        JCheckBox []checkBoxesTheory = new JCheckBox[]
                {
                        checkBoxTheory1, checkBoxTheory2, checkBoxTheory3, checkBoxTheory4, checkBoxTheory5
                };

        JCheckBox []checkBoxesPractice = new JCheckBox[]
                {
                        checkBoxPractice6, checkBoxPractice7, checkBoxPractice8, checkBoxPractice9, checkBoxPractice10, checkBoxPractice11, checkBoxPractice12, checkBoxPractice13,
                        checkBoxPractice14, checkBoxPractice15, checkBoxPractice16, checkBoxPractice17, checkBoxPractice18, checkBoxPractice19
                };

        ///////////////////////////////////////////////////////
        //обработчики выбора всех чекбоксов теории и практики//
        ///////////////////////////////////////////////////////
        ButtonTheoryClick buttonTheoryClick = new ButtonTheoryClick(checkBoxesTheory);
        buttonTheory.addActionListener(buttonTheoryClick);

        ButtonPracticeClick buttonPracticeClick = new ButtonPracticeClick(checkBoxesPractice);
        buttonPractice.addActionListener(buttonPracticeClick);

        //////////////////////////
        //Вкладка "Предпросмотр"//
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //не обработано исключение, если пользователь не нажмёт на кнопку (мега-умная джава сама берёт значение, даже если кнопку не нажали)//
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //обработчик применения шрифтов и размера для просмотра//
        /////////////////////////////////////////////////////////
        ButtonApplyClick buttonApplyClick = new ButtonApplyClick(comboBoxFonts, comboBoxSizes, textPaneVariant, textPaneAnswers);
        buttonApply.addActionListener(buttonApplyClick);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //так как нельзя сделать так, чтобы при запуске кнопка была нажата, делаем применение к окнам стартовых настроек//
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Font font = new Font("Arial", Font.PLAIN, 10);
        textPaneVariant.setFont(font);
        textPaneAnswers.setFont(font);

        ////////////////////////////////////
        //Вкладка "Сохранение и генерация"//
        ////////////////////////////////////////
        //добавление радиокнопок в одну группу//
        ////////////////////////////////////////
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButtonMany);
        buttonGroup.add(radioButtonOne);

        //////////////////////////////////////////////////////////////////////
        //обработчики ввода кол-ва вариантов и выбора пути, кнопка "создать"//
        //////////////////////////////////////////////////////////////////////
        TextFieldQuantityInput textFieldQuantityInput = new TextFieldQuantityInput(textFieldQuantity);
        textFieldQuantity.addKeyListener(textFieldQuantityInput);

        JFileChooser fileChooser = new JFileChooser();
        ButtonSaveClick buttonSaveClick = new ButtonSaveClick(fileChooser, textFieldSave);
        buttonSave.addActionListener(buttonSaveClick);

        ButtonCreateClick buttonCreateClick = new ButtonCreateClick(checkBoxesTheory, checkBoxesPractice, textFieldQuantity, radioButtonMany, radioButtonOne, textFieldSave,
                comboBoxFonts, comboBoxSizes, checkBoxTheory1, checkBoxTheory2, checkBoxTheory3, checkBoxTheory4, checkBoxTheory5, checkBoxPractice6, checkBoxPractice7,
                checkBoxPractice8, checkBoxPractice9, checkBoxPractice10, checkBoxPractice11, checkBoxPractice12, checkBoxPractice13,
                checkBoxPractice14, checkBoxPractice15, checkBoxPractice16, checkBoxPractice17, checkBoxPractice18, checkBoxPractice19);
        buttonCreate.addActionListener(buttonCreateClick);
    }
}