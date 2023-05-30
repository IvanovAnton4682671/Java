package Functions;

import Listeners.PoiMainClass;

import java.util.*;

public class PracticeTask17
{
    //////////////////////////////////////////
    //передаём объекты и создаём конструктор//
    //////////////////////////////////////////
    PoiMainClass poiMainClassVariant;
    PoiMainClass poiMainClassAnswers;
    final int font_size;
    int num1;
    int var;

    public PracticeTask17(PoiMainClass poiMainClassVariant, PoiMainClass poiMainClassAnswers, int font_size, int num1, int var)
    {
        this.poiMainClassVariant = poiMainClassVariant;
        this.poiMainClassAnswers = poiMainClassAnswers;
        this.font_size = font_size;
        this.num1 = num1;
        this.var = var;
    }

    Random rand = new Random();

    public void practiceTask17Function()
    {
        //////////////////////
        //правильно работает//
        //////////////////////////////////
        //массив букв, картинок, ответов//
        //////////////////////////////////
        String[] alphabet = {"А)", "Б)", "В)", "Г)"};
        String[] alphabetTable = {"А", "Б", "В", "Г"};
        String[] pictures = {"src\\dopRes\\practiceQuestion\\practiceQuestion12_1.png", "src\\dopRes\\practiceQuestion\\practiceQuestion12_2.png", "src\\dopRes\\practiceQuestion\\practiceQuestion12_3.png", "src\\dopRes\\practiceQuestion\\practiceQuestion12_4.png", "src\\dopRes\\practiceQuestion\\practiceQuestion12_5.png"};
        int weight = 0;
        int height = 0;
        if (font_size == 10) { weight = 140; height = 70;}
        if (font_size == 12) { weight = 160; height = 80;}
        if (font_size == 14) { weight = 180; height = 100;}
        if (font_size == 16) { weight = 190; height = 105;}
        if (font_size == 18) { weight = 200; height = 110;}
        String[] answers = {"", "", "", ""};
        int num_picture = -1;
        int num = rand.nextInt(0, 5);
        ///////////////////////////////////////////////////////////////
        //в зависимости от условия выюираем картинку и ответы под неё//
        ///////////////////////////////////////////////////////////////
        if (num == 0)
        {
            num_picture = 0;
            answers[0] = "3";
            answers[1] = "6";
            answers[2] = "1/3";
            answers[3] = "3/8";
        }
        if (num == 1)
        {
            num_picture = 1;
            answers[0] = "25/12";
            answers[1] = "10";
            answers[2] = "5/2";
            answers[3] = "25";
        }
        if (num == 2)
        {
            num_picture = 2;
            answers[0] = "49/12";
            answers[1] = "14";
            answers[2] = "7/4";
            answers[3] = "49";
        }
        if (num == 3)
        {
            num_picture = 3;
            answers[0] = "4/3";
            answers[1] = "8";
            answers[2] = "2/5";
            answers[3] = "4";
        }
        if (num == 4)
        {
            num_picture = 4;
            answers[0] = "16/3";
            answers[1] = "32";
            answers[2] = "8/11";
            answers[3] = "15";
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //танцы с бубном ака шафл(перемешивание) массива ответов: делаем массив, в него их передаём, переводим его в лист, шаффлим лист, переводим обратно в массив (как допёр - сам не знаю)//
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String[] res = {"", "", "", ""};
        for (int i = 0; i < 4; i++)
            res[i] = answers[i];
        List<String> res2 = Arrays.asList(res);
        Collections.shuffle(res2);
        String[] res3 = {"", "", "", ""};
        for (int i = 0; i < 4; i++)
            res3[i] = res2.get(i);
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.addText("17. Непрерывная случайная величина Х задана функцией распределения вероятностей (см. картинку). Тогда её дисперсия равна:");
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.addPicture(pictures[num_picture], weight, height);
        poiMainClassVariant.newParagraph();
        for (int i = 0; i < 4; i++)
        {
            if (i == 3)
            {
                poiMainClassVariant.addText(alphabet[i] + " " + res3[i] + ".");
            }
            else
            {
                poiMainClassVariant.addText(alphabet[i] + " " + res3[i] + "; ");
            }
            ////////////////////////////////////////////////////////////////////////////////////////////////////////
            //записываем букву ответа в файл ответов (хитрость в том, что ответы всегда на первом месте в массиве)//
            ////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (res3[i] == answers[0])
            {
                //poiMainClassAnswers.addText("№17 - " + alphabet[i] + ";");
                poiMainClassAnswers.addTaleItem(alphabetTable[i], num1, var);
            }
        }
    }
}