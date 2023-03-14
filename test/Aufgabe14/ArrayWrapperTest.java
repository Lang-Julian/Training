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
    }
    @Test
    public void testGet() {
        ArrayWrapper aw = new ArrayWrapper(3);
        aw.add(1);
        aw.add(2);
        aw.add(3);
        aw.add(4);
        assertEquals(2, aw.get(1));
    }
    @Test
    public void testGetElementCount() {
        ArrayWrapper aw = new ArrayWrapper(3);
        aw.add(1);
        aw.add(2);
        assertEquals(2, aw.getElementCount());
    }
}