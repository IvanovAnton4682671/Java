import java.util.*;

public class Main_Window
{
    public static void main(String [] args)
    {
        Scanner sc_int = new Scanner(System.in);
        Scanner sc_string = new Scanner(System.in);
        Tasks ts = new Tasks();
        System.out.print("Введите кол-во вопросов: ");
        int n = sc_int.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.println("Введите вопрос:");
            String question = sc_string.nextLine();
            System.out.println("Введите ответ 1:");
            String answer1 = sc_string.nextLine();
            System.out.println("Введите ответ 2:");
            String answer2 = sc_string.nextLine();
            System.out.println("Введите ответ 3:");
            String answer3 = sc_string.nextLine();
            System.out.println("Введите ответ 4:");
            String answer4 = sc_string.nextLine();
            System.out.println("Введите ответ 5:");
            String answer5 = sc_string.nextLine();
            System.out.println("Введите номер правильного ответа:");
            int num = sc_int.nextInt();
            System.out.println("Введите кол-во баллов:");
            int balls = sc_int.nextInt();
            Task t = new Task(question, answer1, answer2, answer3, answer4, answer5, num, balls);
            ts.add(t);
        }
        ts.print();
        System.out.println("Какой билет удалить?");
        String question1 = sc_string.nextLine();
        ts.del(question1);
        ts.print();
        System.out.println("Какой билет найти?");
        String question2 = sc_string.nextLine();
        ts.search(question2);
    }
}