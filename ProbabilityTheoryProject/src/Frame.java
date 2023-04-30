import javax.swing.*;

public class Frame extends JFrame
{
    Frame()
    {
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Программа-генератор");
        ImageIcon img = new ImageIcon("iconImage0.png");
        setIconImage(img.getImage());
        Panel panel = new Panel();
        add(panel);
        setVisible(true);
        setResizable(false);
    }
}