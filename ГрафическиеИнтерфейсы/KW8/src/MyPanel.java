import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyPanel extends JPanel
{
    JLabel l1, l2, l3, l4;
    JTextField f1, f2;
    JButton b;

    MyPanel()
    {
        l1 = new JLabel("1-е слагаемое:");
        add(l1);
        f1 = new JTextField();
        f1.setColumns(10);
        add(f1);
        l2 = new JLabel("2-е слагаемое:");
        add(l2);
        f2 = new JTextField();
        f2.setColumns(10);
        add(f2);
        l3 = new JLabel("Сумма:");
        add(l3);
        l4 = new JLabel();
        add(l4);
        b = new JButton("Посчитать");
        MyListener m = new MyListener();
        b.addActionListener(m);
        add(b);
    }

    class MyListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int s1 = Integer.parseInt(f1.getText());
            int s2 = Integer.parseInt(f2.getText());
            int s3 = s1 + s2;
            l4.setText(String.valueOf(s3));
        }
    }
}