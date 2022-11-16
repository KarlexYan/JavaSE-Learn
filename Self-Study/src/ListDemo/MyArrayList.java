package ListDemo;

import java.util.Arrays;

public class MyArrayList<E> {
    Object[] objects = new Object[10];
    int size;


    public boolean add(E e) {
        objects[size] = e;
        size++;
        return true;
    }

    public E get(int index) {
        return (E) objects[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(objects);
    }
}
