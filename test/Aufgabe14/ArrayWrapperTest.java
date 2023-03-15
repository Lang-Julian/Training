package Aufgabe14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWrapperTest {
    @Test
    public void testAdd() {
        ArrayWrapper aw = new ArrayWrapper(3);
        aw.add(1);
        aw.add(2);
        aw.add(3);
        aw.add(4);
        assertEquals(4, aw.getElementCount());
        assertEquals(1, aw.get(0));
        assertEquals(2, aw.get(1));
        assertEquals(3, aw.get(2));
        assertEquals(4, aw.get(3));
    }
    @Test
    public void testGetElementCount() {
        ArrayWrapper aw = new ArrayWrapper(3);
        aw.add(1);
        aw.add(2);
        assertEquals(2, aw.getElementCount());
    }
}