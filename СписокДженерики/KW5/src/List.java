public class List <Item>
{
    private int kol;
    private ListItem<Item> first;
    private ListItem<Item> last;

    List()
    {
        kol = 0;
        first = null;
        last = null;
    }

    List(Item data)
    {
        first = last = new ListItem<Item>(data);
        kol = 1;
    }

    public void add(Item data)
    {
        ListItem<Item> li = new ListItem<Item>(data);
        li.setNext(null);
        if (kol > 0)
        {
            li.setPrev(last);
            last.setNext(li);
        }
        else first = li;
        last = li;
        kol++;
    }

    public ListItem<Item> getFirst(){return first;}
    public ListItem<Item> getLast(){return last;}
    public int getQuan(){return kol;}

    public ListItem<Item> get(int i)
    {
        if (i > kol)
        {
            return null;
        }
        else
        {
            ListItem<Item> li = first;
            for (int j = 1; j < i; j++)
            {
                li = li.getNext();
            }
            return li;
        }
    }

    void print()
    {
        ListItem<Item> li = first;
        while (li != null)
        {
            System.out.print(li.getData()+" ");
            li = li.getNext();
        }
        System.out.println();
    }

    public void remove(int i)
    {
        if (i <= kol)
        {
            ListItem<Item> li = get(i);
            ListItem<Item> prev = li.getPrev();
            ListItem<Item> next = li.getNext();
            if (prev != null)
            {
                prev.setNext(next);
            }
            if (next != null)
            {
                next.setPrev(prev);
                if (i == 1)
                {
                    first = next;
                }
            }
            kol--;
        }
    }
}