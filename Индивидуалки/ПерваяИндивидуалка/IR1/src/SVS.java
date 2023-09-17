class SVS extends Rabotnik
{
    private int kol_den;
    private int op_den;

    SVS(String name0, String name1, String name2, int kol_den, int op_den)
    {
        super(name0, name1, name2);
        this.kol_den = kol_den;
        this.op_den = op_den;
    }

    public int getKol_den() {
        return kol_den;
    }
    public int getOp_den() {
        return op_den;
    }

    public void setKol_den(int kol_den) {
        this.kol_den = kol_den;
    }
    public void setOp_den(int op_den) {
        this.op_den = op_den;
    }

    int op1(int kol_den, int op_den)
    {
        return kol_den * op_den;
    }

    public String toString()
    {
        return "Форма работы: Служащий в штате"+super.toString()+"\nКол-во дней: "+kol_den+"\nОплата за день: "+op_den+"\nИтоговая выплата: "+op1(kol_den, op_den);
    }
}