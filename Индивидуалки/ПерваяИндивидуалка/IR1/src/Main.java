import java.util.*;

public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Здравствуйте.");
        System.out.println("Наша компания готова предложить Вам несколько вакансий на выбор.");
        System.out.println("Пожалуйста, введите данные, и Вы сможете увидеть Наши предложения.");
        System.out.println("Введите Вашу Фамилию:");
        String name0 = sc.nextLine();
        System.out.println("Введите Ваше Имя:");
        String name1 = sc.nextLine();
        System.out.println("Введите Ваше Отчество:");
        String name2 = sc.nextLine();
        System.out.println("Введите кол-во часов, которые Вы готовы отрабатывать в день:");
        int kol_chas = sc.nextInt();
        System.out.println("Введите желаемую почасовую оплату:");
        int op_chas = sc.nextInt();
        System.out.println("Введите кол-во дней, которые Вы готовы работать в месяц:");
        int kol_den = sc.nextInt();
        System.out.println("Введите желаемую дневную оплату:");
        int op_den = sc.nextInt();
        System.out.println("Введите (приблизительно) сумму, на которую Вы сможете продавать товаров в день:");
        int kol_prod = sc.nextInt();
        System.out.println("Введите желаемую процентную ставку:");
        double procent = sc.nextDouble();
        System.out.println("--------------------------------------------------");
        System.out.println("Вакансии на основе Ваших данных:");
        System.out.println();
        SSPO s0 = new SSPO(name0, name1, name2, kol_chas, op_chas);
        SVS s1 = new SVS(name0, name1, name2, kol_den, op_den);
        SSPS s2 = new SSPS(name0, name1, name2, kol_prod, procent);
        System.out.println(s0.toString());
        System.out.println();
        System.out.println(s1.toString());
        System.out.println();
        System.out.println(s2.toString());
    }
}