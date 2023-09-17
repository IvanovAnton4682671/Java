import java.util.LinkedList;
import java.util.*;

public class List
{
    LinkedList<String> list;

    List()
    {
        list = new LinkedList<String>();
    }

    void create()
    {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        while (!s.equals(""))
        {
            list.addLast(s);
            s = sc.nextLine();
        }
    }

    void print()
    {
        ListIterator<String> it = list.listIterator();
        while (it.hasNext())
            System.out.println(it.next());
    }

    void print_reverse()
    {
        ListIterator<String> it = list.listIterator(list.size());
        while (it.hasPrevious())
            System.out.println(it.previous());
    }

    void del(String s)
    {
        ListIterator<String> it = list.listIterator();
        while (it.hasNext())
            if (it.next().equals(s))
                it.remove();
    }

    void sym()
    {
        ListIterator<String> it1 = list.listIterator();
        ListIterator<String> it2 = list.listIterator(list.size());
        boolean f = true;
        while (it1.hasNext() && it2.hasPrevious())
        {
            if (!it1.next().equals(it2.previous()))
                f = false;
        }
        if (f == true)
            System.out.println("List is symmetrical");
        else System.out.println("List is not symmetrical");
    }

    void del_reverse(String s)
    {
        ListIterator it = list.listIterator(list.size());
        while (it.hasPrevious())
            if (it.previous().equals(s))
            {
                it.remove();
                break;
            }
    }

    /*void duplication()
    {
        ListIterator<String> it = list.listIterator();
        while (it.hasNext())
        {
            String s = it.next();
            list.add(s);
        }
    }*/

    /*void add_reverse()
    {
        ListIterator it = list.listIterator(list.size());
        while (it.hasPrevious())
            list.addLast(it.previous());
    }*/
}