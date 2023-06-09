package Functions;

import Listeners.PoiMainClass;

import java.util.*;

public class PracticeTask18
{
    //////////////////////////////////////////
    //передаём объекты и создаём конструктор//
    //////////////////////////////////////////
    PoiMainClass poiMainClassVariant;
    PoiMainClass poiMainClassAnswers;
    int num;
    int var;

    public PracticeTask18(PoiMainClass poiMainClassVariant, PoiMainClass poiMainClassAnswers, int num, int var)
    {
        this.poiMainClassVariant = poiMainClassVariant;
        this.poiMainClassAnswers = poiMainClassAnswers;
        this.num = num;
        this.var = var;
    }

    Random rand = new Random();

    public void practiceTask18Function()
    {
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //считает вроде правильно, хотел сделать ещё с нечётным кол-ом членов ряда, но тогда само задание надо менять, а такое вряд ли надо//
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //массив букв и ответов//
        /////////////////////////
        String[] alphabet = {"А)", "Б)", "В)", "Г)"};
        String[] alphabetTable = {"А", "Б", "В", "Г"};
        int[] answers = {0, 0, 0, 0};
        //////////////
        //пустой ряд//
        //////////////
        int[] mas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        /////////////////////////////
        //заполнили и отсортировали//
        /////////////////////////////
        for (int i = 0; i < 10; i++)
            mas[i] = rand.nextInt(10, 20);
        Arrays.sort(mas);
        /////////////////////////
        //нашли ответ и медиану//
        /////////////////////////
        int answer = mas[5];
        int med = (mas[4] + mas[5]) / 2;
        //////////////////////////////////////////////////////////////////////////////////////////////////
        //ради этих 2-ух строчек я сидел часа 2, потому что java округляет числа с 0.5 в меньшую сторону//
        //////////////////////////////////////////////////////////////////////////////////////////////////
        if ((mas[4] + mas[5]) % 2 == 1)
            answer -= 1;
        int answer1 = mas[5] + 1;
        int answer2 = mas[5] + 2;
        int answer3 = mas[5] + 3;
        answers[0] = answer;
        answers[1] = answer1;
        answers[2] = answer2;
        answers[3] = answer3;
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
        poiMainClassVariant.addText("18. Медиана вариационного ряда " + mas[0] + ", " + mas[1] + ", " + mas[2] + ", " + mas[3] + ", " + mas[4] + ", X, " + mas[6] + ", " + mas[7] + ", " + mas[8] + ", " + mas[9] + " равна " + med + ". Тогда значение варианты Х равно:");
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
                //poiMainClassAnswers.addText("№18 - " + alphabet[i] + ";");
                poiMainClassAnswers.addTaleItem(alphabetTable[i], num, var);
            }
        }
    }
}