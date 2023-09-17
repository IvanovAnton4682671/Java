import java.util.Comparator;

class Student
{
    private String fio, adress, fakulty;
    private int kurs;
    private int []marks;

    Student(String fio, String adress, String fakulty, int kurs, int []marks)
    {
        this.fio = fio;
        this.adress = adress;
        this.fakulty = fakulty;
        this.kurs = kurs;
        this.marks = marks;
    }

    String getFio(){return fio;}
    void setFio(String fio){this.fio = fio;}
    String getAdress(){return adress;}
    void setAdress(String adress){this.adress = adress;}
    String getFakulty(){return fakulty;}
    void setFakulty(String fakulty){this.fakulty = fakulty;}
    int getKurs(){return kurs;}
    void setKurs(int kurs){this.kurs = kurs;}
    int[] getMarks(){return marks;}
    void setMarks(int[] marks){this.marks = marks;}

    double sr()
    {
        double s = 0;
        for (int i = 0; i < marks.length; i++)
            s += marks[i];
        return s / marks.length;
    }

    void print()
    {
        String s = " ";
        for (int i = 0; i < marks.length; i++)
        {
            s += marks[i];
            s += " ";
        }
        System.out.println("Студент: "+this.fio+"\nАдресс: "+this.adress+"\nФакульет: "+this.fakulty+"\nКурс: "+this.kurs+"\nОценки: "+s);
    }

    public static Comparator <Student> NameComparator = new Comparator <Student>()
    {
        public int compare(Student s1, Student s2)
        {
            return s1.getFio().compareTo(s2.getFio());
        }
    };

    public static Comparator <Student> KursComparator = new Comparator <Student>()
    {
        public int compare(Student s1, Student s2)
        {
            return s1.getKurs()-s2.getKurs();
        }
    };
}