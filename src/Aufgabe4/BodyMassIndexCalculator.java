package Aufgabe4;

import java.util.Scanner;

public class BodyMassIndexCalculator {

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static BmiCategory classify(double bmi) {
        if (bmi < 18.5) {
            return BmiCategory.UNDERWEIGHT;
        } else if (bmi < 25) {
            return BmiCategory.NORMAL;
        } else if (bmi < 30) {
            return BmiCategory.OVERWEIGHT;
        } else {
            return BmiCategory.OBESE;
        }

    }

    public enum BmiCategory {
        UNDERWEIGHT,
        NORMAL,
        OVERWEIGHT,
        OBESE;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.print("Input height in centimeters: ");
        double height = sc.nextDouble() / 100;
        double bmi = calculateBMI(weight, height);
        BmiCategory bmiCategory = classify(bmi);
        System.out.println("The Body Mass Index is " + bmi + ", which is considered " + bmiCategory + ".");
    }
}
