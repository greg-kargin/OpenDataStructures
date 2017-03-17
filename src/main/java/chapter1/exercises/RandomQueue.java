package chapter1.exercises;

import java.util.Random;

import static java.lang.Math.max;

public class RandomQueue<T> {
    Random random = new Random();

    private T[] array = (T[]) new Object[0];
    private int elems = 0;

    public void add(T x) {
        if (elems + 1 > array.length) resize();
        array[elems] = x;
        elems++;
    }

    public T remove() {
        int i = random.nextInt(elems);
        T x = array[i];
        array[i] = array[elems - 1];
        elems--;
        return x;
    }

    private void resize() {
        T[] b = (T[]) new Object[max(1,2*elems)];
        System.arraycopy(array,0,b,0,elems);
        array = b;
    }

}
