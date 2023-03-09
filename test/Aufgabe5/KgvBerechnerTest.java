package Aufgabe5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KgvBerechnerTest {

    @Test
    public void testKgvBerechner() {
        // Arrange
        int zahl1 = 15;
        int zahl2 = 25;
        int expectedKgv = 75;

        // Act
        int resultKgv = KgvBerechner.berechneKgv(zahl1, zahl2);

        // Assert
        assertEquals(expectedKgv, resultKgv);

        // Arrange
        zahl1 = 18;
        zahl2 = 24;
        expectedKgv = 72;

        // Act
        resultKgv = KgvBerechner.berechneKgv(zahl1, zahl2);

        // Assert
        assertEquals(expectedKgv, resultKgv);
    }
}
