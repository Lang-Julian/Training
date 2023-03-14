package Aufgabe13;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    // Hier testen wir die equals() Methode der Person-Klasse.

    @Test
    public void testEquals() {

        // Wir erstellen drei Personen-Objekte mit unterschiedlichen Attributen.

        Person p1 = new Person(25, "Max", "Mustermann", 180, 75);
        Person p2 = new Person(25, "Max", "Mustermann", 180, 75);
        Person p3 = new Person(30, "Anna", "Musterfrau", 170, 60);

        // Hier testen wir einen positiven Fall, in dem p1 und p2 denselben Attribut-Wert haben.

        assertEquals(true, p1.equals(p2));

        // Hier testen wir einen negativen Fall, in dem p1 und p3 unterschiedliche Attribut-Werte haben.

        assertEquals(false, p1.equals(p3));
    }
}
