package Functions;

import Listeners.PoiMainClass;

import java.util.*;

public class TheoryTask1
{
    PoiMainClass poiMainClassVariant;
    PoiMainClass poiMainClassAnswers;

    public TheoryTask1(PoiMainClass poiMainClassVariant, PoiMainClass poiMainClassAnswers)
    {
        this.poiMainClassVariant = poiMainClassVariant;
        this.poiMainClassAnswers = poiMainClassAnswers;
    }

    Random rand = new Random();

    public void theoryTask1Function()
    {
        //////////////////////////////////////////////////////
        //тут всё хорошо, все символы корректно отображаются//
        //////////////////////////////////////////////////////
        String[] alphabet = {"А)", "Б)", "В)", "Г)"};
        String[] theoryTask1Questions = {"Элементарное событие – это", "Событие – это", "Вероятность – это", "Вероятность наступления некоторого события НЕ МОЖЕТ быть равна",
                "P(A+B) = (сложение вероятностей)", "Случайное событие – это", "Случайная величина есть", "Функция распределения случайной величины есть",
                "Вероятность того, что непрерывная случайная величина примет конкретное значение равна", "Какие значения может принимать функция распределения?"};
        String[][] theoryTask1Answers = { {"Единичный исход", "Число", "Эксперимент", "Вывод"}, {"Подмножество множества элементарных событий", "Утверждение", "Пространство элементарных событий", "Доказательство"},
                {"Степень возможности наступления некоторого события", "Утверждение", "Множество", "Эксперимент"}, {"2", "1", "0", "0.5"},
                {"P(A) + P(B)", "P(A) - P(B)", "P(AB) + P(A)", "P(AB) + P(B)"}, {"Может как произойти так и не произойти", "Доказанное утверждение", "Очевидное свойство", "Положительное число"},
                {"Функция элементарных событий", "Число", "Вывод", "Эксперимент"}, {"Функция одного действительного переменного", "Функция элементарных событий", "Функция многих действительных переменных", "Функция двух действительных переменных"},
                {"0", "1", "Зависит от задачи", "Нет правильных ответов"}, {"0 ⩽ F(x) ⩽ 1", "-∞ ⩽ F(x) ⩽ +∞", "F(x) > 0", "F(x) ≠ 1"} };
        int number = rand.nextInt(0, 9);
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.addText("1. " + theoryTask1Questions[number]);
        String[] res = {"", "", "", ""};
        for (int i = 0; i < 4; i++)
            res[i] = theoryTask1Answers[number][i];
        List<String> res2 = Arrays.asList(res);
        Collections.shuffle(res2);
        String[] res3 = {"", "", "", ""};
        for (int i = 0; i < 4; i++)
            res3[i] = res2.get(i);
        for (int i = 0; i < 4; i++)
        {
            poiMainClassVariant.newParagraph();
            poiMainClassVariant.addText(alphabet[i] + res3[i]);
            if (res3[i] == theoryTask1Answers[number][0])
                poiMainClassAnswers.addText("№1 - " + alphabet[i] + ";");
        }
    }
}