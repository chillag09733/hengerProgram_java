package hengerprogram;

public class TomorHenger extends Henger {

    private double fajsuly;

    public TomorHenger(double sugar, double magassag, double f) {
        //meghívjuk a henger osztály konstruktorát, nem kell újra implementálni a szülőosztályban megírt kódot
        //átadjuk a sugar és magassag paramétereket, hogy inicializálja a szülőosztályban található értékeket
        super(sugar, magassag);
        this.fajsuly = f;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly() {
        return terfogat() * fajsuly;
    }

    @Override
    public String toString() {
        return super.toString() + ", fajsulya: " + fajsuly;
    }
}
