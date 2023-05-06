package Functions;

import Listeners.PoiMainClass;

import java.util.*;

public class PracticeTask1
{
    //////////////////////////////////////////
    //передаём объекты и создаём конструктор//
    //////////////////////////////////////////
    PoiMainClass poiMainClassVariant;
    PoiMainClass poiMainClassAnswers;

    public PracticeTask1(PoiMainClass poiMainClassVariant, PoiMainClass poiMainClassAnswers)
    {
        this.poiMainClassVariant = poiMainClassVariant;
        this.poiMainClassAnswers = poiMainClassAnswers;
    }

    Random rand = new Random();

    public void practiceTask1Function()
    {
        ////////////////////////////
        //буквы, массив сумм очков//
        ////////////////////////////
        String[] alphabet = {"А)", "Б)", "В)", "Г)"};
        int[] summi = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};
        ////////////////////////////////
        //0 - не меньше, 1 - не больше//
        ////////////////////////////////
        int uslovie1 = rand.nextInt(0, 2);
        ///////////////
        //нужные очки//
        ///////////////
        int uslovie2 = rand.nextInt(2, 13);
        //////////////////
        //массив ответов//
        //////////////////
        String[] answers = {"", "", "", ""};
        if (uslovie1 == 0)
        {
            ////////////////////////////////////////////////////
            //ищем сумму всех очков от нашего числа и до конца//
            ////////////////////////////////////////////////////
            double sum = 0;
            for (int i = (uslovie2 - 2); i <= 10; i++)
            {
                sum += summi[i];
            }
            double answer = sum / 36;
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
            poiMainClassVariant.addText("6. Игральная кость бросается 2 раза. Тогда вероятность того, что сумма выпавших очков не меньше " + uslovie2 + ", равна:");
            for (int i = 0; i < 4; i++)
            {
                if (i == 3)
                {
                    poiMainClassVariant.newParagraph();
                    poiMainClassVariant.addText(alphabet[i] + res3[i] + ".");
                }
                else
                {
                    poiMainClassVariant.newParagraph();
                    poiMainClassVariant.addText(alphabet[i] + res3[i] + ";");
                }
                ////////////////////////////////////////////////////////////////////////////////////////////////////////
                //записываем букву ответа в файл ответов (хитрость в том, что ответы всегда на первом месте в массиве)//
                ////////////////////////////////////////////////////////////////////////////////////////////////////////
                if (res3[i] == answers[0])
                    poiMainClassAnswers.addText("№6 - " + alphabet[i] + ";");
            }
        }
        else
        {
            /////////////////////////////////////////////////////
            //ищем сумму всех очков от начала и до нашего числа//
            /////////////////////////////////////////////////////
            double sum = 0;
            for (int i = 0; i <= (uslovie2 - 2); i++)
            {
                sum += summi[i];
            }
            double answer = sum / 36;
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
            poiMainClassVariant.addText("6. Игральная кость бросается 2 раза. Тогда вероятность того, что сумма выпавших очков не больше " + uslovie2 + ", равна:");
            for (int i = 0; i < 4; i++)
            {
                if (i == 3)
                {
                    poiMainClassVariant.newParagraph();
                    poiMainClassVariant.addText(alphabet[i] + res3[i] + ".");
                }
                else
                {
                    poiMainClassVariant.newParagraph();
                    poiMainClassVariant.addText(alphabet[i] + res3[i] + ";");
                }
                ////////////////////////////////////////////////////////////////////////////////////////////////////////
                //записываем букву ответа в файл ответов (хитрость в том, что ответы всегда на первом месте в массиве)//
                ////////////////////////////////////////////////////////////////////////////////////////////////////////
                if (res3[i] == answers[0])
                    poiMainClassAnswers.addText("№6 - " + alphabet[i] + ";");
            }
        }
    }
}