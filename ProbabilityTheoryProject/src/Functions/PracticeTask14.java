package Functions;

import Listeners.PoiMainClass;

import java.util.*;

public class PracticeTask14
{
    //////////////////////////////////////////
    //передаём объекты и создаём конструктор//
    //////////////////////////////////////////
    PoiMainClass poiMainClassVariant;
    PoiMainClass poiMainClassAnswers;
    int num;
    int var;

    public PracticeTask14(PoiMainClass poiMainClassVariant, PoiMainClass poiMainClassAnswers, int num, int var)
    {
        this.poiMainClassVariant = poiMainClassVariant;
        this.poiMainClassAnswers = poiMainClassAnswers;
        this.num = num;
        this.var = var;
    }

    Random rand = new Random();

    public void practiceTask14Function()
    {
        /////////////////////////
        //считает всё правильно//
        /////////////////////////////////
        //массив букв, ответов, сам ряд//
        /////////////////////////////////
        String[] alphabet = {"А)", "Б)", "В)", "Г)"};
        int[] mas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] answers = {0, 0, 0, 0};
        for (int i = 0; i < 11; i++)
            mas[i] = rand.nextInt(5, 20);
        Arrays.sort(mas);
        //////////////
        //это размах//
        //////////////
        int sub_answer = mas[10] - mas[0];
        int answer = mas[10];
        answers[0] = answer;
        answers[1] = answer + 1;
        answers[2] = answer + 5;
        answers[3] = answer - 2;
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //танцы с бубном ака шафл(перемешивание) массива ответов: делаем массив, в него их передаём, переводим его в лист, шаффлим лист, переводим обратно в массив (как допёр - сам не знаю)//
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Integer[] res = {0, 0, 0, 0};
        for (int i = 0; i < 4; i++)
            res[i] = answers[i];
        List<Integer> res2 = Arrays.asList(res);
        Collections.shuffle(res2);
        Integer[] res3 = {0, 0, 0, 0};
        for (int i = 0; i < 4; i++)
            res3[i] = res2.get(i);
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.addText("19. Размах варьирования вариационного ряда " + mas[0] + ", " + mas[1] + ", " + mas[2] + ", " + mas[3] + ", " + mas[4] + ", " + mas[5] + ", " + mas[6] + ", " + mas[7] + ", " + mas[8] + ", " + mas[9] + ", X равен " + sub_answer + ". Тогда значение Х равно:");
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
                //poiMainClassAnswers.addText("№19 - " + alphabet[i] + ";");
                poiMainClassAnswers.addTaleItem(alphabet[i], num, var);
            }
        }
        poiMainClassVariant.newParagraph();
    }
}