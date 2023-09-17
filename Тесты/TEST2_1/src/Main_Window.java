import java.util.*;

public class Main_Window
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во трапеций:");
        int n = sc.nextInt();
        int ko_ti = 2;
        double [] mas = new double [n];
        double ob_square = 0;
        double sr_square = 0;
        Trapezoid p1 = new Trapezoid(ko_ti);
        Trapezoid p2 = new Trapezoid(ko_ti);
        Trapezoid p3 = new Trapezoid(ko_ti);
        Trapezoid p4 = new Trapezoid(ko_ti);
        for (int i = 0; i < n; i++)
        {
            System.out.println("Введите координаты 4-ёх точек (слева направо), по которым построится трапеция (Х У):");
            p1.init();
            p2.init();
            p3.init();
            p4.init();
            System.out.println("Периметр трапеции: "+p1.perimeter(p1.p, p2.p, p3.p, p4.p));
            System.out.println("Площадь трапеции: "+p1.square(p1.p, p2.p, p3.p, p4.p));
            mas[i] = p1.square(p1.p, p2.p, p3.p, p4.p);
            ob_square += p1.square(p1.p, p2.p, p3.p, p4.p);
        }
        sr_square = ob_square / n;
        int col = 0;
        for (int i = 0; i < n; i++)
            if (mas[i] > sr_square)
                col ++;
        System.out.println("Кол-во трапеций, у которых площадь больше средней: "+col);
    }
}