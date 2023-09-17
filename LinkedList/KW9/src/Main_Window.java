import java.util.*;

public class Main_Window
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        List l = new List();
        System.out.println("------------------------------");
        System.out.println("Fill in the list:");
        l.create();
        System.out.println("------------------------------");
        System.out.println("List:");
        l.print();
        System.out.println("------------------------------");
        System.out.println("List reverse:");
        l.print_reverse();
        System.out.println("------------------------------");
        System.out.print("Enter the field you want to delete: ");
        String s = sc.nextLine();
        l.del(s);
        l.print();
        System.out.println("------------------------------");
        l.sym();
        System.out.println("------------------------------");
        System.out.print("Enter the field you want to delete (reverse): ");
        String s1 = sc.nextLine();
        l.del_reverse(s1);
        l.print();
        System.out.println("------------------------------");
        //l.duplication();
        l.print();
        System.out.println("------------------------------");
    }
}