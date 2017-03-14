package chapter1;

import static java.lang.Math.max;

public class ArrayStack<T> {
    private T[] array = (T[]) new Object[0];
    private int n = 0;

    public int size() { return n; }

    public T get(int i) { return array[i]; }

    public T set(int i, T value) {
        T tmp = array[i];
        array[i] = value;
        return tmp;
    }

    public void add(int i, T value) {
        if (n + 1 > array.length) resize();
        System.arraycopy(array, i, array, i+1, n - i);
        array[i] = value;
        n++;
    }

    public T remove(int i) {
        T tmp = array[i];
        System.arraycopy(array, i+1, array, i, n - i - 1);
        n--;
        if (array.length >= 3*n) resize();
        return tmp;
    }

    private void resize() {
        T[] b = (T[]) new Object[max(n*2, 1)];
        System.arraycopy(array, 0, b, 0, n);
        array = b;
    }
}
