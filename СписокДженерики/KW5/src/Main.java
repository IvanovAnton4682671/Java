import java.util.*;

public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        List<String> list = new List<String>("odin");
        list.add("dva");
        list.print();
        list.remove(1);
        list.print();
        list.add("tri");
        list.add("chetiri");
        list.add("piat");
        list.print();
        list.remove(4);
        list.add("shest");
        list.print();
    }
}