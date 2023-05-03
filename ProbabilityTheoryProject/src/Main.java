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
        //
        //тест
        //
        /*String[] specialSymbols = {"xᵢ", "xᵢ₊₁", "xᵢ - xᵢ₊₁", "nᵢ", "n₃", "X̅", "ʙ", "x̅ᵧ", "ρyx", "y̅", "x̅", "y̅ₓ"};
        PoiMainClass poiMainClass = new PoiMainClass("test1", "Times New Roman", 14);
        poiMainClass.newParagraph();
        poiMainClass.addText("test2");
        poiMainClass.addText("bimba");
        poiMainClass.newParagraph();
        poiMainClass.addTextBolt("aboba ");
        poiMainClass.addText("tank");
        //poiMainClass.newParagraph();
        poiMainClass.initTable(2, 2);
        poiMainClass.addTaleItem("leopard", 0, 0);
        poiMainClass.addTaleItem("ferdinand", 0, 1);
        poiMainClass.addTaleItem("brymbar", 1, 0);
        poiMainClass.addTaleItem("is-7", 1, 1);
        poiMainClass.newParagraph();
        poiMainClass.addPicture("src/dopRes/iconImage.png", 980/2, 980/2);
        poiMainClass.newParagraph();
        poiMainClass.addText(specialSymbols[3] + "kek" + 5);
        poiMainClass.printToFile();*/
    }
}