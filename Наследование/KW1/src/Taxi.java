class Taxi extends Avto
{
    private String driver;
    private int pricekm;

    Taxi(String marka, String number, String vin, double vol, int year, int price, int km, String driver, int pricekm)
    {
        super(marka, number, vin, vol, year, price, km);
        this.driver = driver;
        this.pricekm = pricekm;
    }

    double stoim(double km)
    {
        return km * pricekm;
    }

    public String getDriver() {
        return driver;
    }
    public int getPricekm() {
        return pricekm;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
    public void setPricekm(int pricekm) {
        this.pricekm = pricekm;
    }

    public String toString()
    {
        return super.toString()+"\n Водитель: "+driver+"\n Цена за км: "+pricekm;
    }
}