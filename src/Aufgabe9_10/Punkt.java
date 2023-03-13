package Aufgabe9_10;

// Definition of a class named Punkt, which means "Point" in English
public class Punkt {

    // Private instance variables to store the x and y coordinates of the point
    private double x;
    private double y;

    // Constructor that takes two double parameters and initializes the x and y coordinates of the point
    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter method for the x coordinate
    public double getX() {
        return x;
    }

    // Getter method for the y coordinate
    public double getY() {
        return y;
    }

    // Setter method for the x coordinate
    public void setX(double x) {
        this.x = x;
    }

    // Setter method for the y coordinate
    public void setY(double y) {
        this.y = y;
    }

    // Method to add another point to this point
    public void addiere(Punkt other) {
        this.x += other.x;
        this.y += other.y;
    }

    // Method to subtract another point from this point
    public void subtrahiere(Punkt other) {
        this.x -= other.x;
        this.y -= other.y;
    }

    // Method to multiply the coordinates of this point by a scalar value
    public void multipliziere(double faktor) {
        this.x *= faktor;
        this.y *= faktor;
    }

    // Method to divide the coordinates of this point by a scalar value
    public void dividiere(double divisor) {
        this.x /= divisor;
        this.y /= divisor;
    }

    // Overridden toString method that returns a string representation of the point
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
