import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame
{
    Frame()
    {
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Game <Clicker>");
        ImageIcon img = new ImageIcon("cursor_hand.jpg");
        setIconImage(img.getImage());
        Panel panel = new Panel();
        add(panel);
        setVisible(true);
        setResizable(false);
    }
}