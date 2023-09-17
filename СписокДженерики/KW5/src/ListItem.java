public class ListItem <Item>
{
    private Item data;
    private ListItem<Item> next;
    private ListItem<Item> prev;

    ListItem(Item d)
    {
        data = d;
        next = null;
        prev = null;
    }

    ListItem(Item d, ListItem<Item> p)
    {
        data = d;
        prev = p;
    }

    public Item getData(){return data;}
    public void setData(Item d){data = d;}
    public ListItem<Item> getNext(){return next;}
    public void setNext(ListItem<Item> li){next = li;}
    public ListItem<Item> getPrev(){return prev;}
    public void setPrev(ListItem<Item> li){prev = li;}
}