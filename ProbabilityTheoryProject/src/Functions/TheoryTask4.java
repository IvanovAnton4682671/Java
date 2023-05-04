package Functions;

import Listeners.PoiMainClass;

import java.util.*;

public class TheoryTask4
{
    PoiMainClass poiMainClassVariant;
    PoiMainClass poiMainClassAnswers;

    public TheoryTask4(PoiMainClass poiMainClassVariant, PoiMainClass poiMainClassAnswers)
    {
        this.poiMainClassVariant = poiMainClassVariant;
        this.poiMainClassAnswers = poiMainClassAnswers;
    }

    Random rand = new Random();

    public void theoryTask4Function()
    {
        String[] alphabet = {"А)", "Б)", "В)", "Г)"};
        String[] theoryTask4Questions = {"Определите закон распределения непрерывной случайной величины, если плотность распределения имеет вид (см. картинку)",
                "Определите закон распределения непрерывной случайной величины, если плотность распределения имеет вид (см. картинку)", "Выберете НЕВЕРНОЕ утверждение:",
                "Двумерная случайная величина называется непрерывной, если ее функция распределения-", "Плотность распределения вероятностей непрерывной двумерной случайной величины –это",
                "Выберете верный вариант", "Математическое ожидание постоянной равно", "Для каких случайных величин справедливо свойство математического ожидания M(X + Y) = MX + MY",
                "Чему равно математическое ожидание при пуассоновском распределении с параметром λ?", "Чему равно математическое ожидание при экспоненциальном распределении с параметром λ?"};
        String[][] theoryTask4Answers = { {"Экспоненциальное распределение", "Нормальное распределение", "Равномерное распределение", "Биномиальное распределение"},
                {"Нормальное распределение", "Биномиальное распределение", "Распределение Бернулли", "Распределение Пуассона"},
                {"Функция распределения F(x, у) есть отрицательная функция, заключенная между нулем и единицей", "Функция распределения F(x, у) есть неубывающая функция по каждому из аргументов", "Если хотя бы один из аргументов обращается в -∞, функция распределения", "Если оба аргумента равны +∞, то функция распределения равна единице"},
                {"непрерывная , дифференцируемая по каждому из аргументов, и существует вторая смешанная производная", "непрерывная , дифференцируемая по каждому из аргументов, и существует третья смешанная производная", "непрерывная", "Ни один вариант не является верным"},
                {"Вторая смешанная частная производная ее функции распределения", "Сумма всех вероятностей", "Постоянная величина", "Все варианты верные"},
                {"Вероятность попадания непрерывной двумерной величины (X, Y) в область D равна", "Двойной несобственный интеграл в бесконечных пределах от плотности вероятности двумерной случайной величины не равен единице", "Плотность вероятности двумерной случайной величины есть отрицательная функция", "Полный объем тела, ограниченного поверхностью распределения и плоскостью Оху, равен -1"},
                {"Этой постоянной", "1", "2", "Нет верного варианта"}, {"И для зависимых, и для независимых", "Только для зависимых", "Только для независимых", "Нет верного варианта"},
                {"λ", "(a + b)/2", "1/λ", "Нет верного ответа"}, {"1/λ", "(a + b)/2", "λ", "Нет верного ответа"} };
        int number = rand.nextInt(0, 9);
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.addText("4. " + theoryTask4Questions[number]);
        String[] res = {"", "", "", ""};
        for (int i = 0; i < 4; i++)
            res[i] = theoryTask4Answers[number][i];
        List<String> res2 = Arrays.asList(res);
        Collections.shuffle(res2);
        String[] res3 = {"", "", "", ""};
        for (int i = 0; i < 4; i++)
            res3[i] = res2.get(i);
        if (number == 0)
        {
            poiMainClassVariant.newParagraph();
            poiMainClassVariant.addPicture("src\\dopRes\\theoryQuestion\\theoryQuestion31.png", 133, 53);
            for (int i = 0; i < 4; i++)
            {
                poiMainClassVariant.newParagraph();
                poiMainClassVariant.addText(alphabet[i] + res3[i]);
                if (res3[i] == theoryTask4Answers[number][0])
                    poiMainClassAnswers.addText("№4 - " + alphabet[i] + ";");
            }
        }
        else if (number == 1)
        {
            poiMainClassVariant.newParagraph();
            poiMainClassVariant.addPicture("src\\dopRes\\theoryQuestion\\theoryQuestion32.png", 149, 50);
            for (int i = 0; i < 4; i++)
            {
                poiMainClassVariant.newParagraph();
                poiMainClassVariant.addText(alphabet[i] + res3[i]);
                if (res3[i] == theoryTask4Answers[number][0])
                    poiMainClassAnswers.addText("№4 - " + alphabet[i] + ";");
            }
        }
        else if (number == 5)
        {
            for (int i = 0; i < 4; i++)
            {
                poiMainClassVariant.newParagraph();
                if (res3[i] == theoryTask4Answers[number][0])
                {
                    poiMainClassVariant.addText(alphabet[i] + res3[i]);
                    poiMainClassVariant.addPicture("src\\dopRes\\theoryQuestion\\theoryQuestion36.png", 202, 37);
                }
                else
                    poiMainClassVariant.addText(alphabet[i] + res3[i]);
                if (res3[i] == theoryTask4Answers[number][0])
                    poiMainClassAnswers.addText("№4 - " + alphabet[i] + ";");
            }
        }
        else if (number == 8)
        {
            String[] resImages = {"src\\dopRes\\theoryQuestion\\theoryQuestion39_40_41_a.png", "src\\dopRes\\theoryQuestion\\theoryQuestion39_40_41_b.png", "src\\dopRes\\theoryQuestion\\theoryQuestion39_40_41_c.png", "src\\dopRes\\theoryQuestion\\theoryQuestion39_40_41_d.png"};
            int[][] resSizes = { {28, 34}, {16, 37}, {14, 21}, {156, 20} };
            for (int i = 0; i < 4; i++)
            {
                poiMainClassVariant.newParagraph();
                poiMainClassVariant.addText(alphabet[i]);
                if (res3[i] == "λ")
                    poiMainClassVariant.addPicture(resImages[2], resSizes[2][0], resSizes[2][1]);
                if (res3[i] == "(a + b)/2")
                    poiMainClassVariant.addPicture(resImages[0], resSizes[0][0], resSizes[0][1]);
                if (res3[i] == "1/λ")
                    poiMainClassVariant.addPicture(resImages[1], resSizes[1][0], resSizes[1][1]);
                if (res3[i] == "Нет верного ответа")
                    poiMainClassVariant.addPicture(resImages[3], resSizes[3][0], resSizes[3][1]);
                if (res3[i] == theoryTask4Answers[number][0])
                    poiMainClassAnswers.addText("№4 - " + alphabet[i] + ";");
            }
        }
        else if (number == 9)
        {
            String[] resImages = {"src\\dopRes\\theoryQuestion\\theoryQuestion39_40_41_a.png", "src\\dopRes\\theoryQuestion\\theoryQuestion39_40_41_b.png", "src\\dopRes\\theoryQuestion\\theoryQuestion39_40_41_c.png", "src\\dopRes\\theoryQuestion\\theoryQuestion39_40_41_d.png"};
            int[][] resSizes = { {28, 34}, {16, 37}, {14, 21}, {156, 20} };
            for (int i = 0; i < 4; i++)
            {
                poiMainClassVariant.newParagraph();
                poiMainClassVariant.addText(alphabet[i]);
                if (res3[i] == "1/λ")
                    poiMainClassVariant.addPicture(resImages[1], resSizes[1][0], resSizes[1][1]);
                if (res3[i] == "(a + b)/2")
                    poiMainClassVariant.addPicture(resImages[0], resSizes[0][0], resSizes[0][1]);
                if (res3[i] == "λ")
                    poiMainClassVariant.addPicture(resImages[2], resSizes[2][0], resSizes[2][1]);
                if (res3[i] == "Нет верного ответа")
                    poiMainClassVariant.addPicture(resImages[3], resSizes[3][0], resSizes[3][1]);
                if (res3[i] == theoryTask4Answers[number][0])
                    poiMainClassAnswers.addText("№4 - " + alphabet[i] + ";");
            }
        }
        else
        {
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
                if (res3[i] == theoryTask4Answers[number][0])
                    poiMainClassAnswers.addText("№4 - " + alphabet[i] + ";");
            }
        }
    }
}