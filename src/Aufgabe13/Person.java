package Aufgabe13;

public class Person {
    private int alter;
    private String vorname;
    private String nachname;
    private int groesse;
    private int gewicht;

    public Person(int alter, String vorname, String nachname, int groesse, int gewicht) {
        this.alter = alter;
        this.vorname = vorname;
        this.nachname = nachname;
        this.groesse = groesse;
        this.gewicht = gewicht;
    }

    public int getAlter() {
        return alter;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getGroesse() {
        return groesse;
    }

    public int getGewicht() {
        return gewicht;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person other = (Person) obj;
        return this.alter == other.alter &&
                this.vorname.equals(other.vorname) &&
                this.nachname.equals(other.nachname) &&
                this.groesse == other.groesse &&
                this.gewicht == other.gewicht;
    }
}
