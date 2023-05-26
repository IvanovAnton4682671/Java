package Functions;

import Listeners.PoiMainClass;

import java.util.*;

public class PracticeTask6
{
    //////////////////////////////////////////
    //передаём объекты и создаём конструктор//
    //////////////////////////////////////////
    PoiMainClass poiMainClassVariant;
    PoiMainClass poiMainClassAnswers;
    int num1;
    int var;

    public PracticeTask6(PoiMainClass poiMainClassVariant, PoiMainClass poiMainClassAnswers, int num1, int var)
    {
        this.poiMainClassVariant = poiMainClassVariant;
        this.poiMainClassAnswers = poiMainClassAnswers;
        this.num1 = num1;
        this.var = var;
    }

    Random rand = new Random();

    public void practiceTask6Function()
    {
        ////////////////////////////////////////////////////
        //массив букв, ответа и несколько других вариантов//
        ////////////////////////////////////////////////////
        String[] alphabet = {"А)", "Б)", "В)", "Г)"};
        String[] answers_0 = {"", "", ""};
        String[] answers_1 = {"", "", ""};
        String[] answers_2 = {"", "", ""};
        String[] answers_3 = {"", "", ""};
        String[][] answers = { answers_0, answers_1, answers_2, answers_3};
        String sub_answer = "";
        String row1_1 = "";
        String row1_2 = "";
        int num = rand.nextInt(0, 7);
        if (num == 0)
        {
            sub_answer = "0,6";
            row1_1 = "0,19";
            row1_2 = "0,28";
            answers_0[0] = "0,17"; answers_0[1] = "0,24"; answers_0[2] = "0,12";
            answers_1[0] = "0,17"; answers_1[1] = "0,3"; answers_1[2] = "0,12";
            answers_2[0] = "0,05"; answers_2[1] = "0,3"; answers_2[2] = "0,15";
            answers_3[0] = "0,2"; answers_3[1] = "0,2"; answers_3[2] = "0,15";
        }
        if (num == 1)
        {
            sub_answer = "0,5";
            row1_1 = "0,23";
            row1_2 = "0,18";
            answers_0[0] = "0,17"; answers_0[1] = "0,1"; answers_0[2] = "0,32";
            answers_1[0] = "0,16"; answers_1[1] = "0,15"; answers_1[2] = "0,14";
            answers_2[0] = "0,05"; answers_2[1] = "0,2"; answers_2[2] = "0,12";
            answers_3[0] = "0,4"; answers_3[1] = "0,1"; answers_3[2] = "0,1";
        }
        if (num == 2)
        {
            sub_answer = "0,7";
            row1_1 = "0,3";
            row1_2 = "0,1";
            answers_0[0] = "0,2"; answers_0[1] = "0,2"; answers_0[2] = "0,2";
            answers_1[0] = "0,16"; answers_1[1] = "0,18"; answers_1[2] = "0,3";
            answers_2[0] = "0,2"; answers_2[1] = "0,3"; answers_2[2] = "0,12";
            answers_3[0] = "0,3"; answers_3[1] = "0,12"; answers_3[2] = "0,2";
        }
        if (num == 3)
        {
            sub_answer = "0,4";
            row1_1 = "0,11";
            row1_2 = "0,18";
            answers_0[0] = "0,19"; answers_0[1] = "0,1"; answers_0[2] = "0,42";
            answers_1[0] = "0,1"; answers_1[1] = "0,13"; answers_1[2] = "0,15";
            answers_2[0] = "0,3"; answers_2[1] = "0,1"; answers_2[2] = "0,08";
            answers_3[0] = "0,35"; answers_3[1] = "0,18"; answers_3[2] = "0,03";
        }
        if (num == 4)
        {
            sub_answer = "0,9";
            row1_1 = "0,2";
            row1_2 = "0,01";
            answers_0[0] = "0,35"; answers_0[1] = "0,35"; answers_0[2] = "0,09";
            answers_1[0] = "0,2"; answers_1[1] = "0,13"; answers_1[2] = "0,17";
            answers_2[0] = "0,03"; answers_2[1] = "0,14"; answers_2[2] = "0,45";
            answers_3[0] = "0,7"; answers_3[1] = "0,01"; answers_3[2] = "0,2";
        }
        if (num == 5)
        {
            sub_answer = "0,8";
            row1_1 = "0,31";
            row1_2 = "0,12";
            answers_0[0] = "0,4"; answers_0[1] = "0,09"; answers_0[2] = "0,08";
            answers_1[0] = "0,41"; answers_1[1] = "0,01"; answers_1[2] = "0,17";
            answers_2[0] = "0,2"; answers_2[1] = "0,13"; answers_2[2] = "0,45";
            answers_3[0] = "0,7"; answers_3[1] = "0,21"; answers_3[2] = "0,01";
        }
        if (num == 6)
        {
            sub_answer = "0,3";
            row1_1 = "0,11";
            row1_2 = "0,08";
            answers_0[0] = "0,11"; answers_0[1] = "0,08"; answers_0[2] = "0,62";
            answers_1[0] = "0,35"; answers_1[1] = "0,07"; answers_1[2] = "0,17";
            answers_2[0] = "0,21"; answers_2[1] = "0,13"; answers_2[2] = "0,34";
            answers_3[0] = "0,65"; answers_3[1] = "0,23"; answers_3[2] = "0,03";
        }
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //тут не простой шаффл, а очень замудрённый (тут перемешиваются сами массивы в массиве массивов, не их элементы)//
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String[][] res = { {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""} };
        for (int i = 0; i < 4; i++)
            res[i] = answers[i];
        List<String[]> res2 = Arrays.asList(res);
        Collections.shuffle(res2);
        String[][] res3 = { {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""} };
        for (int i = 0; i < 4; i++)
            res3[i] = res2.get(i);
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.addText("11. Дискретная случайная величина Х задана законом распределения вероятностей (см. таблицу). И вероятность P(1 ⩽ X ⩽ 5) = " + sub_answer + ". Тогда значения a, b, c могут быть равны:");
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.initTable(2, 6);
        poiMainClassVariant.addTaleItem("X", 0, 0);
        poiMainClassVariant.addTaleItem("1", 0, 1);
        poiMainClassVariant.addTaleItem("3", 0, 2);
        poiMainClassVariant.addTaleItem("5", 0, 3);
        poiMainClassVariant.addTaleItem("7", 0, 4);
        poiMainClassVariant.addTaleItem("9", 0, 5);
        poiMainClassVariant.addTaleItem("P", 1, 0);
        poiMainClassVariant.addTaleItem(row1_1, 1, 1);
        poiMainClassVariant.addTaleItem("a", 1, 2);
        poiMainClassVariant.addTaleItem("b", 1, 3);
        poiMainClassVariant.addTaleItem("c", 1, 4);
        poiMainClassVariant.addTaleItem(row1_2, 1, 5);
        poiMainClassVariant.newParagraph();
        for (int i = 0; i < 4; i++)
        {
            poiMainClassVariant.newParagraph();
            if (i == 3)
            {
                poiMainClassVariant.addText(alphabet[i] + " a = " + res3[i][0] + "; b = " + res3[i][1] + "; c = " + res3[i][2] + ".");
            }
            else
            {
                poiMainClassVariant.addText(alphabet[i] + " a = " + res3[i][0] + "; b = " + res3[i][1] + "; c = " + res3[i][2] + ";");
            }
            ////////////////////////////////////////////////////////////////////////////////////////////////////////
            //записываем букву ответа в файл ответов (хитрость в том, что ответы всегда на первом месте в массиве)//
            ////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (res3[i][0] == answers_0[0] && res3[i][1] == answers_0[1] && res3[i][2] == answers_0[2])
            {
                //poiMainClassAnswers.addText("№11 - " + alphabet[i] + ";");
                poiMainClassAnswers.addTaleItem(alphabet[i], num1, var);
            }
        }
    }
}