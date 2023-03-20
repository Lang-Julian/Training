package Aufgabe22;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Liste Tier erstellen
        List<Tier> tierList = new ArrayList<>();

        // Tiere zur Liste hinzufügen
        tierList.add(new Tier("Kuh", 20, 60, 4));
        tierList.add(new Tier("Katze", 7, 10, 4));
        tierList.add(new Tier("Kangaroo", 6, 33, 2));
        tierList.add(new Tier("Hund", 17, 25, 4));

   /*     // Liste ausgeben
        System.out.println("Alle Tiere mit zwei Beinen:");
        for (Tier tier : tierList) {
            if (tier.getAnzahlBeine() == 2) {
                System.out.println(tier);
            }
        }

        System.out.println("Alle Tiere über 10:");
        for (Tier tier : tierList) {
            if (tier.getAlter() > 10) {
                System.out.println(tier);
            }
        }

        System.out.println("Alle Tiere zwischen 5 und 8:");
        for (Tier tier : tierList) {
            if (tier.getAlter() >= 2 && tier.getAlter() <= 8) {
                System.out.println(tier);
            }
        }

        System.out.println("Alle Tiere deren Gewicht über 30 und Alter kleiner 20:");
        for (Tier tier : tierList) {
            if (tier.getGewicht() > 30 && tier.getAlter() < 20) {
                System.out.println(tier);
            }
        }

        System.out.println("Alle Tiere mit 4 Beinen und einem ungeraden Alter:");
        for (Tier tier : tierList) {
            if (tier.getAnzahlBeine() == 4 && tier.getAlter() % 2 == 1) {
                System.out.println(tier);
            }
        } */
        System.out.println("Alle Tiere mit zwei Beinen:");
        tierList.stream()
                .filter(tier -> tier.getAnzahlBeine() == 2)
                .forEach(System.out::println);

        System.out.println("Alle Tiere über 10:");
        tierList.stream()
                .filter(tier -> tier.getAlter() > 10)
                .forEach(System.out::println);

        System.out.println("Alle Tiere zwischen 5 und 8:");
        tierList.stream()
                .filter(tier -> tier.getAlter() >= 2 && tier.getAlter() <= 8)
                .forEach(System.out::println);

        System.out.println("Alle Tiere deren Gewicht über 30 und Alter kleiner 20:");
        tierList.stream()
                .filter(tier -> tier.getGewicht() > 30 && tier.getAlter() < 20)
                .forEach(System.out::println);

        System.out.println("Alle Tiere mit 4 Beinen und einem ungeraden Alter:");
        tierList.stream()
                .filter(tier -> tier.getAnzahlBeine() == 4 && tier.getAlter() % 2 == 1)
                .forEach(System.out::println);
    }
}
