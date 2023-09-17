import javax.swing.*;

public class Frame extends JFrame
{
    Frame()
    {
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Менеджер учётных записей");
        ImageIcon img = new ImageIcon("img.png");
        setIconImage(img.getImage());
        Panel panel = new Panel();
        add(panel);
        setVisible(true);
        setResizable(false);
    }
}