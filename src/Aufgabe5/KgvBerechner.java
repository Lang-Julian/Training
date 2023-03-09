package Aufgabe5;

import java.util.Scanner;

public class KgvBerechner {

    public static void main(String[] args) {

        double kgv;

        Scanner sc = new Scanner(System.in);
        System.out.print("Zahl 1: ");
        double zahl1 = sc.nextDouble();
        System.out.print("Zahl 2: ");
        double zahl2 = sc.nextDouble();
        sc.close(); // close the Scanner object

        kgv = berechneKgv(zahl1, zahl2);

        System.out.println("Das kleinste gemeinsame Vielfache von " + zahl1 + " und " + zahl2 + " ist: " + kgv);

    }

    public static double berechneKgv(double zahl1, double zahl2) {
        double kgv;
        double max = Math.max(zahl1, zahl2);
        int iterations = 0;
        while (iterations < 1000000) {
            if (max % zahl1 == 0 && max % zahl2 == 0) {
                kgv = max;
                return kgv;
            }
            max++;
            iterations++;
        }
        return -1; // return -1 if no KGV is found after the maximum number of iterations
    }
}