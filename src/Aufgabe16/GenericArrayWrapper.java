package Aufgabe16;

public class GenericArrayWrapper<T> {
    private T[] array;

    public GenericArrayWrapper(T[] array) {
        this.array = array;
    }

    public T get(int index) {
        return array[index];
    }

    public void set(int index, T value) {
        array[index] = value;
    }
}

