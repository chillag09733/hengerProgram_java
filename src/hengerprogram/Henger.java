package hengerprogram;

public class Henger {

    private double sugar;
    private double magassag;
    
    public Henger (double r, double m){
        this.sugar = r;
        this.magassag = m;
    }
    
    public double getSugar(){
        return sugar;
    }
    
    public double getMagassag(){
        return magassag;
    }
    
    public double terfogat(){
        return Math.PI * sugar * sugar * magassag;
    }

    @Override
    public String toString() {
        return "A henger sugara: " + sugar + ", magassága: " + magassag;
                }
    
}
