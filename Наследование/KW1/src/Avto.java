public class Avto
{
    private String marka;
    private String number;
    private String vin;
    private double vol;
    private int year;
    private int price;
    private int km;

    Avto(String marka, String number, String vin, double vol, int year, int price, int km)
    {
        this.marka = marka;
        this.number = number;
        this.vin = vin;
        this.vol = vol;
        this.year = year;
        this.price = price;
        this.km = km;
    }

    public String toString()
    {
        return "Марка: "+marka+"\n Номер: "+number+"\n ВИН: "+vin+"\n Объём двигателя: "+vol+"\n Год: "+year+"\n Цена: "+price+"\n Пробег: "+km;
    }

    public String getMarka() {
        return marka;
    }
    public String getNumber() {
        return number;
    }
    public String getVin() {
        return vin;
    }
    public double getVol() {
        return vol;
    }
    public int getYear() {
        return year;
    }
    public int getPrice() {
        return price;
    }
    public int getKm() {
        return km;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setVin(String vin) {
        this.vin = vin;
    }
    public void setVol(double vol) {
        this.vol = vol;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setKm(int km) {
        this.km = km;
    }
}