public class Rabotnik
{
    private String name0;
    private String name1;
    private String name2;

    Rabotnik(String name0, String name1, String name2)
    {
        this.name0 = name0;
        this.name1 = name1;
        this.name2 = name2;
    }

    public String getName0() {
        return name0;
    }
    public String getName1() {
        return name1;
    }
    public String getName2() {
        return name2;
    }

    public void setName0(String name0) {
        this.name0 = name0;
    }
    public void setName1(String name1) {
        this.name1 = name1;
    }
    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String toString()
    {
        return "\nФамилия: "+name0+"\nИмя: "+name1+"\nОтчество: "+name2;
    }
}