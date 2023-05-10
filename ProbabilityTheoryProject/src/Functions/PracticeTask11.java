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

    public PracticeTask11(PoiMainClass poiMainClassVariant, PoiMainClass poiMainClassAnswers)
    {
        this.poiMainClassVariant = poiMainClassVariant;
        this.poiMainClassAnswers = poiMainClassAnswers;
    }

    Random rand = new Random();

    public void practiceTask11Function()
    {
        /////////////////////////////////////////
        //массив букв и случайный номер задания//
        /////////////////////////////////////////
        String[] alphabet = {"А)", "Б)", "В)", "Г)"};
        int num = rand.nextInt(0, 6);
        if (num == 0)
        {
            //////////////////
            //массив ответов//
            //////////////////
            String[] answers = {"38/81", "1/10", "39/81", "5/13"};
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
            poiMainClassVariant.addPicture("src\\dopRes\\practiceQuestion\\practiceQuestion11_1.png", 224, 114);
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
                    poiMainClassAnswers.addText("№16 - " + alphabet[i] + ";");
            }
        }
        if (num == 1)
        {
            //////////////////
            //массив ответов//
            //////////////////
            String[] answers = {"25/648", "3/5", "10/121", "37/502"};
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
            poiMainClassVariant.addPicture("src\\dopRes\\practiceQuestion\\practiceQuestion11_2.png", 224, 114);
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
                    poiMainClassAnswers.addText("№16 - " + alphabet[i] + ";");
            }
        }
        if (num == 2)
        {
            //////////////////
            //массив ответов//
            //////////////////
            String[] answers = {"3/5", "2/5", "2/3", "1/2"};
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
            poiMainClassVariant.addPicture("src\\dopRes\\practiceQuestion\\practiceQuestion11_3.png", 224, 114);
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
                    poiMainClassAnswers.addText("№16 - " + alphabet[i] + ";");
            }
        }
        if (num == 3)
        {
            //////////////////
            //массив ответов//
            //////////////////
            String[] answers = {"59/1280", "37/808", "2/5", "101/200"};
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
            poiMainClassVariant.addPicture("src\\dopRes\\practiceQuestion\\practiceQuestion11_4.png", 224, 114);
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
                    poiMainClassAnswers.addText("№16 - " + alphabet[i] + ";");
            }
        }
        if (num == 4)
        {
            //////////////////
            //массив ответов//
            //////////////////
            String[] answers = {"928/1875", "501/1103", "2/9", "17/81"};
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
            poiMainClassVariant.addPicture("src\\dopRes\\practiceQuestion\\practiceQuestion11_5.png", 224, 114);
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
                    poiMainClassAnswers.addText("№16 - " + alphabet[i] + ";");
            }
        }
        if (num == 5)
        {
            //////////////////
            //массив ответов//
            //////////////////
            String[] answers = {"119/3750", "108/2003", "8/17", "1/3"};
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
            poiMainClassVariant.addPicture("src\\dopRes\\practiceQuestion\\practiceQuestion11_6.png", 224, 114);
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
                    poiMainClassAnswers.addText("№16 - " + alphabet[i] + ";");
            }
        }
    }
}