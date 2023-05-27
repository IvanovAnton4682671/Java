package Functions;

import Listeners.PoiMainClass;

import java.util.*;

public class PracticeTask11
{
    //////////////////////////////////////////
    //передаём объекты и создаём конструктор//
    //////////////////////////////////////////
    PoiMainClass poiMainClassVariant;
    PoiMainClass poiMainClassAnswers;
    final int font_size;
    int num1;
    int var;

    public PracticeTask11(PoiMainClass poiMainClassVariant, PoiMainClass poiMainClassAnswers, int font_size, int num1, int var)
    {
        this.poiMainClassVariant = poiMainClassVariant;
        this.poiMainClassAnswers = poiMainClassAnswers;
        this.font_size = font_size;
        this.num1 = num1;
        this.var = var;
    }

    Random rand = new Random();

    public void practiceTask11Function()
    {
        /////////////////////////////////////////////////////////////////////////////////////
        //вроде правильно всё делает, только варианты ответов не красивые, но что поделать?//
        /////////////////////////////////////////////////////////////////////////////////////
        //массив букв и случайный номер задания//
        /////////////////////////////////////////
        String[] alphabet = {"А)", "Б)", "В)", "Г)"};
        String[] alphabetTable = {"А", "Б", "В", "Г"};
        String[] pictures = {"src\\dopRes\\practiceQuestion\\practiceQuestion11_1.png", "src\\dopRes\\practiceQuestion\\practiceQuestion11_2.png", "src\\dopRes\\practiceQuestion\\practiceQuestion11_3.png", "src\\dopRes\\practiceQuestion\\practiceQuestion11_4.png", "src\\dopRes\\practiceQuestion\\practiceQuestion11_5.png", "src\\dopRes\\practiceQuestion\\practiceQuestion11_6.png"};
        int weight = 0;
        int height = 0;
        if (font_size == 10) { weight = 140; height = 70;}
        if (font_size == 12) { weight = 160; height = 80;}
        if (font_size == 14) { weight = 180; height = 100;}
        if (font_size == 16) { weight = 190; height = 105;}
        if (font_size == 18) { weight = 200; height = 110;}
        int num_pic = 0;
        String[] answers = {"", "", "", ""};
        int num = rand.nextInt(0, 6);
        if (num == 0)
        {
            num_pic = 0;
            answers[0] = "38/81";
            answers[1] = "1/10";
            answers[2] = "39/81";
            answers[3] = "5/13";
        }
        if (num == 1)
        {
            num_pic = 1;
            answers[0] = "25/648";
            answers[1] = "3/5";
            answers[2] = "10/121";
            answers[3] = "37/502";
        }
        if (num == 2)
        {
            num_pic = 2;
            answers[0] = "3/5";
            answers[1] = "2/5";
            answers[2] = "2/3";
            answers[3] = "1/2";
        }
        if (num == 3)
        {
            num_pic = 3;
            answers[0] = "59/1280";
            answers[1] = "37/808";
            answers[2] = "2/5";
            answers[3] = "101/200";
        }
        if (num == 4)
        {
            num_pic = 4;
            answers[0] = "928/1875";
            answers[1] = "501/1103";
            answers[2] = "2/9";
            answers[3] = "17/81";
        }
        if (num == 5)
        {
            num_pic = 5;
            answers[0] = "119/3750";
            answers[1] = "108/2003";
            answers[2] = "8/17";
            answers[3] = "1/3";
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
        poiMainClassVariant.addText("16. Непрерывная случайная величина Х задана функцией распределения вероятностей (см. картинку). Тогда её дисперсия равна:");
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.addPicture(pictures[num_pic], weight, height);
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
                //poiMainClassAnswers.addText("№16 - " + alphabet[i] + ";");
                poiMainClassAnswers.addTaleItem(alphabetTable[i], num1, var);
            }
        }
    }
}