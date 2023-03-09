package Aufgabe6;

import java.util.Scanner;
import java.util.Random;
public class Ratespiel {

    public static void main(String[] args) {
        System.out.println("----RATESPIEL---");
        // warte 3 Sekunden
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Versuch dein glück: ");

        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        while (true) {
            int tipp = sc.nextInt();
            if (tipp < randomNum) {
                System.out.println("Zu tief!");
                continue;
            }
            if (tipp > randomNum) {
                System.out.println("Zu hoch!");
            }

            if (tipp == randomNum) {
                System.out.println("Gratulation Richtig!");
                break;
            }
        }
    }
}