package Aufgabe14;

public class ArrayWrapper {
    private int[] array;
    private int elementCount;

    public ArrayWrapper(int size) {
        array = new int[size];
        elementCount = 0;
}

public void add(int element) {
        if (elementCount == array.length) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[elementCount++] = element;
}
public int get(int index) {
        return array[index];
}
public int getArraySize() {
        return array.length;
}
public int getElementCount() {
        return elementCount;
}
}
