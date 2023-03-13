package Aufgabe8;

public class Punkt {
    private double x;
    private double y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void addiere(Punkt other) {
        this.x += other.x;
        this.y += other.y;
    }

    public void subtrahiere(Punkt other) {
        this.x -= other.x;
        this.y -= other.y;
    }

    public void multipliziere(double faktor) {
        this.x *= faktor;
        this.y *= faktor;
    }

    public void dividiere(double divisor) {
        this.x /= divisor;
        this.y /= divisor;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
