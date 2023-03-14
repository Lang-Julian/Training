package Aufgabe11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DreieckTest {
    @Test
    public void testBerechneFlaecheninhalt() {
        Dreieck dreieck = new Dreieck(3, 4, 5);
        assertEquals(6, dreieck.berechneFlaecheninhalt(), 0);
    }

    @Test
    public void testBerechneUmfang() {
        Dreieck dreieck = new Dreieck(3, 4, 5);
        assertEquals(12, dreieck.berechneUmfang(), 0);
    }
}