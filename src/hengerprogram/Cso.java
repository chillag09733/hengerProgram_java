
package hengerprogram;


public class Cso extends TomorHenger {
    private double falvastagsag;
    
    public Cso(double sugar, double magassag, double fajsuly, double fv){
        super(sugar, magassag, fajsuly);
        this.falvastagsag = fv;
    }
    
    public double getFalvastagsag() {
        return falvastagsag;
    }

    public double terfogat() {
        return Math.PI * getSugar() * getSugar() * getMagassag();
    }

    @Override
    public String toString() {
        return super.toString() + ", falvastagsága: " + falvastagsag;
    }
}
