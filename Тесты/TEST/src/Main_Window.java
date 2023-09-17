import java.util.*;

public class Main_Window
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите степень полинома 1: ");
        int n1 = sc.nextInt();
        n1 = n1 + 1;
        Polynomial p1 = new Polynomial(n1);
        System.out.println("Введите коэф-ты при степенях:");
        p1.init();
        System.out.print("Ваш полином: ");
        p1.print();
        System.out.println();
        System.out.print("Введите ваш Х: ");
        int x = sc.nextInt();
        System.out.print("Полином равен: ");
        p1.calculate(x);
        System.out.println();
        System.out.print("Введите степень полинома 2: ");
        int n2 = sc.nextInt();
        n2 = n2 + 1;
        Polynomial p2 = new Polynomial(n2);
        System.out.println("Введите коэф-ты при степенях:");
        p2.init();
        System.out.print("Ваш полином: ");
        p2.print();
        System.out.println();
        System.out.print("Сумма полиномов: ");
        p1.sum(p2.p);
        p1.print();
        System.out.println();
        System.out.print("Разность полиномов: ");
        p1.dif(p2.p);
        p1.dif(p2.p);
        p1.print();
    }
}