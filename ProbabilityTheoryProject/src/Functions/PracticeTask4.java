package Functions;

import Listeners.PoiMainClass;

import java.util.*;

public class PracticeTask4
{
    //////////////////////////////////////////
    //передаём объекты и создаём конструктор//
    //////////////////////////////////////////
    PoiMainClass poiMainClassVariant;
    PoiMainClass poiMainClassAnswers;
    int num;
    int var;

    public PracticeTask4(PoiMainClass poiMainClassVariant, PoiMainClass poiMainClassAnswers, int num, int var)
    {
        this.poiMainClassVariant = poiMainClassVariant;
        this.poiMainClassAnswers = poiMainClassAnswers;
        this.num = num;
        this.var = var;
    }

    Random rand = new Random();

    public void practiceTask4Function()
    {
        ///////////////////////////////////////////////////////////////
        //тут будут округлённые числа, зато правильно и полный рандом//
        ///////////////////////////////////////////////////////////////
        //массив букв, ответы, яблоки//
        ///////////////////////////////
        String[] alphabet = {"А)", "Б)", "В)", "Г)"};
        String[] alphabetTable = {"А", "Б", "В", "Г"};
        String[] answers = {"", "", "", ""};
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //чтобы получить целое число типа double (чтоб было 5.0, а не 5.343434112) ипользую перевод в строку, а из неё в дабл (напрямую как-то сложно)//
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        int red_apple_ = rand.nextInt(5, 8);
        String converter = String.valueOf(red_apple_);
        double red_apple = Double.parseDouble(converter);
        int yellow_apple_1_ = rand.nextInt(4, 7);
        converter = String.valueOf(yellow_apple_1_);
        double yellow_apple_1 = Double.parseDouble(converter);
        int yellow_apple_2_ = rand.nextInt(4, 7);
        converter = String.valueOf(yellow_apple_2_);
        double yellow_apple_2 = Double.parseDouble(converter);
        double yellow_apple = yellow_apple_1 + yellow_apple_2;
        double apple = red_apple + yellow_apple;
        /////////////////////////////////////////////
        //алгоритм решает только для хотя бы одного//
        /////////////////////////////////////////////
        double answer = 1 - (yellow_apple / apple * ((yellow_apple - 1) / (apple - 1)) * ((yellow_apple - 2) / (apple - 2)));
        double answer1 = answer * 0.5;
        double answer2 = answer * 0.75;
        double answer3 = answer * 1.05;
        ////////////////////
        //округляем ответы//
        ////////////////////
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
        poiMainClassVariant.addText("9. В вазу, в которой лежат " + red_apple_ + " красных яблок и " + yellow_apple_1_ + " жёлтых яблок, добавляют " + yellow_apple_2_ + " жёлтых яблок. После этого наудачу по одному извлекают три яблока без возвращения. Тогда вероятность того, что хотя бы одно из извлечённых яблок будет красным, равна:");
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
                //poiMainClassAnswers.addText("№9 - " + alphabet[i] + ";");
                poiMainClassAnswers.addTaleItem(alphabetTable[i], num, var);
            }
        }
    }
}