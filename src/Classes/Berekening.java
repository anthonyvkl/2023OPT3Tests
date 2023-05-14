package Classes;

public class Berekening {

    public boolean permissieOpstijgen(boolean toestemming, int gewicht, int tegenwind) {
        if (toestemming && (gewicht <= 1000 || tegenwind > 50)) {
            return true;
        }
        return false;

    }

    public double prijsLanden(double gewicht) {
        double prijs;
        if (gewicht < 1000) {
            prijs = 100;
        } else if (gewicht < 5000) {
            prijs = 500;
        } else {
            prijs = 2500;
        }
        return prijs;
    }

    public double prijsInclusiefFactoren(double gewichtInKg, int aantalPassagiers, boolean bagage, boolean nederlands){
        double totalePrijs = prijsLanden(gewichtInKg);
        double prijsBTW = 1.21;

        if (aantalPassagiers > 2) {
            totalePrijs *= 1.5;
        }

        if(bagage) {
            totalePrijs += 800;
        }

        if(nederlands) {
            totalePrijs *= prijsBTW;
        }

        return totalePrijs;

    }
}

