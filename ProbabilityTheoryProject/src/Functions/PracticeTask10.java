package Functions;

import Listeners.PoiMainClass;

import java.util.*;

public class PracticeTask10
{
    //////////////////////////////////////////
    //передаём объекты и создаём конструктор//
    //////////////////////////////////////////
    PoiMainClass poiMainClassVariant;
    PoiMainClass poiMainClassAnswers;
    int num;
    int var;

    public PracticeTask10(PoiMainClass poiMainClassVariant, PoiMainClass poiMainClassAnswers, int num, int var)
    {
        this.poiMainClassVariant = poiMainClassVariant;
        this.poiMainClassAnswers = poiMainClassAnswers;
        this.num = num;
        this.var = var;
    }

    Random rand = new Random();

    public void practiceTask10Function()
    {
        ///////////////////////////////////////////////////////////////////////////////////////////////
        //вроде правильно считает (1 раз было не совсем точное округление, но это уже ошибка техники)//
        ///////////////////////////////////////////////////////////////////////////////////////////////
        //массив букв и ответов//
        /////////////////////////
        String[] alphabet = {"А)", "Б)", "В)", "Г)"};
        String[] alphabetTable = {"А", "Б", "В", "Г"};
        String[] answers = {"", "", "", ""};
        /////////////////////////////////////////////////////////////////////////////////////////
        //отдельный массив вероятностей (чтобы были красивые, ровные числа, пожалеем студентов)//
        /////////////////////////////////////////////////////////////////////////////////////////
        double[] h1_mass = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9};
        int h1_num = rand.nextInt(0, 9);
        double h1 = h1_mass[h1_num];
        double h2 = h1_mass[h1_mass.length - 1 - h1_num];
        ///////////////////////////////////////////////
        //создаём две случайные вероятности неполучки//
        ///////////////////////////////////////////////
        double p1 = rand.nextDouble(0.1, 0.9);
        double p2 = rand.nextDouble(0.1, 0.9);
        double pochti_answer = h1 * p1 + h2 * p2;
        double answer = (h2 * p2) / pochti_answer;
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
        poiMainClassVariant.addText("10. Бухгалтерия выдаёт " + h1 * 100 + "% всех зарплат работникам высшей категории, а " + h2 * 100 + "% - остальным работникам. Вероятность того, что работник высшей категории  не получит в срок зарплату, равна " + p_1 + "; а для остальных эта вероятность составляет " + p_2 + ". Получено сообщение о невыплате зарплаты. Тогда вероятность того, что зарплату  не получил работник не высшей категории, равна:");
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
                //poiMainClassAnswers.addText("№10 - " + alphabet[i] + ";");
                poiMainClassAnswers.addTaleItem(alphabetTable[i], num, var);
            }
        }
    }
}