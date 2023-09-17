import java.util.Scanner;

public class Trap {
    int []point1 = new int[2];
    int []point2 = new int[2];
    int []point3 = new int[2];
    int []point4 = new int[2];

    Trap(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < point1.length; i++){
            System.out.println("Введите две координаты первой точки чере пробел X Y:");
            point1[i] = sc.nextInt();
        }
        for(int i = 0; i < point2.length; i++){
            System.out.println("Введите две координаты второй точки чере пробел X Y:");
            point2[i] = sc.nextInt();
        }
        for(int i = 0; i < point3.length; i++){
            System.out.println("Введите две координаты третьей точки чере пробел X Y:");
            point3[i] = sc.nextInt();
        }
        for(int i = 0; i < point4.length; i++){
            System.out.println("Введите две координаты четвёртой точки чере пробел X Y:");
            point4[i] = sc.nextInt();
        }
    }


    double Storona(int x){ //Нахождение длинны запрашиваемой стороны
        if( x == 12){
            return  Math.sqrt(Math.pow(point2[0] - point1[0], 2) + Math.pow(point2[1] - point1[1], 2));
        }
        if( x == 23){
            return  Math.sqrt(Math.pow(point3[0] - point2[0], 2) + Math.pow(point3[1] - point2[1], 2));
        }
        if( x == 34){
            return  Math.sqrt(Math.pow(point4[0] - point3[0], 2) + Math.pow(point4[1] - point3[1], 2));
        }
        if( x == 41){
            return  Math.sqrt(Math.pow(point1[0] - point4[0], 2) + Math.pow(point1[1] - point4[1], 2));
        }
        return 0;
    }

    boolean rB(){ //Проверка на равнобедренность
        return (Storona(12) == Storona(34)
                || Storona(23) == Storona(41));
    }

    double s(){ //Нахождение площади трапеции
        double a = Storona(12);
        double b = Storona(23);
        double c = Storona(34);
        double d = Storona(41);

        int aInt = (int) a;
        int bInt = (int) b;
        int cInt = (int) c;
        int dInt = (int) d;

        double aDouble = (double) aInt;
        double bDouble = (double) bInt;
        double cDouble = (double) cInt;
        double dDouble = (double) dInt;

        if( a - aDouble != 0  ){
            int h = aInt;
            return h*((Storona(23) + Storona(41))/2);
        }
        else if( c - cDouble != 0  ){
            int h = cInt;
            return h*((Storona(23) + Storona(41))/2);
        }
        else if( b - bDouble != 0  ){
            int h = bInt;
            return h*((Storona(12) + Storona(34))/2);
        }
        else if( d - dDouble != 0  ){
            int h = dInt;
            return h*((Storona(12) + Storona(34))/2);
        }
        return 0;
    }

    double p(){ //Нахождение пириметра трапеции
        return Storona(12) + Storona(23) + Storona(34) + Storona(41);
    }

}