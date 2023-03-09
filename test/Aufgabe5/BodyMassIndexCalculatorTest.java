package Aufgabe5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassIndexCalculatorTest {

    @Test
    public void testClassify() {
        double bmi1 = 16.5; // Underweight
        double bmi2 = 20;   // Normal
        double bmi3 = 27;   // Overweight
        double bmi4 = 35;   // Obese

        assertEquals(BodyMassIndexCalculator.BmiCategory.UNDERWEIGHT, BodyMassIndexCalculator.classify(bmi1));
        assertEquals(BodyMassIndexCalculator.BmiCategory.NORMAL, BodyMassIndexCalculator.classify(bmi2));
        assertEquals(BodyMassIndexCalculator.BmiCategory.OVERWEIGHT, BodyMassIndexCalculator.classify(bmi3));
        assertEquals(BodyMassIndexCalculator.BmiCategory.OBESE, BodyMassIndexCalculator.classify(bmi4));
    }
}