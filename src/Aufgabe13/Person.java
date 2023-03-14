package Aufgabe13;

public class Person {
    private int alter; // Attribut für das Alter
    private String vorname; // Attribut für den Vornamen
    private String nachname; // Attribut für den Nachnamen
    private int groesse; // Attribut für die Größe
    private int gewicht; // Attribut für das Gewicht

    public Person(int alter, String vorname, String nachname, int groesse, int gewicht) {
        this.alter = alter; // Initialisierung des Attributs Alter
        this.vorname = vorname; // Initialisierung des Attributs Vorname
        this.nachname = nachname; // Initialisierung des Attributs Nachname
        this.groesse = groesse; // Initialisierung des Attributs Größe
        this.gewicht = gewicht; // Initialisierung des Attributs Gewicht
    }

    public int getAlter() {
        return alter; // Getter-Methode für das Attribut Alter
    }

    public String getVorname() {
        return vorname; // Getter-Methode für das Attribut Vorname
    }

    public String getNachname() {
        return nachname; // Getter-Methode für das Attribut Nachname
    }

    public int getGroesse() {
        return groesse; // Getter-Methode für das Attribut Größe
    }

    public int getGewicht() {
        return gewicht; // Getter-Methode für das Attribut Gewicht
    }

    // Überladene equals-Methode, die prüft, ob zwei Personenobjekte gleich sind
    public boolean equals(Object obj) {
        if (obj == this) { // Prüfen, ob das übergebene Objekt dieselbe Referenz hat wie das aktuelle Objekt
            return true; // Wenn ja, sind sie gleich
        }
        if (!(obj instanceof Person)) { // Prüfen, ob das übergebene Objekt vom Typ Person ist
            return false; // Wenn nein, sind sie nicht gleich
        }
        Person other = (Person) obj; // Casten des übergebenen Objekts zu einem Person-Objekt
        // Prüfen, ob alle Attribute des aktuellen Objekts und des übergebenen Objekts übereinstimmen
        return this.alter == other.alter &&
                this.vorname.equals(other.vorname) &&
                this.nachname.equals(other.nachname) &&
                this.groesse == other.groesse &&
                this.gewicht == other.gewicht;
    }
}
