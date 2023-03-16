package Aufgabe20;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPerson {
    @Test
    public void testCompareTo() {
        Person person1 = new Person("Alice", 25, 1.75);
        Person person2 = new Person("Bob", 30, 1.80);
        assertEquals(-1, person1.compareTo(person2));
        assertEquals(1, person2.compareTo(person1));
        assertEquals(0, person1.compareTo(person1));
    }

    @Test
    public void testAgeComparator() {
        AgeComparator ageComparator = new AgeComparator();
        Person person1 = new Person("Alice", 25, 1.75);
        Person person2 = new Person("Bob", 30, 1.80);
        assertEquals(-1, ageComparator.compare(person1, person2));
        assertEquals(1, ageComparator.compare(person2, person1));
        assertEquals(0, ageComparator.compare(person1, person1));
    }

    @Test
    public void testHeightComparator() {
        HeightComparator heightComparator = new HeightComparator();
        Person person1 = new Person("Alice", 25, 1.75);
        Person person2 = new Person("Bob", 30, 1.80);
        assertEquals(-1, heightComparator.compare(person1, person2));
        assertEquals(1, heightComparator.compare(person2, person1));
        assertEquals(0, heightComparator.compare(person1, person1));
    }

    @Test
    public void testEqualsAndHashCode() {
        Person person1 = new Person("Alice", 25, 1.75);
        Person person2 = new Person("Alice", 25, 1.75);
        Person person3 = new Person("Bob", 30, 1.80);

        assertEquals(person1, person2);
        assertEquals(person1.hashCode(), person2.hashCode());
        assertEquals(person1.equals(person3), false);
        assertEquals(person1.hashCode() == person3.hashCode(), false);
    }
}