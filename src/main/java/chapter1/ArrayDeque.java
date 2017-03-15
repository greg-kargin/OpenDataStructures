package chapter1;

import static java.lang.Math.max;

public class ArrayDeque<T> {
    private T[] array = (T[]) new Object[0];
    private int s = 0;
    private int n = 0;

    public T get(int i) {
        return array[(s + i) % array.length];
    }

    public T set(int i, T v) {
        T x = array[(s + i) % array.length];
        array[(s + i) % array.length] = v;
        return x;
    }

    public void add(int i, T x) {
        if (n + 1 > array.length) resize();
        if (i < n / 2) {
            s = (s == 0) ? array.length - 1 : s - 1;
            for (int j = 0; j < i; j++)
                array[(s + j) % array.length] = array[(s + j + 1) % array.length];
        } else {
            for (int j = n; j > i; j--) {
                array[(s + j) % array.length] = array[(s + j - 1) % array.length];
            }
        }
        array[(s + i) % array.length] = x;
        n++;
    }

    public T remove(int i) {
        T x = array[(s + i) % array.length];
        if (i < n/2) {
            for (int j = i; j > 0; j--)
                array[(s + j) % array.length] = array[(s + j - 1) % array.length];
            s = (s + 1) % array.length;
        } else {
            for (int j = i; j < n - 1; j++)
                array[(s + j) % array.length] = array[(s + j + 1) % array.length];
        }
        n--;
        if (3 * n < array.length) resize();
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
