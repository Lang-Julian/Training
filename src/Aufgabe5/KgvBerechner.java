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


        double max = Math.max(zahl1, zahl2);

        while (true) {
            if (max % zahl1 == 0 && max % zahl2 == 0) {
                kgv = max;
                break;
            }
            max++;
        }

        System.out.println("Das kleinste gemeinsame Vielfache von " + zahl1 + " und " + zahl2 + " ist: " + kgv);

    }
}
