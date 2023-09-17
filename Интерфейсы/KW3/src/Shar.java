public class Shar implements Body
{
    double r;

    Shar(double r)
    {
        this.r = r;
    }

    public double V()
    {
        return 4/3 * Math.PI * r * r * r;
    }

    public double S()
    {
        return 4 * Math.PI * r * r;
    }

    public void print()
    {
        System.out.println("Шар с радиусом: "+r);
    }
}