package Kassenbon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kassenbon {
    private static final Map<String, Double> produkte = new HashMap<>();

    static {
        produkte.put("Wurst", 4.20);
        produkte.put("Käse", 2.30);
        produkte.put("Brot", 2.10);
        produkte.put("DVD", 12.00);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double summe = 0;

        System.out.println("Unsere Produkte:");
        for (Map.Entry<String, Double> produkt : produkte.entrySet()) {
            System.out.println(produkt.getKey() + " - " + produkt.getValue() + " EUR");
        }

        Map<String, Integer> einkaufswagen = new HashMap<>();
        while (true) {
            System.out.print("Welches Produkt möchten Sie kaufen? (-Zahlen- um Einkauf abzuschließen) ");
            String produktName = scanner.nextLine();
            if (produktName.equals("Zahlen")) {
                break;
            }

            if (!produkte.containsKey(produktName)) {
                System.out.println("Dieses Produkt ist nicht verfügbar.");
                continue;
            }

            System.out.print("Wie viele möchten Sie kaufen? ");
            int menge = scanner.nextInt();
            scanner.nextLine();

            int alteMenge = einkaufswagen.getOrDefault(produktName, 0);
            einkaufswagen.put(produktName, alteMenge + menge);
            summe += menge * produkte.get(produktName);
        }
//zahlen
        double rueckgabe;
        double gegeben;
        while (true) {
            System.out.printf("Das macht dann bitte: %32.2f EUR\n", summe);
            gegeben = scanner.nextDouble();
            if (gegeben >= summe) {
                rueckgabe = gegeben - summe;
                System.out.printf("Dankeschön, hier ist Ihr Rückgeld: %32.2f EUR\n", rueckgabe);
                break;
            } else {
                System.out.println("Das gegebene Geld ist nicht ausreichend.");
            }
        }

// warte 2 Sekunden
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//Kassenbon drucken
        System.out.println("\nKassenbon:");
        for (Map.Entry<String, Integer> produkt : einkaufswagen.entrySet()) {
            System.out.printf("%-10s %d x %6.2f EUR\n", produkt.getKey(), produkt.getValue(), produkte.get(produkt.getKey()));
            System.out.printf("%31.2f EUR\n", produkt.getValue() * produkte.get(produkt.getKey()));
        }
        System.out.println("----------------------------------");
        System.out.printf("%-20s %10.2f EUR\n", "Gesamt", summe);

        System.out.println("----------------------------------");

        System.out.printf("Gegeben: %32.2f EUR\n", gegeben);
        System.out.printf("Zurück: %32.2f EUR\n", rueckgabe);
    }
}
