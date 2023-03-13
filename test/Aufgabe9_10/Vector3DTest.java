package Aufgabe9_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Vector3DTest {

    @Test
    void testVector3DOperations() {
        Vector3D v1 = new Vector3D(1, 2, 3);
        Vector3D v2 = new Vector3D(4, 5, 6);
        Vector3D expected = new Vector3D(5, 7, 9);
        Vector3D actual = v1.add(v2);
        assertEquals(expected, actual);

        assertEquals(new Vector3D( 5, 7, 9), v1.add(v2));
        assertEquals(new Vector3D(-3, -3, -3), v1.subtract(v2));
        assertEquals(new Vector3D(2, 4, 6), v1.multiply(2));
        assertEquals(new Vector3D(0.5, 1, 1.5), v1.divide(2));
        assertEquals(32, v1.dotProduct(v2));
        assertEquals(new Vector3D(-3, 6, -3), v1.crossProduct(v2));
    }
}