package hengerprogram;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {

    private List<Henger> hengerek;

    public HengerProgram() {
        hengerek = new ArrayList<>();
    }
    
    public double atlagTerfogat(){
        double osszTerfogat = 0;
        for (Henger h : hengerek) {
            osszTerfogat += h.terfogat();
        }
        return osszTerfogat / hengerek.size();
    }
    
    public double csovekSulya(){
        double osszSuly = 0;
        for (Henger h : hengerek) {
            //ha cső típusú henger, akkor számolunk vele
            if (h instanceof Cso) {
                osszSuly += ((Cso) h).suly();
            }
        }
        return osszSuly;
    }
    
    public void run(){
        hengerek.add(new Henger(5, 10));
        hengerek.add(new TomorHenger(5, 10, 2.5));
        hengerek.add(new Cso(5, 10, 2.5, 0.5));

        System.out.println("A hengerek átlag térfogata: " + atlagTerfogat());
        System.out.println("A csövek összsúlya: " + csovekSulya());
    }

    public static void main(String[] args) {
        HengerProgram program = new HengerProgram();
        program.run();
    }

}
