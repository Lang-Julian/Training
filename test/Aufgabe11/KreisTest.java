package Aufgabe11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KreisTest {
    @Test
    public void testBerechneFlaecheninhalt() {
        Kreis kreis = new Kreis(5);
        assertEquals(78.5398, kreis.berechneFlaecheninhalt(), 0.0001);
    }

    @Test
    public void testBerechneUmfang() {
        Kreis kreis = new Kreis(5);
        assertEquals(31.4159, kreis.berechneUmfang(), 0.0001);
    }
}
