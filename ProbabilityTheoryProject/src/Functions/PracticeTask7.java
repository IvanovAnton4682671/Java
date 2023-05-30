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
    int num1;
    int var;

    public PracticeTask7(PoiMainClass poiMainClassVariant, PoiMainClass poiMainClassAnswers, int num1, int var)
    {
        this.poiMainClassVariant = poiMainClassVariant;
        this.poiMainClassAnswers = poiMainClassAnswers;
        this.num1 = num1;
        this.var = var;
    }

    Random rand = new Random();

    public void practiceTask7Function()
    {
        //////////////////////
        //правильно работает//
        ////////////////////////////////////////////////////////////////////////////////
        //массив букв, ответов, случайный радиус (от него не зависит правильный ответ)//
        ////////////////////////////////////////////////////////////////////////////////
        String[] alphabet = {"А)", "Б)", "В)", "Г)"};
        String[] alphabetTable = {"А", "Б", "В", "Г"};
        String[] answers = {"", "", "", ""};
        int r = rand.nextInt(2, 7);
        String sub_answer = "";
        int num = rand.nextInt(0, 2);
        if (num == 0)
        {
            sub_answer = "внутри";
            answers[0] = "3√3/4π";
            answers[1] = "3√3/" + (r-1) + "π";
            answers[2] = "1";
            answers[3] = "√3/" + r + "π";
        }
        if (num == 1)
        {
            sub_answer = "вне";
            answers[0] = "(4π-3√3)/4π";
            answers[1] = "(4π-" + (r-1) + "√3)/4";
            answers[2] = "1";
            answers[3] = r + "√3/4π";
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
        poiMainClassVariant.addText("7. Внутрь круга радиуса " + r + " наудачу брошена точка. Тогда вероятность того, что точка окажется " + sub_answer + " вписанного в круг равностороннего треугольника, равна:");
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
                //poiMainClassAnswers.addText("№7 - " + alphabet[i] + ";");
                poiMainClassAnswers.addTaleItem(alphabetTable[i], num1, var);
            }
        }
    }
}