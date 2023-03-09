package Aufgabe3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Aufgabe3Test {

    @Test
    public void shouldBeDivisibleByTwo(){
        int two = 2;
        int zero = 0;

        assertTrue(Aufgabe3.isDivisibleByTwo(two));
        assertTrue(Aufgabe3.isDivisibleByTwo(zero));
    }
    @Test
    public void shouldNotBeDivisibleByTwo(){
        int t = 13;
        int s = 7;

        assertFalse(Aufgabe3.isDivisibleByTwo(t));
        assertFalse(Aufgabe3.isDivisibleByTwo(s));
    }

}