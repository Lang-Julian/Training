package Aufgabe22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TierTest {

    @Test
    public void testTierEigenschaften() {
        Tier tier = new Tier("Kuh", 20, 60, 4);

        assertEquals("Kuh", tier.getName());
        assertEquals(20, tier.getAlter());
        assertEquals(60, tier.getGewicht());
        assertEquals(4, tier.getAnzahlBeine());
    }
}
