package Aufgabe11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RechteckTest {
    @Test
    public void testBerechneFlaecheninhalt() {
        Rechteck rechteck = new Rechteck(3, 4);
        assertEquals(12, rechteck.berechneFlaecheninhalt(), 0);
    }

    @Test
    public void testBerechneUmfang() {
        Rechteck rechteck = new Rechteck(3, 4);
        assertEquals(14, rechteck.berechneUmfang(), 0);
    }
}