import java.util.ArrayList;

public class Tasks
{
    ArrayList <Task> a;

    Tasks()
    {
        a = new ArrayList<Task>();
    }

    void add(Task t)
    {
        a.add(t);
    }

    void del(String question)
    {
        int p = -1;
        for (int i = 0; i < a.size(); i++)
            if (question.equalsIgnoreCase(a.get(i).getQuestion()))
                p = i;
        if (p > -1)
        {
            a.remove(p);
            System.out.println("Удалили билет с вопросом " + question);
        }
        else System.out.println("Такого билета нет");
    }

    void search(String question)
    {
        int p = -1;
        for (int i = 0; i < a.size(); i++)
            if (question.equalsIgnoreCase(a.get(i).getQuestion()))
                p = i;
        if (p > -1)
            a.get(p).print();
        else System.out.println("Такого билета нет");
    }

    void print()
    {
        for (int i = 0; i < a.size(); i++)
            a.get(i).print();
    }
}