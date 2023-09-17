import java.util.*;

public class Trapezoid
{
    int ko_ti;
    int [] p;

    Trapezoid(int ko_ti)
    {
        this.ko_ti = ko_ti;
        p = new int [ko_ti];
    }

    void init()
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ko_ti; i++)
            p[i] = sc.nextInt();
    }

    double length(int [] p1, int [] p2)
    {
        double length = Math.sqrt(Math.pow((p2[0] - p1[0]), 2) + Math.pow((p2[1] - p1[1]), 2));
        return length;
    }

    double perimeter(int [] p1, int [] p2, int [] p3, int [] p4)
    {
        double perimeter = length(p1, p2) + length(p2, p3) + length(p3, p4) + length(p4, p1);
        return perimeter;
    }

    double square(int [] p1, int [] p2, int [] p3, int [] p4)
    {
        int h = p2[1] - p1[1];
        double square = ((length(p1, p4) + length(p2, p3))/2)*h;
        return square;
    }
}