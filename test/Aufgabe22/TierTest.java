package Aufgabe22;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TierTest {

    private List<Tier> erstelleTierListe() {
        List<Tier> tierList = new ArrayList<>();
        tierList.add(new Tier("Kuh", 20, 60, 4));
        tierList.add(new Tier("Katze", 7, 10, 4));
        tierList.add(new Tier("Kangaroo", 6, 33, 2));
        tierList.add(new Tier("Hund", 17, 25, 4));
        return tierList;
    }

    @Test
    void testAlleFilter() {
        List<Tier> tierList = erstelleTierListe();

        // Test für Tiere mit zwei Beinen
        List<Tier> ergebnis1 = tierList.stream()
                .filter(tier -> tier.getAnzahlBeine() == 2)
                .toList();
        assertEquals(1, ergebnis1.size());

        // Test für Tiere über 10
        List<Tier> ergebnis2 = tierList.stream()
                .filter(tier -> tier.getAlter() > 10)
                .toList();
        assertEquals(2, ergebnis2.size());

        // Test für Tiere zwischen 5 und 8
        List<Tier> ergebnis3 = tierList.stream()
                .filter(tier -> tier.getAlter() >= 5 && tier.getAlter() <= 8)
                .toList();
        assertEquals(2, ergebnis3.size());

        // Test für Tiere deren Gewicht über 30 und Alter kleiner 20
        List<Tier> ergebnis4 = tierList.stream()
                .filter(tier -> tier.getGewicht() > 30 && tier.getAlter() < 20)
                .toList();
        assertEquals(1, ergebnis4.size());

        // Test für Tiere mit 4 Beinen und einem ungeraden Alter
        List<Tier> ergebnis5 = tierList.stream()
                .filter(tier -> tier.getAnzahlBeine() == 4 && tier.getAlter() % 2 == 1)
                .toList();
        assertEquals(2, ergebnis5.size());
    }
}
