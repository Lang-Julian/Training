package Aufgabe9_10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Definition of a JUnit test class for the Punkt class
class PunktTest {

    // Test method for the addiere method of the Punkt class
    @Test
    public void testAddiere() {
        Punkt p1 = new Punkt(1, 2);
        Punkt p2 = new Punkt(3, 4);
        p1.addiere(p2);
        assertEquals("(4.0, 6.0)", p1.toString());
    }

    // Test method for the subtrahiere method of the Punkt class
    @Test
    public void testSubtrahiere() {
        Punkt p1 = new Punkt(5, 6);
        Punkt p2 = new Punkt(3, 4);
        p1.subtrahiere(p2);
        assertEquals("(2.0, 2.0)", p1.toString());
    }

    // Test method for the multipliziere method of the Punkt class
    @Test
    public void testMultipliziere() {
        Punkt p1 = new Punkt(2, 3);
        p1.multipliziere(4);
        assertEquals("(8.0, 12.0)", p1.toString());
    }

    // Test method for the dividiere method of the Punkt class
    @Test
    public void testDividiere() {
        Punkt p1 = new Punkt(10, 12);
        p1.dividiere(2);
        assertEquals("(5.0, 6.0)", p1.toString());
    }

    // Test method to check that the addiere method does not change the second point object
    @Test
    public void testObjektAenderung() {
        Punkt p1 = new Punkt(1, 2);
        Punkt p2 = new Punkt(3, 4);
        p1.addiere(p2);
        assertEquals("(4.0, 6.0)", p1.toString());
        assertEquals("(3.0, 4.0)", p2.toString());
    }
}
