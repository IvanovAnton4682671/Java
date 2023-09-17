import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel extends JPanel
{
    int SCORE;
    JLabel message, text_score, score;
    JButton giv_score, upgrade1, upgrade2;

    Panel()
    {
        message = new JLabel("Hello, dear player! Your last actions will be displayed here. Have fun!");
        message.setBounds(200, 30, 400, 15);
        add(message);
        text_score = new JLabel("Your score:");
        text_score.setBounds(200, 60, 70, 15);
        add(text_score);
        score = new JLabel("0");
        score.setBounds(270, 60, 70, 15);
        add(score);

        giv_score = new JButton("+1");
        giv_score.setBounds(200, 90, 100, 20);
        Giv_score giv_score_ = new Giv_score();
        giv_score.addActionListener(giv_score_);
        add(giv_score);
        upgrade1 = new JButton("Upgrade the mouse");
        upgrade1.setBounds(200, 120, 150, 20);
        Upgrade1 upgrade1_ = new Upgrade1();
        upgrade1.addActionListener(upgrade1_);
        add(upgrade1);
        upgrade2 = new JButton("Upgrade the keyboard");
        upgrade2.setBounds(360, 120, 160, 20);
        Upgrade2 upgrade2_ = new Upgrade2();
        upgrade2.addActionListener(upgrade2_);
        add(upgrade2);

        setLayout(null);
    }

    class Giv_score implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int _score_ = Integer.parseInt(giv_score.getText());
            SCORE += _score_;
            score.setText(Integer.toString(SCORE));
            message.setText("Your score has increased!");
        }
    }

    class Upgrade1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (SCORE < 10)
                message.setText("You don't have enough score!");
            else
            {
                SCORE -= 10;
                score.setText(Integer.toString(SCORE));
                int giv_score_ = Integer.parseInt(giv_score.getText());
                giv_score_ += 1;
                giv_score.setText("+"+Integer.toString(giv_score_));
                message.setText("You have purchased an upgrade!");
            }
        }
    }

    class Upgrade2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (SCORE < 100)
                message.setText("You don't have enough score!");
            else
            {
                SCORE -= 100;
                score.setText(Integer.toString(SCORE));
                int giv_score_ = Integer.parseInt(giv_score.getText());
                giv_score_ += 10;
                giv_score.setText("+"+Integer.toString(giv_score_));
                message.setText("You have purchased an upgrade!");
            }
        }
    }
}
