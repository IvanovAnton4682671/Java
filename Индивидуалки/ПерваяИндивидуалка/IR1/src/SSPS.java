class SSPS extends Rabotnik
{
    private int kol_prod;
    private double procent;

    SSPS(String name0, String name1, String name2, int kol_prod, double procent)
    {
        super(name0, name1, name2);
        this.kol_prod = kol_prod;
        this.procent = procent;
    }

    public int getKol_prod() {
        return kol_prod;
    }
    public double getProcent() {
        return procent;
    }

    public void setKol_prod(int kol_prod) {
        this.kol_prod = kol_prod;
    }
    public void setProcent(double procent) {
        this.procent = procent;
    }

    double op2(int kol_prod, double procent)
    {
        return kol_prod * procent;
    }

    public String toString()
    {
        return "Форма работы: Служащий с процентной ставкой"+super.toString()+"\nКол-во продаж: "+kol_prod+"\nПроцент от продаж: "+procent+"\nИтоговая выплата: "+op2(kol_prod, procent);
    }
}