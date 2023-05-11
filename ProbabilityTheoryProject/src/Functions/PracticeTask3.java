package Functions;

import Listeners.PoiMainClass;

import java.util.*;

public class PracticeTask3
{
    //////////////////////////////////////////
    //передаём объекты и создаём конструктор//
    //////////////////////////////////////////
    PoiMainClass poiMainClassVariant;
    PoiMainClass poiMainClassAnswers;

    public PracticeTask3(PoiMainClass poiMainClassVariant, PoiMainClass poiMainClassAnswers)
    {
        this.poiMainClassVariant = poiMainClassVariant;
        this.poiMainClassAnswers = poiMainClassAnswers;
    }

    Random rand = new Random();

    public void practiceTask3Function()
    {
        ///////////////////////////
        //вроде правильно считает//
        ////////////////////////////
        //массив букв и ответов//
        /////////////////////////
        String[] alphabet = {"А) ", " Б) ", " В) ", " Г) "};
        String[] answers = {"", "", "", ""};
        ///////////////////////////////////////////
        //создаём две вероятности и считаем ответ//
        ///////////////////////////////////////////
        double p1 = rand.nextDouble(0.1, 0.9);
        double p2 = rand.nextDouble(0.1, 0.9);
        double answer = 1 - ((1 - p1) * (1 - p2));
        /////////////////////////////
        //делаем 3 случайных ответа//
        /////////////////////////////
        double answer1 = answer * 0.5;
        double answer2 = answer * 0.75;
        double answer3 = answer * 1.25;
        /////////////////////////////////////////
        //округляем до 3-х знаков после запятой//
        /////////////////////////////////////////
        answers[0] = String.format("%.3f", answer);
        answers[1] = String.format("%.3f", answer1);
        answers[2] = String.format("%.3f", answer2);
        answers[3] = String.format("%.3f", answer3);
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
        ///////////////////////////////////
        //округляем значение вероятностей//
        ///////////////////////////////////
        String p_1 = String.format("%.2f", p1);
        String p_2 = String.format("%.2f", p2);
        poiMainClassVariant.addText("8. Вероятность поражения здания первой бомбой равна " + p_1 + ", а второй - " + p_2 + ". Обе бомбы сбрасывают одновременно. Тогда вероятность поражения цели равна:");
        poiMainClassVariant.newParagraph();
        for (int i = 0; i < 4; i++)
        {
            if (i == 3)
            {
                poiMainClassVariant.addText(alphabet[i] + res3[i] + ".");
            }
            else
            {
                poiMainClassVariant.addText(alphabet[i] + res3[i] + ";");
            }
            ////////////////////////////////////////////////////////////////////////////////////////////////////////
            //записываем букву ответа в файл ответов (хитрость в том, что ответы всегда на первом месте в массиве)//
            ////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (res3[i] == answers[0])
                poiMainClassAnswers.addText("№8 - " + alphabet[i] + ";");
        }
    }
}