import java.util.*;

public class StudentProject
{
    public static void main(String [] args)
    {
        Scanner sc_int = new Scanner(System.in);
        Scanner sc_string = new Scanner(System.in);
        StudentGroup sg = new StudentGroup();
        System.out.print("Введите кол-во студентов: ");
        int n = sc_int.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.print("Введите фамилию: ");
            String f = sc_string.nextLine();
            System.out.print("Введите адрес: ");
            String ad = sc_string.nextLine();
            System.out.print("Введите факультет: ");
            String fak = sc_string.nextLine();
            System.out.print("Введите курс: ");
            int kurs = sc_int.nextInt();
            System.out.print("Введите кол-во оценок: ");
            int k = sc_int.nextInt();
            int []m = new int[k];
            for (int j = 0; j < k; j++)
                m[j] = sc_int.nextInt();
            Student st = new Student(f, ad, fak, kurs, m);
            sg.add(st);
        }
        sg.print();
        System.out.println("Кого удалить из списка?");
        String f = sc_string.nextLine();
        sg.del(f);
        sg.print();
    }
}