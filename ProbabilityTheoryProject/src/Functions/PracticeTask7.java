package Functions;

import Listeners.PoiMainClass;

import java.util.*;

public class PracticeTask7
{
    //////////////////////////////////////////
    //передаём объекты и создаём конструктор//
    //////////////////////////////////////////
    PoiMainClass poiMainClassVariant;
    PoiMainClass poiMainClassAnswers;

    public PracticeTask7(PoiMainClass poiMainClassVariant, PoiMainClass poiMainClassAnswers)
    {
        this.poiMainClassVariant = poiMainClassVariant;
        this.poiMainClassAnswers = poiMainClassAnswers;
    }

    Random rand = new Random();

    public void practiceTask7Function()
    {
        ////////////////////////
        //правильно всё делает//
        //////////////////////////////////////////////////////////////////////////
        //массив букв, картинок, ширина и высота картинок, пустой массив ответов//
        //////////////////////////////////////////////////////////////////////////
        String[] alphabet = {"А)", "Б)", "В)", "Г)"};
        String[] pictures = {"src\\dopRes\\practiceQuestion\\practiceQuestion7_1.png", "src\\dopRes\\practiceQuestion\\practiceQuestion7_2.png", "src\\dopRes\\practiceQuestion\\practiceQuestion7_3.png"};
        int width = 267;
        int height = 143;
        String[] answers = {"", "", "", ""};
        int num_pic = 0;
        String condition = "";
        int num = rand.nextInt(0, 9);
        ///////////////////////////////////////
        //уловия, от которых завист сам номер//
        ///////////////////////////////////////
        if (num == 0 || num == 1 || num == 2)
        {
            num_pic = 0;
            if (num == 0)
            {
                answers[0] = "0,6";
                answers[1] = "0";
                answers[2] = "0,5";
                answers[3] = "0,3";
                condition = "P(1<X⩽3)";
            }
            if (num == 1)
            {
                answers[0] = "0,3";
                answers[1] = "0,7";
                answers[2] = "0,1";
                answers[3] = "0,5";
                condition = "P(2<X⩽4)";
            }
            if (num == 2)
            {
                answers[0] = "0,7";
                answers[1] = "0,5";
                answers[2] = "0,3";
                answers[3] = "0,2";
                condition = "P(1⩽X<3)";
            }
        }
        if (num == 3 || num == 4 || num == 5)
        {
            num_pic = 1;
            if (num == 3)
            {
                answers[0] = "0,8";
                answers[1] = "0,3";
                answers[2] = "0,9";
                answers[3] = "0,5";
                condition = "P(2<X⩽4)";
            }
            if (num == 4)
            {
                answers[0] = "0,5";
                answers[1] = "0,2";
                answers[2] = "0";
                answers[3] = "0,8";
                condition = "P(3<X⩽5)";
            }
            if (num == 5)
            {
                answers[0] = "0,5";
                answers[1] = "0,9";
                answers[2] = "0,1";
                answers[3] = "0,2";
                condition = "P(2⩽X<4)";
            }
        }
        if (num == 6 || num == 7 || num == 8)
        {
            num_pic = 2;
            if (num == 6)
            {
                answers[0] = "0,7";
                answers[1] = "0,8";
                answers[2] = "0,9";
                answers[3] = "0,6";
                condition = "P(3<X⩽5)";
            }
            if (num == 7)
            {
                answers[0] = "0,7";
                answers[1] = "0,1";
                answers[2] = "0,2";
                answers[3] = "0,5";
                condition = "P(4<X⩽6)";
            }
            if (num == 8)
            {
                answers[0] = "0,3";
                answers[1] = "0,4";
                answers[2] = "0,1";
                answers[3] = "0";
                condition = "P(3⩽X<5)";
            }
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
        poiMainClassVariant.addText("12. Дискретная случайная величина Х задана функцией распределения вероятностей (см. картинку). Тогда вероятность " + condition + " равна:");
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.addPicture(pictures[num_pic], width, height);
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
                poiMainClassAnswers.addText("№12 - " + alphabet[i] + ";");
        }
    }
}