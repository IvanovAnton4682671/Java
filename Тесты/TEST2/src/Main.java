import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите кол-во трапеций: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Trap []t = new Trap[n];

        double [] arrayS = new double[n];
        double sumS = 0;

        for (int i = 0; i < n; i++){
            t[i] = new Trap();
            System.out.println("Введите координаты трапеции: ");

            System.out.println("Длины сторон трапеции: ");
            System.out.println(t[i].Storona(12));
            System.out.println(t[i].Storona(23));
            System.out.println(t[i].Storona(34));
            System.out.println(t[i].Storona(41));

            if(t[i].rB()) System.out.println("Равнобедренная");
            else System.out.println("НЕ Равнобедренная");

            System.out.println("S = " + t[i].s());
            System.out.println("P = " + t[i].p());

            arrayS[i] = t[i].s();
            sumS += t[i].s();
        }

        double sredZn = sumS / n;
        for(int i = 0; i < n; i++){
            if(arrayS[i] > sredZn) System.out.println("Площадь трапеции " + (i+1) + " больше среднего значения.");
        }
    }
}