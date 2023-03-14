package Aufgabe11;
//Flächeninhalt = π * Radius^2
//oder
//A = π * r^2
//Umfang = 2 * π * Radius
//oder
//U = 2 * π * r
//wobei π (Pi) eine mathematische Konstante ist, die ungefähr 3.14159 beträgt und r der Radius des Kreises ist.
public class Kreis implements GeometrischesObjekt {

    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    @Override
    public double berechneFlaecheninhalt() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double berechneUmfang() {
        return 2 * Math.PI * radius;
    }
}
