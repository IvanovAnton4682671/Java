package Functions;

import Listeners.PoiMainClass;

import java.util.*;

public class TheoryTask3
{
    PoiMainClass poiMainClassVariant;
    PoiMainClass poiMainClassAnswers;

    public TheoryTask3(PoiMainClass poiMainClassVariant, PoiMainClass poiMainClassAnswers)
    {
        this.poiMainClassVariant = poiMainClassVariant;
        this.poiMainClassAnswers = poiMainClassAnswers;
    }

    Random rand = new Random();

    public void theoryTask3Function()
    {
        ///////////////////////////////////////////////////////////////////
        //тут всё хорошо, все символы корректно отображаются (и картинки)//
        ///////////////////////////////////////////////////////////////////
        String[] alphabet = {"А)", "Б)", "В)", "Г)"};
        String[] theoryTask3Questions = {"Парный коэффициент корреляции r(X Y), изменяется в пределах", "Парный коэффициент корреляции равен –1. Это означает",
                "Вероятности появления заданного числа благоприятных исходов в схеме Бернулли описываются", "Математического ожидания не существует у случайной величины",
                "Закон больших чисел выводится из неравенства Чебышева при условии существования у случайной величины", "Характеристическая функция случайной величины есть",
                "Если характеристическая функция случайной величины имеет производную в точке нуль, то", "Характеристическая функция нормального стандартного распределения равна",
                "Зная характеристическую функцию можно определить функцию распределения",
                "Определите закон распределения непрерывной случайной величины, если плотность распределения имеет вид (см. картинку)"};
        String[][] theoryTask3Answers = { {"-1 ⩽ r(X, Y) ⩽ 1", "0 ⩽ r(X, Y) ⩽ 1", "-∞ ⩽ r(X, Y) ⩽ +∞", "0 ⩽ r(X, Y) ⩽ ∞"},
                {"Отрицательную линейную связь", "Наличие нелинейной функциональной связи", "Отсутствие связи", "Положительную линейную связь"},
                {"Биноминальным распределением", "Геометрическим распределением", "Равномерным распределением на отрезке", "Однородным распределением"},
                {"Распределенной по Коши", "Равномерно распределенной на отрезке", "Имеющей нормальное распределение", "Неравномерно распределенной на отрезке"},
                {"Конечного второго момента", "Конечного математического ожидания", "Плотности", "Дисперсии"},
                {"Комплекснозначная функция действительного переменного", "Аналитическая функция комплексного переменного", "Действительная функция комплексного переменного", "Мнимая функция комплексного переменного"},
                {"Случайная величина имеет конечное математическое ожидание", "Случайная величина имеет плотность", "Случайная величина имеет конечный момент второго порядка", "Все варианты неверные"},
                {"e^(-r²/2)", "e^(it)", "1", "1 - e^(it)"}, {"Произвольной случайной величины", "Непрерывной случайной величины", "Простой случайной величины", "Невозможно определить функцию распределения"},
                {"Равномерное распределение", "Экспоненциальное распределение", "Нормальное распределение", "Биномиальное распределение"} };
        int number = rand.nextInt(0, 9);
        if (number == 7)
        {
            poiMainClassVariant.newParagraph();
            poiMainClassVariant.newParagraph();
            poiMainClassVariant.addText("3. " + theoryTask3Questions[number]);
            String[] resImages = {"src\\dopRes\\theoryQuestion\\theoryQuestion28_a.png", "src\\dopRes\\theoryQuestion\\theoryQuestion28_b.png", "src\\dopRes\\theoryQuestion\\theoryQuestion28_c.png", "src\\dopRes\\theoryQuestion\\theoryQuestion28_d.png"};
            int[][] resSizes = { {33, 33}, {22, 20}, {10, 18}, {53, 17} };
            String[] res = {"", "", "", ""};
            for (int i = 0; i < 4; i++)
                res[i] = theoryTask3Answers[number][i];
            List<String> res2 = Arrays.asList(res);
            Collections.shuffle(res2);
            String[] res3 = {"", "", "", ""};
            for (int i = 0; i < 4; i++)
                res3[i] = res2.get(i);
            for (int i = 0; i < 4; i++)
            {
                poiMainClassVariant.newParagraph();
                poiMainClassVariant.addText(alphabet[i]);
                if (res3[i] == "e^(-r²/2)")
                    poiMainClassVariant.addPicture(resImages[0], resSizes[0][0], resSizes[0][1]);
                if (res3[i] == "e^(it)")
                    poiMainClassVariant.addPicture(resImages[1], resSizes[1][0], resSizes[1][1]);
                if (res3[i] == "1")
                    poiMainClassVariant.addPicture(resImages[2], resSizes[2][0], resSizes[2][1]);
                if (res3[i] == "1 - e^(it)")
                    poiMainClassVariant.addPicture(resImages[3], resSizes[3][0], resSizes[3][1]);
                if (res3[i] == theoryTask3Answers[number][0])
                    poiMainClassAnswers.addText("№3 - " + alphabet[i] + ";");
            }
        }
        else if (number == 9)
        {
            poiMainClassVariant.newParagraph();
            poiMainClassVariant.newParagraph();
            poiMainClassVariant.addText("3. " + theoryTask3Questions[number]);
            poiMainClassVariant.newParagraph();
            poiMainClassVariant.addPicture("src\\dopRes\\theoryQuestion\\theoryQuestion30.png", 157, 71);
            String[] res = {"", "", "", ""};
            for (int i = 0; i < 4; i++)
                res[i] = theoryTask3Answers[number][i];
            List<String> res2 = Arrays.asList(res);
            Collections.shuffle(res2);
            String[] res3 = {"", "", "", ""};
            for (int i = 0; i < 4; i++)
                res3[i] = res2.get(i);
            for (int i = 0; i < 4; i++)
            {
                poiMainClassVariant.newParagraph();
                poiMainClassVariant.addText(alphabet[i] + res3[i]);
                if (res3[i] == theoryTask3Answers[number][0])
                    poiMainClassAnswers.addText("№3 - " + alphabet[i] + ";");
            }
        }
        else
        {
            poiMainClassVariant.newParagraph();
            poiMainClassVariant.newParagraph();
            poiMainClassVariant.addText("3. " + theoryTask3Questions[number]);
            String[] res = {"", "", "", ""};
            for (int i = 0; i < 4; i++)
                res[i] = theoryTask3Answers[number][i];
            List<String> res2 = Arrays.asList(res);
            Collections.shuffle(res2);
            String[] res3 = {"", "", "", ""};
            for (int i = 0; i < 4; i++)
                res3[i] = res2.get(i);
            for (int i = 0; i < 4; i++) {
                poiMainClassVariant.newParagraph();
                poiMainClassVariant.addText(alphabet[i] + res3[i]);
                if (res3[i] == theoryTask3Answers[number][0])
                    poiMainClassAnswers.addText("№3 - " + alphabet[i] + ";");
            }
        }
    }
}