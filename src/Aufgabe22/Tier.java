package Aufgabe22;

public class Tier {
    // Attribute
    String Name;
    int Alter;
    int Gewicht;
    int AnzahlBeine;

    // Konstruktor
    public Tier(String Name, int Alter, int Gewicht, int AnzahlBeine) {
        this.Name = Name;
        this.Alter = Alter;
        this.Gewicht = Gewicht;
        this.AnzahlBeine = AnzahlBeine;
    }

    // Getter
    public String getName() {
        return Name;
    }

    public int getAlter() {
        return Alter;
    }

    public int getGewicht() {
        return Gewicht;
    }

    public int getAnzahlBeine() {
        return AnzahlBeine;
    }
    @Override
    public String toString() {
        return  Name + ": (" +
                "Alter=" + Alter +
                ", Gewicht=" + Gewicht +
                ", AnzahlBeine=" + AnzahlBeine
                + ')';
    }

}
