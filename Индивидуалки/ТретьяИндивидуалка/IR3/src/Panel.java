import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel extends JPanel
{
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JTextField tf1, tf2, tf3, tf4, tf5;
    JTextArea ta1;
    JScrollPane sp1;
    JButton b1, b2, b3, b4, b5, b6, b7, b8;

    Company company = new Company();

    Panel()
    {
        l1 = new JLabel("Вас приветствует программа по работе с учётными записями сотрудников предприятия!");
        l2 = new JLabel("Здесь будут показываться ваши действия");
        l3 = new JLabel("Здесь будут выводиться результаты работы программы");
        l4 = new JLabel("Ввод фамилии:");
        l5 = new JLabel("Ввод имени:");
        l6 = new JLabel("Ввод отчества:");
        l7 = new JLabel("Ввод должности");
        l8 = new JLabel("Ввод зарплаты:");
        l1.setBounds(135, 41, 550, 15);
        l2.setBounds(10, 85, 250, 15);
        l3.setBounds(435, 85, 350, 15);
        l4.setBounds(10, 116, 100, 15);
        l5.setBounds(10, 138, 100, 15);
        l6.setBounds(10, 160, 100, 15);
        l7.setBounds(10, 182, 120, 15);
        l8.setBounds(10, 204, 100, 15);
        add(l1); add(l2); add(l3); add(l4); add(l5); add(l6); add(l7); add(l8);

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        tf1.setBounds(130, 116, 130, 20);
        tf2.setBounds(130, 138, 130, 20);
        tf3.setBounds(130, 160, 130, 20);
        tf4.setBounds(130, 182, 130, 20);
        tf5.setBounds(130, 204, 130, 20);
        add(tf1); add(tf2); add(tf3); add(tf4); add(tf5);

        ta1 = new JTextArea();
        sp1 = new JScrollPane(ta1);
        sp1.setBounds(430, 116, 342, 300);
        ta1.setEditable(false);
        add(sp1);

        b1 = new JButton("Очистить поля ввода");
        b2 = new JButton("Добавить учётную запись");
        b3 = new JButton("Удалить запись по фамилии");
        b4 = new JButton("Вывести все учётные записи");
        b5 = new JButton("Поиск записи по фамилии");
        b6 = new JButton("Сортировать по фамилии");
        b7 = new JButton("Сортировать по зарплате");
        b8 = new JButton("Очистить поле вывода");
        b1.setBounds(10, 242, 250, 20);
        b2.setBounds(10, 272, 250, 20);
        b3.setBounds(10, 302, 250, 20);
        b4.setBounds(10, 332, 250, 20);
        b5.setBounds(10, 362, 250, 20);
        b6.setBounds(10, 392, 250, 20);
        b7.setBounds(10, 422, 250, 20);
        b8.setBounds(430, 422, 342, 20);
        Listener1 listener1 = new Listener1();
        b1.addActionListener(listener1);
        Listener2 listener2 = new Listener2();
        b2.addActionListener(listener2);
        Listener3 listener3 = new Listener3();
        b3.addActionListener(listener3);
        Listener4 listener4 = new Listener4();
        b4.addActionListener(listener4);
        Listener5 listener5 = new Listener5();
        b5.addActionListener(listener5);
        Listener6 listener6 = new Listener6();
        b6.addActionListener(listener6);
        Listener7 listener7 = new Listener7();
        b7.addActionListener(listener7);
        Listener8 listener8 = new Listener8();
        b8.addActionListener(listener8);
        add(b1); add(b2); add(b3); add(b4); add(b5); add(b6); add(b7); add(b8);

        setLayout(null);
    }



    class Listener1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            l2.setText("Вы очистили поля ввода");
        }
    }

    class Listener2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String last_name = tf1.getText();
            String first_name = tf2.getText();
            String patronymic = tf3.getText();
            String post = tf4.getText();
            int salary = Integer.parseInt(tf5.getText());
            Employee employee = new Employee(last_name, first_name, patronymic, post, salary);
            company.add(employee);
            ta1.append("--------------------------------------------------"+"\n");
            ta1.append("Фамилия: "+last_name+"\n");
            ta1.append("Имя: "+first_name+"\n");
            ta1.append("Отчество: "+patronymic+"\n");
            ta1.append("Должность: "+post+"\n");
            ta1.append("Зарплата: "+salary+"p\n");
            ta1.append("--------------------------------------------------"+"\n");
            l2.setText("Вы добавили новую запись");
        }
    }

    class Listener3 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String last_name = tf1.getText();
            company.del(last_name);
            ta1.append("--------------------------------------------------"+"\n");
            ta1.append("Вы удалили сотрудника по фамилии "+last_name+"\n");
            ta1.append("--------------------------------------------------"+"\n");
            l2.setText("Вы удалили запись");
        }
    }

    class Listener4 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ta1.setText("");
            for (int i = 0; i < company.getSize(); i++)
            {
                ta1.append("--------------------------------------------------"+"\n");
                ta1.append("Фамилия: "+company.getInd(i).getLast_name()+"\n");
                ta1.append("Имя: "+company.getInd(i).getFirst_name()+"\n");
                ta1.append("Отчество: "+company.getInd(i).getPatronymic()+"\n");
                ta1.append("Должность: "+company.getInd(i).getPost()+"\n");
                ta1.append("Зарплата: "+company.getInd(i).getSalary()+"p\n");
                ta1.append("--------------------------------------------------"+"\n");
            }
            l2.setText("Вы вывели все записи");
        }
    }

    class Listener5 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ta1.setText("");
            String last_name = tf1.getText();
            String s = company.search(last_name);
            ta1.append(s);
            l2.setText("Вы нашли запись");
        }
    }

    class Listener6 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ta1.setText("");
            company.sortByLast_name();
            for (int i = 0; i < company.getSize(); i++)
            {
                ta1.append("--------------------------------------------------"+"\n");
                ta1.append("Фамилия: "+company.getInd(i).getLast_name()+"\n");
                ta1.append("Имя: "+company.getInd(i).getFirst_name()+"\n");
                ta1.append("Отчество: "+company.getInd(i).getPatronymic()+"\n");
                ta1.append("Должность: "+company.getInd(i).getPost()+"\n");
                ta1.append("Зарплата: "+company.getInd(i).getSalary()+"p\n");
                ta1.append("--------------------------------------------------"+"\n");
            }
            l2.setText("Вы отсортировали записи по фамилии");
        }
    }

    class Listener7 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ta1.setText("");
            company.sortBySalary();
            for (int i = 0; i < company.getSize(); i++)
            {
                ta1.append("--------------------------------------------------"+"\n");
                ta1.append("Фамилия: "+company.getInd(i).getLast_name()+"\n");
                ta1.append("Имя: "+company.getInd(i).getFirst_name()+"\n");
                ta1.append("Отчество: "+company.getInd(i).getPatronymic()+"\n");
                ta1.append("Должность: "+company.getInd(i).getPost()+"\n");
                ta1.append("Зарплата: "+company.getInd(i).getSalary()+"р\n");
                ta1.append("--------------------------------------------------"+"\n");
            }
            l2.setText("Вы отсортировали записи по зарплате");
        }
    }

    class Listener8 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ta1.setText("");
            l2.setText("Вы очистили поле вывода");
        }
    }
}