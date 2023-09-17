import java.util.ArrayList;

public class Company
{
    ArrayList<Employee> ale;



    Company()
    {
        ale = new ArrayList<Employee>();
    }



    public void add(Employee emp)
    {
        ale.add(emp);
    }

    public void del(String last_name)
    {
        int ind = -1;
        for (int i = 0; i < ale.size(); i++)
            if (last_name.equalsIgnoreCase(ale.get(i).getLast_name()))
                ind = i;
        if (ind > -1)
        {
            ale.remove(ind);
            System.out.println("--------------------------------------------------");
            System.out.println("Вы удалили сотрудника по фамилии "+last_name);
            System.out.println("--------------------------------------------------");
        }
        else
        {
            System.out.println("--------------------------------------------------");
            System.out.println("Сотрудника по фамилии "+last_name+" нет");
            System.out.println("--------------------------------------------------");
        }
    }

    public void search(String last_name)
    {
        int ind = -1;
        for (int i = 0; i < ale.size(); i++)
            if (last_name.equalsIgnoreCase(ale.get(i).getLast_name()))
                ind = i;
        if (ind > -1)
            ale.get(ind).print();
        else
        {
            System.out.println("--------------------------------------------------");
            System.out.println("Сотрудника по фамилии "+last_name+" нет");
            System.out.println("--------------------------------------------------");
        }
    }

    public void sortByLast_name()
    {
        ale.sort(Employee.Last_nameComparator);
    }

    public void sortBySalary()
    {
        ale.sort(Employee.SalaryComparator);
    }

    public void print()
    {
        for (int i = 0; i < ale.size(); i++)
            ale.get(i).print();
    }
}