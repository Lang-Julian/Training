package Aufgabe5;

import java.util.Scanner;

public class KgvBerechner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Zahl 1: ");
        int zahl1 = sc.nextInt();
        System.out.print("Zahl 2: ");
        int zahl2 = sc.nextInt();
        sc.close(); // close the Scanner object

        int kgv = berechneKgv(zahl1, zahl2);

        System.out.println("Das kleinste gemeinsame Vielfache von " + zahl1 + " und " + zahl2 + " ist: " + kgv);

    }

    public static int berechneKgv(int zahl1, int zahl2) {
        int max = Math.max(zahl1, zahl2);
        int iterations = 0;
        while (iterations < 1000000) {
            if (max % zahl1 == 0 && max % zahl2 == 0) {
                return max;
            }
            max++;
            iterations++;
        }
        return -1; // return -1 if no KGV is found after the maximum number of iterations
    }
}