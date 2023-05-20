package Functions;

import Listeners.PoiMainClass;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import java.util.*;

public class PracticeTask9
{
    //////////////////////////////////////////
    //передаём объекты и создаём конструктор//
    //////////////////////////////////////////
    PoiMainClass poiMainClassVariant;
    PoiMainClass poiMainClassAnswers;

    public PracticeTask9(PoiMainClass poiMainClassVariant, PoiMainClass poiMainClassAnswers)
    {
        this.poiMainClassVariant = poiMainClassVariant;
        this.poiMainClassAnswers = poiMainClassAnswers;
    }

    Random rand = new Random();

    public void practiceTask9Function()
    {
        //////////////////////
        //правильно работает//
        /////////////////////////////////////////////////////////////////////////
        //массив букв, картинок-условий, их размеры, размеры остальных картинок//
        /////////////////////////////////////////////////////////////////////////
        String[] alphabet = {"А)", "Б)", "В)", "Г)"};
        String[] pictures = {"src\\dopRes\\practiceQuestion\\practiceQuestion9_1.png", "src\\dopRes\\practiceQuestion\\practiceQuestion9_2.png", "src\\dopRes\\practiceQuestion\\practiceQuestion9_3.png", "src\\dopRes\\practiceQuestion\\practiceQuestion9_4.png"};
        int weight = 240;
        int height = 120;
        String[] pictures_answer = {"", "", "", ""};
        int answer_weight = 150;
        int answer_height = 100;
        int num = rand.nextInt(0, 4);
        if (num == 0)
        {
            pictures_answer[0] = "src\\dopRes\\practiceQuestion\\practiceQuestion9_1_a.png";
            pictures_answer[1] = "src\\dopRes\\practiceQuestion\\practiceQuestion9_1_b.png";
            pictures_answer[2] = "src\\dopRes\\practiceQuestion\\practiceQuestion9_1_c.png";
            pictures_answer[3] = "src\\dopRes\\practiceQuestion\\practiceQuestion9_1_d.png";
        }
        if (num == 1)
        {
            pictures_answer[0] = "src\\dopRes\\practiceQuestion\\practiceQuestion9_2_a.png";
            pictures_answer[1] = "src\\dopRes\\practiceQuestion\\practiceQuestion9_2_b.png";
            pictures_answer[2] = "src\\dopRes\\practiceQuestion\\practiceQuestion9_2_c.png";
            pictures_answer[3] = "src\\dopRes\\practiceQuestion\\practiceQuestion9_2_d.png";
        }
        if (num == 2)
        {
            pictures_answer[0] = "src\\dopRes\\practiceQuestion\\practiceQuestion9_3_a.png";
            pictures_answer[1] = "src\\dopRes\\practiceQuestion\\practiceQuestion9_3_b.png";
            pictures_answer[2] = "src\\dopRes\\practiceQuestion\\practiceQuestion9_3_c.png";
            pictures_answer[3] = "src\\dopRes\\practiceQuestion\\practiceQuestion9_3_d.png";
        }
        if (num == 3)
        {
            pictures_answer[0] = "src\\dopRes\\practiceQuestion\\practiceQuestion9_4_a.png";
            pictures_answer[1] = "src\\dopRes\\practiceQuestion\\practiceQuestion9_4_b.png";
            pictures_answer[2] = "src\\dopRes\\practiceQuestion\\practiceQuestion9_4_c.png";
            pictures_answer[3] = "src\\dopRes\\practiceQuestion\\practiceQuestion9_4_d.png";
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //танцы с бубном ака шафл(перемешивание) массива ответов: делаем массив, в него их передаём, переводим его в лист, шаффлим лист, переводим обратно в массив (как допёр - сам не знаю)//
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String[] res = {"", "", "", ""};
        for (int i = 0; i < 4; i++)
            res[i] = pictures_answer[i];
        List<String> res2 = Arrays.asList(res);
        Collections.shuffle(res2);
        String[] res3 = {"", "", "", ""};
        for (int i = 0; i < 4; i++)
            res3[i] = res2.get(i);
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.newParagraph();
        poiMainClassVariant.addText("14. Дан график плотности распределения вероятностей непрерывной случайной величины X (см. картинку). Тогда график её функции распределения вероятностей имеет вид:");
        poiMainClassVariant.addPicture(pictures[num], weight, height);
        XWPFDocument docx = poiMainClassVariant.getDocx();
        XWPFParagraph paragraph1 = docx.createParagraph();
        XWPFParagraph paragraph2 = docx.createParagraph();
        for (int i = 0; i < 4; i++)
        {
            if (i == 2)
            {
                if (res3[i] == pictures_answer[0])
                {
                    if (i == 0 || i == 2)
                    {
                        poiMainClassVariant.addText("               " + alphabet[i]);
                        //poiMainClassVariant.addTextLeft(alphabet[i], paragraph1);
                        poiMainClassVariant.addPictureLeft(pictures_answer[0], answer_weight, answer_height, paragraph1);
                    }
                    else
                    {
                        poiMainClassVariant.addText("               " + alphabet[i]);
                        //poiMainClassVariant.addTextRight(alphabet[i], paragraph2);
                        poiMainClassVariant.addPictureRight(pictures_answer[0], answer_weight, answer_height, paragraph2);
                    }
                }
                if (res3[i] == pictures_answer[1])
                {
                    if (i == 0 || i == 2)
                    {
                        poiMainClassVariant.addText("               " + alphabet[i]);
                        //poiMainClassVariant.addTextLeft(alphabet[i], paragraph1);
                        poiMainClassVariant.addPictureLeft(pictures_answer[1], answer_weight, answer_height, paragraph1);
                    }
                    else
                    {
                        poiMainClassVariant.addText("               " + alphabet[i]);
                        //poiMainClassVariant.addTextRight(alphabet[i], paragraph2);
                        poiMainClassVariant.addPictureRight(pictures_answer[1], answer_weight, answer_height, paragraph2);
                    }
                }
                if (res3[i] == pictures_answer[2])
                {
                    if (i == 0 || i == 2)
                    {
                        poiMainClassVariant.addText("               " + alphabet[i]);
                        //poiMainClassVariant.addTextLeft(alphabet[i], paragraph1);
                        poiMainClassVariant.addPictureLeft(pictures_answer[2], answer_weight, answer_height, paragraph1);
                    }
                    else
                    {
                        poiMainClassVariant.addText("               " + alphabet[i]);
                        //poiMainClassVariant.addTextRight(alphabet[i], paragraph2);
                        poiMainClassVariant.addPictureRight(pictures_answer[2], answer_weight, answer_height, paragraph2);
                    }
                }
                if (res3[i] == pictures_answer[3])
                {
                    if (i == 0 || i == 2)
                    {
                        poiMainClassVariant.addText("               " + alphabet[i]);
                        //poiMainClassVariant.addTextLeft(alphabet[i], paragraph1);
                        poiMainClassVariant.addPictureLeft(pictures_answer[3], answer_weight, answer_height, paragraph1);
                    }
                    else
                    {
                        poiMainClassVariant.addText("               " + alphabet[i]);
                        //poiMainClassVariant.addTextRight(alphabet[i], paragraph2);
                        poiMainClassVariant.addPictureRight(pictures_answer[3], answer_weight, answer_height, paragraph2);
                    }
                }
                ////////////////////////////////////////////////////////////////////////////////////////////////////////
                //записываем букву ответа в файл ответов (хитрость в том, что ответы всегда на первом месте в массиве)//
                ////////////////////////////////////////////////////////////////////////////////////////////////////////
                if (res3[i] == pictures_answer[0])
                    poiMainClassAnswers.addText("№14 - " + alphabet[i] + ";");
            }
            //////////////////////////////////////////////
            //вставляем нужную картинку в вариант ответа//
            //////////////////////////////////////////////
            else
            {
                if (res3[i] == pictures_answer[0])
                {
                    if (i == 0 || i == 2)
                    {
                        poiMainClassVariant.addText(alphabet[i]);
                        //poiMainClassVariant.addTextLeft(alphabet[i], paragraph1);
                        poiMainClassVariant.addPictureLeft(pictures_answer[0], answer_weight, answer_height, paragraph1);
                    }
                    else
                    {
                        poiMainClassVariant.addText(alphabet[i]);
                        //poiMainClassVariant.addTextRight(alphabet[i], paragraph2);
                        poiMainClassVariant.addPictureRight(pictures_answer[0], answer_weight, answer_height, paragraph2);
                    }
                }
                if (res3[i] == pictures_answer[1])
                {
                    if (i == 0 || i == 2)
                    {
                        poiMainClassVariant.addText(alphabet[i]);
                        //poiMainClassVariant.addTextLeft(alphabet[i], paragraph1);
                        poiMainClassVariant.addPictureLeft(pictures_answer[1], answer_weight, answer_height, paragraph1);
                    }
                    else
                    {
                        poiMainClassVariant.addText(alphabet[i]);
                        //poiMainClassVariant.addTextRight(alphabet[i], paragraph2);
                        poiMainClassVariant.addPictureRight(pictures_answer[1], answer_weight, answer_height, paragraph2);
                    }
                }
                if (res3[i] == pictures_answer[2])
                {
                    if (i == 0 || i == 2)
                    {
                        poiMainClassVariant.addText(alphabet[i]);
                        //poiMainClassVariant.addTextLeft(alphabet[i], paragraph1);
                        poiMainClassVariant.addPictureLeft(pictures_answer[2], answer_weight, answer_height, paragraph1);
                    }
                    else
                    {
                        poiMainClassVariant.addText(alphabet[i]);
                        //poiMainClassVariant.addTextRight(alphabet[i], paragraph2);
                        poiMainClassVariant.addPictureRight(pictures_answer[2], answer_weight, answer_height, paragraph2);
                    }
                }
                if (res3[i] == pictures_answer[3])
                {
                    if (i == 0 || i == 2)
                    {
                        poiMainClassVariant.addText(alphabet[i]);
                        //poiMainClassVariant.addTextLeft(alphabet[i], paragraph1);
                        poiMainClassVariant.addPictureLeft(pictures_answer[3], answer_weight, answer_height, paragraph1);
                    }
                    else
                    {
                        poiMainClassVariant.addText(alphabet[i]);
                        //poiMainClassVariant.addTextRight(alphabet[i], paragraph2);
                        poiMainClassVariant.addPictureRight(pictures_answer[3], answer_weight, answer_height, paragraph2);
                    }
                }
                ////////////////////////////////////////////////////////////////////////////////////////////////////////
                //записываем букву ответа в файл ответов (хитрость в том, что ответы всегда на первом месте в массиве)//
                ////////////////////////////////////////////////////////////////////////////////////////////////////////
                if (res3[i] == pictures_answer[0])
                    poiMainClassAnswers.addText("№14 - " + alphabet[i] + ";");
            }
        }
    }
}