package Aufgabe11;

public class Dreieck extends GeometrischesObjekt {
    private double seite1;
    private double seite2;
    private double seite3;
    private double grundseite;
    private double hoehe;

    public Dreieck(double seite1, double seite2, double seite3) {
        this.seite1 = seite1;
        this.seite2 = seite2;
        this.seite3 = seite3;

        // Berechnung der Grundseite und Höhe des Dreiecks
        if (seite1 >= seite2 && seite1 >= seite3) {
            grundseite = seite1;
            hoehe = 2 * berechneFlaecheninhalt() / seite1;
        } else if (seite2 >= seite1 && seite2 >= seite3) {
            grundseite = seite2;
            hoehe = 2 * berechneFlaecheninhalt() / seite2;
        } else {
            grundseite = seite3;
            hoehe = 2 * berechneFlaecheninhalt() / seite3;
        }
    }

    public double berechneFlaecheninhalt() {
        // Verwendung der Formel für den Flächeninhalt
        return (grundseite * hoehe) / 2;
    }

    public double berechneUmfang() {
        // Verwendung der Formel für den Umfang
        return seite1 + seite2 + seite3;
    }
}



