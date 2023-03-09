package Aufgabe5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KgvBerechnerTest {

    @Test
    public void testKgvBerechner() {
        // Arrange
        double zahl1 = 15;
        double zahl2 = 25;
        double expectedKgv = 75;

        // Act
        double resultKgv = KgvBerechner.berechneKgv(zahl1, zahl2);

        // Assert
        assertEquals(expectedKgv, resultKgv, 0.0);

        // Arrange
        zahl1 = 18;
        zahl2 = 24;
        expectedKgv = 72;

        // Act
        resultKgv = KgvBerechner.berechneKgv(zahl1, zahl2);

        // Assert
        assertEquals(expectedKgv, resultKgv, 0.0);
    }
}
