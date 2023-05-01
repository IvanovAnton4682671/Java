import com.formdev.flatlaf.*;

import static javax.swing.JDialog.setDefaultLookAndFeelDecorated;
import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        }
        catch (Exception ex)
        {
            setDefaultLookAndFeelDecorated(true);
            ex.printStackTrace();
        }
        new Form();
    }
}