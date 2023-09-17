import java.util.*;

public class Main_Window
{
    public static void main(String [] args)
    {
        Scanner sc_str = new Scanner(System.in);
        Scanner sc_int = new Scanner(System.in);
        Company company = new Company();
        System.out.println("--------------------------------------------------");
        System.out.println("Введите кол-во сотрудников:");
        int n = sc_int.nextInt();
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < n; i++)
        {
            System.out.println("--------------------------------------------------");
            System.out.println("Введите фамилию:");
            String last_name = sc_str.nextLine();
            System.out.println("Введите имя:");
            String first_name = sc_str.nextLine();
            System.out.println("Введите отчество:");
            String patronymic = sc_str.nextLine();
            System.out.println("Введите должность:");
            String post = sc_str.nextLine();
            System.out.println("Введите зарплату:");
            int salary = sc_int.nextInt();
            System.out.println("--------------------------------------------------");
            Employee employee = new Employee(last_name, first_name, patronymic, post, salary);
            company.add(employee);
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Выберите действие:");
        System.out.println("0 - прекратить работу");
        System.out.println("1 - добавить запись");
        System.out.println("2 - удалить запись по фамилии");
        System.out.println("3 - вывести все записи");
        System.out.println("4 - поиск записи по фамилии");
        System.out.println("5 - отсортировать по фамилии");
        System.out.println("6 - отсортировать по зарплате");
        int c = sc_int.nextInt();
        System.out.println("--------------------------------------------------");
        while (c != 0)
        {
            if (c == 1)
            {
                System.out.println("--------------------------------------------------");
                System.out.println("Введите фамилию:");
                String last_name = sc_str.nextLine();
                System.out.println("Введите имя:");
                String first_name = sc_str.nextLine();
                System.out.println("Введите отчество:");
                String patronymic = sc_str.nextLine();
                System.out.println("Введите должность:");
                String post = sc_str.nextLine();
                System.out.println("Введите зарплату:");
                int salary = sc_int.nextInt();
                System.out.println("--------------------------------------------------");
                Employee employee = new Employee(last_name, first_name, patronymic, post, salary);
                company.add(employee);
            }
            if (c == 2)
            {
                System.out.println("--------------------------------------------------");
                System.out.println("Введите фамилию:");
                String last_name = sc_str.nextLine();
                System.out.println("--------------------------------------------------");
                company.del(last_name);
            }
            if (c == 3)
                company.print();
            if (c == 4)
            {
                System.out.println("--------------------------------------------------");
                System.out.println("Введите фамилию:");
                String last_name = sc_str.nextLine();
                System.out.println("--------------------------------------------------");
                company.search(last_name);
            }
            if (c == 5)
            {
                company.sortByLast_name();
                company.print();
            }
            if (c == 6)
            {
                company.sortBySalary();
                company.print();
            }
            if (c != 0 && c != 1 && c != 2 && c != 3 && c != 4 && c != 5 && c != 6)
            {
                System.out.println("--------------------------------------------------");
                System.out.println("Вы ввели неверный номер");
                System.out.println("--------------------------------------------------");
            }
            System.out.println("--------------------------------------------------");
            System.out.println("Выберите действие:");
            System.out.println("0 - прекратить работу");
            System.out.println("1 - добавить запись");
            System.out.println("2 - удалить запись по фамилии");
            System.out.println("3 - вывести все записи");
            System.out.println("4 - поиск записи по фамилии");
            System.out.println("5 - отсортировать по фамилии");
            System.out.println("6 - отсортировать по зарплате");
            c = sc_int.nextInt();
            System.out.println("--------------------------------------------------");
        }
    }
}