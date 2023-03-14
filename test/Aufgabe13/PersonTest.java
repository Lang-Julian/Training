package Aufgabe13;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void testEquals() {
        Person p1 = new Person(25, "Max", "Mustermann", 180, 75);
        Person p2 = new Person(25, "Max", "Mustermann", 180, 75);
        Person p3 = new Person(30, "Anna", "Musterfrau", 170, 60);

        // Positiver Testfall
        assertEquals(true, p1.equals(p2));

        // Negativer Testfall
        assertEquals(false, p1.equals(p3));
    }
}
