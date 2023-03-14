package Aufgabe11;

//Flächeninhalt = Länge * Breite
//oder
//A = l * b
public class Rechteck extends GeometrischesObjekt {

    private double laenge;
    private double breite;

    public Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    @Override
    public double berechneFlaecheninhalt() {
        return laenge * breite;
    }

    @Override
    public double berechneUmfang() {
        return 2 * (laenge + breite);
    }
}

