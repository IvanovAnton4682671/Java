package Functions;

import Listeners.PoiMainClass;

import java.util.*;

public class TheoryTask5
{
    //////////////////////////////////////////
    //передаём объекты и создаём конструктор//
    //////////////////////////////////////////
    PoiMainClass poiMainClassVariant;
    PoiMainClass poiMainClassAnswers;

    public TheoryTask5(PoiMainClass poiMainClassVariant, PoiMainClass poiMainClassAnswers)
    {
        this.poiMainClassVariant = poiMainClassVariant;
        this.poiMainClassAnswers = poiMainClassAnswers;
    }

    /////////////////////////////
    //для случайного числа надо//
    /////////////////////////////
    Random rand = new Random();

    public void theoryTask5Function()
    {
        ///////////////////////////////////////////////////////////////////
        //тут всё хорошо, все символы корректно отображаются (и картинки)//
        ///////////////////////////////////////////////////////////////////
        //буквы ответов, вопросы и ответы к ним//
        /////////////////////////////////////////
        String[] alphabet = {"А)", "Б)", "В)", "Г)"};
        String[] theoryTask5Questions = {"Чему равно математическое ожидание при равномерном распределении на интервале [a,b]?", "Какой вероятности соответствует медиана?",
                "Вставьте пропуск: если Х - непрерывная случайная величина, то мода - ... плотности распределения.",
                "Числом, равным математическому ожиданию квадрата отклонения случайной величины от её математического ожидания называют:", "Выберете НЕВЕРНОЕ:",
                "Среднее квадратическое отклонение случайной величины:", "D(X + Y) =", "Верно ли равенство: D(X - Y) = D(X) + D(Y) ?", "Каково значение дисперсии при нормальном распределении?",
                "Каково значение дисперсии при экспоненциальном распределении?", "Каково значение дисперсии при распределении Пуассона?", "Каково значение дисперсии при равномерном распределении?"};
        String[][] theoryTask4Answers = { {"(a + b)/2", "λ", "1/λ", "Нет верного ответа"}, {"0.5", "1", "0.25", "Нет верного ответа"},
                {"Точка локального максимума", "Точка локального минимума", "Несуществующая точка", "Нет верного ответа"}, {"Дисперсию", "Моду", "Медиану", "Квантиль"},
                {"DX = MX² - MX", "DX = MX² - M²X", "DX = M(X²) - (MX)²", "DX = M(X - MX)²"}, {"σ(x) = √(DX)", "σ(x) = DX²", "σ(x) = (DX)/2", "σ(x) = e^(DX)"},
                {"DX+DY", "D(XY)", "DX+DY-D(XY)", "0"}, {"Да", "Нет", "Зависит от задачи", "Нет верного варианта"}, {"σ²", "λ", "1/λ²", "(a - b)²/12"}, {"1/λ²", "(a - b)²/12", "σ²", "λ"},
                {"λ", "1/λ²", "(a - b)²/12", "σ²"}, {"(a - b)²/12", "σ²", "λ", "1/λ²"} };
        /////////////////////////////////////////////////////
        //делаем рандомное число - номер вопроса из массива//
        /////////////////////////////////////////////////////
        int number = rand.nextInt(0, 11);
        ///////////////////////////////////
        //записываем вопрос после отступа//
        ///////////////////////////////////
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.addText("5. " + theoryTask5Questions[number]);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //танцы с бубном ака шафл(перемешивание) массива ответов: делаем массив, в него их передаём, переводим его в лист, шаффлим лист, переводим обратно в массив (как допёр - сам не знаю)//
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String[] res = {"", "", "", ""};
        for (int i = 0; i < 4; i++)
            res[i] = theoryTask4Answers[number][i];
        List<String> res2 = Arrays.asList(res);
        Collections.shuffle(res2);
        String[] res3 = {"", "", "", ""};
        for (int i = 0; i < 4; i++)
            res3[i] = res2.get(i);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //тут спорное решение: я не нашёл некоторые спец. символы и сделал картинки (скриншоты), если это тот самый номер - из массива картинок подставляем нужную по массиву///////////////////////////////
        //спорное потому, что картинки не масштабируются, и норм смотрятся только с 14-20 размером шрифта, так что тут может быть проблема (если прижмёт - удалим их и будем некрасивые ответы показывать)//
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (number == 0)
        {
            String[] resImages = {"src\\dopRes\\theoryQuestion\\theoryQuestion39_40_41_a.png", "src\\dopRes\\theoryQuestion\\theoryQuestion39_40_41_b.png", "src\\dopRes\\theoryQuestion\\theoryQuestion39_40_41_c.png", "src\\dopRes\\theoryQuestion\\theoryQuestion39_40_41_d.png"};
            int[][] resSizes = { {28, 34}, {16, 37}, {14, 21}, {156, 20} };
            for (int i = 0; i < 4; i++)
            {
                poiMainClassVariant.newParagraph();
                poiMainClassVariant.addText(alphabet[i]);
                if (res3[i] == "(a + b)/2")
                    poiMainClassVariant.addPicture(resImages[0], resSizes[0][0], resSizes[0][1]);
                if (res3[i] == "λ")
                    poiMainClassVariant.addPicture(resImages[2], resSizes[2][0], resSizes[2][1]);
                if (res3[i] == "1/λ")
                    poiMainClassVariant.addPicture(resImages[1], resSizes[1][0], resSizes[1][1]);
                if (res3[i] == "Нет верного ответа")
                    poiMainClassVariant.addPicture(resImages[3], resSizes[3][0], resSizes[3][1]);
                if (res3[i] == theoryTask4Answers[number][0])
                    poiMainClassAnswers.addText("№5 - " + alphabet[i] + ";");
            }
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //тут спорное решение: я не нашёл некоторые спец. символы и сделал картинки (скриншоты), если это тот самый номер - из массива картинок подставляем нужную по массиву///////////////////////////////
        //спорное потому, что картинки не масштабируются, и норм смотрятся только с 14-20 размером шрифта, так что тут может быть проблема (если прижмёт - удалим их и будем некрасивые ответы показывать)//
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        else if (number == 5)
        {
            String[] resImages = {"src\\dopRes\\theoryQuestion\\theoryQuestion46_a.png", "src\\dopRes\\theoryQuestion\\theoryQuestion46_b.png", "src\\dopRes\\theoryQuestion\\theoryQuestion46_c.png", "src\\dopRes\\theoryQuestion\\theoryQuestion46_d.png"};
            int[][] resSizes = { {79, 26}, {80, 25}, {70, 35}, {74, 29} };
            for (int i = 0; i < 4; i++)
            {
                poiMainClassVariant.newParagraph();
                poiMainClassVariant.addText(alphabet[i]);
                if (res3[i] == "σ(x) = √(DX)")
                    poiMainClassVariant.addPicture(resImages[0], resSizes[0][0], resSizes[0][1]);
                if (res3[i] == "σ(x) = DX²")
                    poiMainClassVariant.addPicture(resImages[1], resSizes[1][0], resSizes[1][1]);
                if (res3[i] == "σ(x) = (DX)/2")
                    poiMainClassVariant.addPicture(resImages[2], resSizes[2][0], resSizes[2][1]);
                if (res3[i] == "σ(x) = e^(DX)")
                    poiMainClassVariant.addPicture(resImages[3], resSizes[3][0], resSizes[3][1]);
                if (res3[i] == theoryTask4Answers[number][0])
                    poiMainClassAnswers.addText("№5 - " + alphabet[i] + ";");
            }
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //тут спорное решение: я не нашёл некоторые спец. символы и сделал картинки (скриншоты), если это тот самый номер - из массива картинок подставляем нужную по массиву///////////////////////////////
        //спорное потому, что картинки не масштабируются, и норм смотрятся только с 14-20 размером шрифта, так что тут может быть проблема (если прижмёт - удалим их и будем некрасивые ответы показывать)//
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        else if (number == 8 || number == 9 || number == 10 || number == 11)
        {
            String[] resImages = {"src\\dopRes\\theoryQuestion\\theoryQuestion49_50_51_52_a.png", "src\\dopRes\\theoryQuestion\\theoryQuestion49_50_51_52_b.png", "src\\dopRes\\theoryQuestion\\theoryQuestion49_50_51_52_c.png", "src\\dopRes\\theoryQuestion\\theoryQuestion49_50_51_52_d.png"};
            int[][] resSizes = { {24, 21}, {20, 20}, {21, 34}, {50, 36} };
            for (int i = 0; i < 4; i++)
            {
                poiMainClassVariant.newParagraph();
                poiMainClassVariant.addText(alphabet[i]);
                if (res3[i] == "σ²")
                    poiMainClassVariant.addPicture(resImages[0], resSizes[0][0], resSizes[0][1]);
                if (res3[i] == "λ")
                    poiMainClassVariant.addPicture(resImages[1], resSizes[1][0], resSizes[1][1]);
                if (res3[i] == "1/λ²")
                    poiMainClassVariant.addPicture(resImages[2], resSizes[2][0], resSizes[2][1]);
                if (res3[i] == "(a - b)²/12")
                    poiMainClassVariant.addPicture(resImages[3], resSizes[3][0], resSizes[3][1]);
                if (res3[i] == theoryTask4Answers[number][0])
                    poiMainClassAnswers.addText("№5 - " + alphabet[i] + ";");
            }
        }
        else
        {
            ///////////////////////////////////////////////////////////////
            //если последняя строка - ставим точку, иначе точку с запятой//
            ///////////////////////////////////////////////////////////////
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
                if (res3[i] == theoryTask4Answers[number][0])
                    poiMainClassAnswers.addText("№5 - " + alphabet[i] + ";");
            }
        }
    }
}