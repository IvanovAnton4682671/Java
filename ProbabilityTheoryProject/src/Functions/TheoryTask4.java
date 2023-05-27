package Functions;

import Listeners.PoiMainClass;

import java.util.*;

public class TheoryTask4
{
    //////////////////////////////////////////
    //передаём объекты и создаём конструктор//
    //////////////////////////////////////////
    PoiMainClass poiMainClassVariant;
    PoiMainClass poiMainClassAnswers;
    final int font_size;
    int num;
    int var;

    public TheoryTask4(PoiMainClass poiMainClassVariant, PoiMainClass poiMainClassAnswers, int font_size, int num, int var)
    {
        this.poiMainClassVariant = poiMainClassVariant;
        this.poiMainClassAnswers = poiMainClassAnswers;
        this.font_size = font_size;
        this.num = num;
        this.var = var;
    }

    /////////////////////////////
    //для случайного числа надо//
    /////////////////////////////
    Random rand = new Random();

    public void theoryTask4Function()
    {
        ///////////////////////////////////////////////////////////////////
        //тут всё хорошо, все символы корректно отображаются (и картинки)//
        ///////////////////////////////////////////////////////////////////
        //буквы ответов, вопросы и ответы к ним//
        /////////////////////////////////////////
        String[] alphabet = {"А) ", "Б) ", "В) ", "Г) "};
        String[] alphabetTable = {"А", "Б", "В", "Г"};
        String[] theoryTask4Questions = {"Определите закон распределения непрерывной случайной величины, если плотность распределения имеет вид (см. картинку):",
                "Определите закон распределения непрерывной случайной величины, если плотность распределения имеет вид (см. картинку):", "Выберете НЕВЕРНОЕ утверждение:",
                "Двумерная случайная величина называется непрерывной, если её функция распределения -", "Плотность распределения вероятностей непрерывной двумерной случайной величины – это:",
                "Выберете верный вариант:", "Математическое ожидание постоянной равно:", "Для каких случайных величин справедливо свойство математического ожидания: M(X + Y) = MX + MY?",
                "Чему равно математическое ожидание при пуассоновском распределении с параметром λ?", "Чему равно математическое ожидание при экспоненциальном распределении с параметром λ?"};
        String[][] theoryTask4Answers = { {"Экспоненциальное распределение", "Нормальное распределение", "Равномерное распределение", "Биномиальное распределение"},
                {"Нормальное распределение", "Биномиальное распределение", "Распределение Бернулли", "Распределение Пуассона"},
                {"Функция распределения F(x, у) есть отрицательная функция, заключённая между нулём и единицей", "Функция распределения F(x, у) есть неубывающая функция по каждому из аргументов", "Если хотя бы один из аргументов обращается в -∞, функция распределения", "Если оба аргумента равны +∞, то функция распределения равна единице"},
                {"Непрерывная , дифференцируемая по каждому из аргументов, и существует вторая смешанная производная", "Непрерывная , дифференцируемая по каждому из аргументов, и существует третья смешанная производная", "Непрерывная", "Ни один вариант не является верным"},
                {"Вторая смешанная частная производная её функции распределения", "Сумма всех вероятностей", "Постоянная величина", "Все варианты верные"},
                {"Вероятность попадания непрерывной двумерной величины (X, Y) в область D равна", "Двойной несобственный интеграл в бесконечных пределах от плотности вероятности двумерной случайной величины не равен единице", "Плотность вероятности двумерной случайной величины есть отрицательная функция", "Полный объем тела, ограниченного поверхностью распределения и плоскостью Оху, равен -1"},
                {"Этой постоянной", "1", "2", "Нет верного варианта"}, {"И для зависимых, и для независимых", "Только для зависимых", "Только для независимых", "Нет верного варианта"},
                {"λ", "(a + b)/2", "1/λ", "Нет верного ответа"}, {"1/λ", "(a + b)/2", "λ", "Нет верного ответа"} };
        /////////////////////////////////////////////////////
        //делаем рандомное число - номер вопроса из массива//
        /////////////////////////////////////////////////////
        int number = rand.nextInt(0, 10);
        ///////////////////////////////////
        //записываем вопрос после отступа//
        ///////////////////////////////////
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.addText("4. " + theoryTask4Questions[number]);
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
        //////////////////////////////////////////////////
        //добавляем картинку в само задание, не в ответы//
        //////////////////////////////////////////////////
        if (number == 0)
        {
            int width = 0;
            int height = 0;
            if (font_size == 10) { width = 110; height = 40;}
            if (font_size == 12) { width = 120; height = 45;}
            if (font_size == 14) { width = 130; height = 50;}
            if (font_size == 16) { width = 140; height = 55;}
            if (font_size == 18) { width = 150; height = 60;}
            poiMainClassVariant.newParagraph();
            poiMainClassVariant.addPicture("src\\dopRes\\theoryQuestion\\theoryQuestion31.png", width, height);
            for (int i = 0; i < 4; i++)
            {
                poiMainClassVariant.newParagraph();
                poiMainClassVariant.addText(alphabet[i] + res3[i]);
                if (res3[i] == theoryTask4Answers[number][0])
                {
                    //poiMainClassAnswers.addText("№4 - " + alphabet[i] + ";");
                    poiMainClassAnswers.addTaleItem(alphabetTable[i], num, var);
                }
            }
        }
        //////////////////////////////////////////////////
        //добавляем картинку в само задание, не в ответы//
        //////////////////////////////////////////////////
        else if (number == 1)
        {
            int width = 0;
            int height = 0;
            if (font_size == 10) { width = 130; height = 40;}
            if (font_size == 12) { width = 140; height = 45;}
            if (font_size == 14) { width = 150; height = 50;}
            if (font_size == 16) { width = 160; height = 55;}
            if (font_size == 18) { width = 170; height = 60;}
            poiMainClassVariant.newParagraph();
            poiMainClassVariant.addPicture("src\\dopRes\\theoryQuestion\\theoryQuestion32.png", width, height);
            for (int i = 0; i < 4; i++)
            {
                poiMainClassVariant.newParagraph();
                poiMainClassVariant.addText(alphabet[i] + res3[i]);
                if (res3[i] == theoryTask4Answers[number][0])
                {
                    //poiMainClassAnswers.addText("№4 - " + alphabet[i] + ";");
                    poiMainClassAnswers.addTaleItem(alphabetTable[i], num, var);
                }
            }
        }
        //////////////////////////////////////////////////
        //добавляем картинку в само задание, не в ответы//
        //////////////////////////////////////////////////
        else if (number == 5)
        {
            for (int i = 0; i < 4; i++)
            {
                poiMainClassVariant.newParagraph();
                if (res3[i] == theoryTask4Answers[number][0])
                {
                    int width = 0;
                    int height = 0;
                    if (font_size == 10) { width = 150; height = 30;}
                    if (font_size == 12) { width = 170; height = 35;}
                    if (font_size == 14) { width = 200; height = 40;}
                    if (font_size == 16) { width = 210; height = 45;}
                    if (font_size == 18) { width = 220; height = 50;}
                    poiMainClassVariant.addText(alphabet[i] + res3[i]);
                    poiMainClassVariant.addPicture("src\\dopRes\\theoryQuestion\\theoryQuestion36.png", width, height);
                }
                else
                    poiMainClassVariant.addText(alphabet[i] + res3[i]);
                if (res3[i] == theoryTask4Answers[number][0])
                {
                    //poiMainClassAnswers.addText("№4 - " + alphabet[i] + ";");
                    poiMainClassAnswers.addTaleItem(alphabetTable[i], num, var);
                }
            }
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //тут спорное решение: я не нашёл некоторые спец. символы и сделал картинки (скриншоты), если это тот самый номер - из массива картинок подставляем нужную по массиву///////////////////////////////
        //спорное потому, что картинки не масштабируются, и норм смотрятся только с 14-20 размером шрифта, так что тут может быть проблема (если прижмёт - удалим их и будем некрасивые ответы показывать)//
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        else if (number == 8 || number == 9)
        {
            String[] resImages = {"src\\dopRes\\theoryQuestion\\theoryQuestion39_40_41_a.png", "src\\dopRes\\theoryQuestion\\theoryQuestion39_40_41_b.png", "src\\dopRes\\theoryQuestion\\theoryQuestion39_40_41_c.png", "src\\dopRes\\theoryQuestion\\theoryQuestion39_40_41_d.png"};
            int[][] resSizes = { {0, 0}, {0, 0}, {0, 0}, {0, 0} };
            if (font_size == 10) { resSizes = new int[][] { {20, 25}, {10, 20}, {10, 15}, {110, 15} }; }
            if (font_size == 12) { resSizes = new int[][] { {25, 30}, {13, 30}, {12, 17}, {130, 18} }; }
            if (font_size == 14) { resSizes = new int[][] { {30, 35}, {15, 35}, {15, 20}, {150, 20} }; }
            if (font_size == 16) { resSizes = new int[][] { {35, 40}, {18, 37}, {17, 23}, {160, 25} }; }
            if (font_size == 18) { resSizes = new int[][] { {40, 45}, {20, 40}, {20, 25}, {170, 30} }; }
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
                {
                    //poiMainClassAnswers.addText("№4 - " + alphabet[i] + ";");
                    poiMainClassAnswers.addTaleItem(alphabetTable[i], num, var);
                }
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
                {
                    //poiMainClassAnswers.addText("№4 - " + alphabet[i] + ";");
                    poiMainClassAnswers.addTaleItem(alphabetTable[i], num, var);
                }
            }
        }
    }
}