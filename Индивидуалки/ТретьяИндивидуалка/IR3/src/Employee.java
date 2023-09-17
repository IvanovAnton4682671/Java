import java.util.Comparator;

public class Employee
{
    public String last_name, first_name, patronymic, post;
    public int salary;



    Employee(String last_name, String first_name, String patronymic, String post, int salary)
    {
        this.last_name = last_name;
        this.first_name = first_name;
        this.patronymic = patronymic;
        this.post = post;
        this.salary = salary;
    }



    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }



    public static Comparator<Employee> Last_nameComparator = new Comparator<Employee>()
    {
        public int compare(Employee emp1, Employee emp2)
        {
            return emp1.getLast_name().compareTo(emp2.getLast_name());
        }
    };

    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>()
    {
        public int compare(Employee emp1, Employee emp2)
        {
            return emp1.getSalary()-emp2.getSalary();
        }
    };

    public String print()
    {
        return "--------------------------------------------------\n"+"Фамилия: "+this.last_name+"\nИмя: "+this.first_name+"\nОтчество: "+this.patronymic+"\nДолжность: "+this.post+"\nЗарплата: "+this.salary+"р\n"+"--------------------------------------------------\n";
    }
}