import java.util.*;

public class Djen
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n1 = sc.nextInt();
        Integer [] m1 = new Integer[n1];
        System.out.println("Заполните массив:");
        for (int i = 0; i < n1; i++)
            m1[i] = sc.nextInt();
        Mass<Integer> m1_1 = new Mass<>(m1);
        try
        {
            m1_1.print();
            System.out.println();
            System.out.print("Введите номер нужного элемента массива: ");
            int p1 = sc.nextInt();
            m1_1.chast(p1);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.print("Введите размер массива: ");
        int n2 = sc.nextInt();
        Double [] m2 = new Double[n2];
        System.out.println("Заполните массив:");
        for (int i = 0; i < n2; i++)
            m2[i] = sc.nextDouble();
        Mass<Double> m2_2 = new Mass<>(m2);
        try
        {
            m2_2.print();
            System.out.println();
            System.out.print("Введите номер нужного элемента массива: ");
            int p2 = sc.nextInt();
            m2_2.chast(p2);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.print("Введите размер массива: ");
        int n3 = sc.nextInt();
        String [] m3 = new String[n3];
        System.out.println("Заполните массив:");
        for (int i = 0; i < n3; i++)
            m3[i] = sc.nextLine();
        Mass<String> m3_3 = new Mass<>(m3);
        try
        {
            m3_3.print();
            System.out.println();
            System.out.print("Введите номер нужного элемента массива: ");
            int p3 = sc.nextInt();
            m3_3.chast(p3);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
}