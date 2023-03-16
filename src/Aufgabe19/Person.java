package Aufgabe19;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int height;

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Getter-Methoden

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    // compareTo, AgeComparator und HeightComparator

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    public static class AgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    }

    public static class HeightComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.getHeight(), p2.getHeight());
        }
    }
}
