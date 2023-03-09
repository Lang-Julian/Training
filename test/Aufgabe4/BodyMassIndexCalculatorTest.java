package Aufgabe4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BodyMassIndexCalculatorTest {

    @Test
    public void testBmiCategories() {
        double weight = 70.0; // in kg
        double height = 1.75; // in m
        double bmi = BodyMassIndexCalculator.calculateBMI(weight, height);

        // Test for UNDERWEIGHT category
        double underweightBmi = 18.0;
        BodyMassIndexCalculator.BmiCategory underweightCategory = BodyMassIndexCalculator.classify(underweightBmi);
        assertEquals(BodyMassIndexCalculator.BmiCategory.UNDERWEIGHT, underweightCategory);

        // Test for NORMAL category
        double normalBmi = 22.5;
        BodyMassIndexCalculator.BmiCategory normalCategory = BodyMassIndexCalculator.classify(normalBmi);
        assertEquals(BodyMassIndexCalculator.BmiCategory.NORMAL, normalCategory);

        // Test for OVERWEIGHT category
        double overweightBmi = 27.5;
        BodyMassIndexCalculator.BmiCategory overweightCategory = BodyMassIndexCalculator.classify(overweightBmi);
        assertEquals(BodyMassIndexCalculator.BmiCategory.OVERWEIGHT, overweightCategory);

        // Test for OBESE category
        double obeseBmi = 35.0;
        BodyMassIndexCalculator.BmiCategory obeseCategory = BodyMassIndexCalculator.classify(obeseBmi);
        assertEquals(BodyMassIndexCalculator.BmiCategory.OBESE, obeseCategory);

        // Test for calculated BMI value
        BodyMassIndexCalculator.BmiCategory calculatedCategory = BodyMassIndexCalculator.classify(bmi);
        assertEquals(BodyMassIndexCalculator.BmiCategory.NORMAL, calculatedCategory);
    }
}