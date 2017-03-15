package chapter1;

import static java.lang.Math.max;

public class ArrayQueue<T> {
    T[] array = (T[]) new Object[0];
    int s = 0;
    int n = 0;

    public void add(T x) {
        if (n + 1 > array.length) resize();
        array[(s + n) % array.length] = x;
        n++;
    }

    public T remove() {
        T x = array[s];
        s = (s + 1) % array.length;
        n--;
        if (array.length >= n * 3) resize();
        return x;
    }

    private void resize() {
        T[] b = (T[]) new Object[max(1,2*n)];
        for (int i = 0; i < n; i++)
            b[i] = array[(i + s) % array.length];
        s = 0;
        array = b;
    }

}
