package Functions;

import Listeners.PoiMainClass;

import java.util.*;

public class TheoryTask2
{
    //////////////////////////////////////////
    //передаём объекты и создаём конструктор//
    //////////////////////////////////////////
    PoiMainClass poiMainClassVariant;
    PoiMainClass poiMainClassAnswers;

    public TheoryTask2(PoiMainClass poiMainClassVariant, PoiMainClass poiMainClassAnswers)
    {
        this.poiMainClassVariant = poiMainClassVariant;
        this.poiMainClassAnswers = poiMainClassAnswers;
    }

    /////////////////////////////
    //для случайного числа надо//
    /////////////////////////////
    Random rand = new Random();

    public void theoryTask2Function()
    {
        ///////////////////////////////////////////////////////////////////
        //тут всё хорошо, все символы корректно отображаются (и картинки)//
        ///////////////////////////////////////////////////////////////////
        //буквы ответов, вопросы и ответы к ним//
        /////////////////////////////////////////
        String[] alphabet = {"А)", "Б)", "В)", "Г)"};
        String[] theoryTask2Questions = {"Что означает операция А+В?", "Что означает операция АВ?", "Выберите НЕВЕРНОЕ утверждение",
                "A и B - независимые события. Тогда справедливо следующее утверждение:", "Равномерное распределение случайной величины имеет вид",
                "Распределение Пуассона случайной величины имеет вид", "Биномиальное распределение случайной величины имеет вид", "Распределение Бернулли случайной величины имеет вид",
                "Как называется число m₀ (наступления события в n независимых испытаниях, в каждом из которых вероятность появления события равна p), определяемое из неравенства np - q ⩽ m₀ ⩽ np + p ?",
                "Максимальное значение произведения вероятностей противоположных событий равно"};
        String[][] theoryTask2Answers = { {"Произошло хотя бы одно из двух событий А или В", "Событие А влечёт за собой событие В", "Совместно осуществились события А и В", "Событие В влечёт за собой событие А"},
                {"Произошло и событие А, и событие В", "Произошло хотя бы одно из двух событий А или В", "Событие А влечёт за собой событие В", "Ни одно из событий не произошло"},
                {"Вероятность появления одного из противоположных событий всегда больше   вероятности другого", "Сумма вероятностей двух противоположных событий равна единице", "Если два события единственно возможны и несовместны, то они называются противоположными", "Событие, которое никогда не произойдёт, является невозможным"},
                {"P(B/A) = P(B)", "P(A/B) = P(B)", "P(AUB) = P(A)P(B)", "P(AnB) = 0"}, {"Pₘ = 1/n", "P(X = m) = Cₙ^m * p^m * q^(n-m)", "P(X = m) = p^m * q^(n-m)", "P(X = m) = (λ^m * e^(-λ))/m!"},
                {"P(X = m) = (λ^m * e^(-λ))/m!", "Pₘ = 1/n", "P(X = m) = p^m * q^(n-m)", "P(X = m) = Cₙ^m * p^m * q^(n-m)"},
                {"P(X = m) = Cₙ^m * p^m * q^(n-m)", "Pₘ = 1/n", "P(X = m) = p^m * q^(n-m)", "P(X = m) = (λ^m * e^(-λ))/m!"},
                {"P(X = m) = p^m * q^(n-m)", "Pₘ = 1/n", "P(X = m) = Cₙ^m * p^m * q^(n-m)", "P(X = m) = (λ^m * e^(-λ))/m!"},
                {"Наивероятнейшее", "Наибольшее", "Оптимальное", "Минимальное"}, {"0.25", "0.5", "1", "0.54"} };
        /////////////////////////////////////////////////////
        //делаем рандомное число - номер вопроса из массива//
        /////////////////////////////////////////////////////
        int number = rand.nextInt(0, 9);
        ///////////////////////////////////
        //записываем вопрос после отступа//
        ///////////////////////////////////
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.addText("2. " + theoryTask2Questions[number]);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //танцы с бубном ака шафл(перемешивание) массива ответов: делаем массив, в него их передаём, переводим его в лист, шаффлим лист, переводим обратно в массив (как допёр - сам не знаю)//
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String[] res = {"", "", "", ""};
        for (int i = 0; i < 4; i++)
            res[i] = theoryTask2Answers[number][i];
        List<String> res2 = Arrays.asList(res);
        Collections.shuffle(res2);
        String[] res3 = {"", "", "", ""};
        for (int i = 0; i < 4; i++)
            res3[i] = res2.get(i);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //тут спорное решение: я не нашёл некоторые спец. символы и сделал картинки (скриншоты), если это тот самый номер - из массива картинок подставляем нужную по массиву///////////////////////////////
        //спорное потому, что картинки не масштабируются, и норм смотрятся только с 14-20 размером шрифта, так что тут может быть проблема (если прижмёт - удалим их и будем некрасивые ответы показывать)//
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (number == 3)
        {
            String[] resImages = {"src\\dopRes\\theoryQuestion\\theoryQuestion14_a.png", "src\\dopRes\\theoryQuestion\\theoryQuestion14_b.png", "src\\dopRes\\theoryQuestion\\theoryQuestion14_c.png", "src\\dopRes\\theoryQuestion\\theoryQuestion14_d.png"};
            int[][] resSizes = { {137, 24}, {132, 27}, {191, 25}, {113, 25} };
            for (int i = 0; i < 4; i++)
            {
                poiMainClassVariant.newParagraph();
                poiMainClassVariant.addText(alphabet[i]);
                if (res3[i] == "P(B/A) = P(B)")
                    poiMainClassVariant.addPicture(resImages[0], resSizes[0][0], resSizes[0][1]);
                if (res3[i] == "P(A/B) = P(B)")
                    poiMainClassVariant.addPicture(resImages[1], resSizes[1][0], resSizes[1][1]);
                if (res3[i] == "P(AUB) = P(A)P(B)")
                    poiMainClassVariant.addPicture(resImages[2], resSizes[2][0], resSizes[2][1]);
                if (res3[i] == "P(AnB) = 0")
                    poiMainClassVariant.addPicture(resImages[3], resSizes[3][0], resSizes[3][1]);
                if (res3[i] == theoryTask2Answers[number][0])
                    poiMainClassAnswers.addText("№2 - " + alphabet[i] + ";");
            }
        }
        ///////////////////////////
        //то же самое, что и выше//
        ///////////////////////////
        else if (number == 4 || number == 5 || number == 6 || number == 7)
        {
            String[] resImages = {"src\\dopRes\\theoryQuestion\\theoryQuestion15_16_17_18_a.png", "src\\dopRes\\theoryQuestion\\theoryQuestion15_16_17_18_b.png", "src\\dopRes\\theoryQuestion\\theoryQuestion15_16_17_18_c.png", "src\\dopRes\\theoryQuestion\\theoryQuestion15_16_17_18_d.png"};
            int[][] resSizes = { {121, 41}, {68, 24}, {138, 22}, {150, 22} };
            for (int i = 0; i < 4; i++)
            {
                poiMainClassVariant.newParagraph();
                poiMainClassVariant.addText(alphabet[i]);
                if (res3[i] == "P(X = m) = (λ^m * e^(-λ))/m!")
                    poiMainClassVariant.addPicture(resImages[0], resSizes[0][0], resSizes[0][1]);
                if (res3[i] == "Pₘ = 1/n")
                    poiMainClassVariant.addPicture(resImages[1], resSizes[1][0], resSizes[1][1]);
                if (res3[i] == "P(X = m) = p^m * q^(n-m)")
                    poiMainClassVariant.addPicture(resImages[2], resSizes[2][0], resSizes[2][1]);
                if (res3[i] == "P(X = m) = Cₙ^m * p^m * q^(n-m)")
                    poiMainClassVariant.addPicture(resImages[3], resSizes[3][0], resSizes[3][1]);
                if (res3[i] == theoryTask2Answers[number][0])
                    poiMainClassAnswers.addText("№2 - " + alphabet[i] + ";");
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
                if (res3[i] == theoryTask2Answers[number][0])
                    poiMainClassAnswers.addText("№2 - " + alphabet[i] + ";");
            }
        }
    }
}