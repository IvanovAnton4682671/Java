class SSPO extends Rabotnik
{
    private int kol_chas;
    private int op_chas;

    SSPO(String name0, String name1, String name2, int kol_chas, int op_chas)
    {
        super(name0, name1, name2);
        this.kol_chas = kol_chas;
        this.op_chas = op_chas;
    }

    public int getKol_chas() {
        return kol_chas;
    }
    public int getOp_chas() {
        return op_chas;
    }

    public void setKol_chas(int kol_chas) {
        this.kol_chas = kol_chas;
    }
    public void setOp_chas(int op_chas) {
        this.op_chas = op_chas;
    }

    int op0(int kol_chas, int op_chas)
    {
        return kol_chas * op_chas;
    }

    public String toString()
    {
        return "Форма работы: Служащий с почасовой оплатой"+super.toString()+"\nКол-во часов: "+kol_chas+"\nОплата за час: "+op_chas+"\nИтоговая выплата: "+op0(kol_chas, op_chas);
    }
}