package chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayStackTest {

    @Test
    void testAdd() {
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        arrayStack.add(0, 10);
        assertEquals(arrayStack.get(0), new Integer(10));
    }

    @Test
    void testMultipleAdd() {
        int n = 10000000;
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            arrayStack.add(i,i);
            array[i] = i;
        }
        for (int i = 0; i < n; i++)
            assertEquals(arrayStack.get(i), new Integer(array[i]));
    }

    @Test
    void testSet() {
        int n = 100;
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        for (int i = 0; i < n; i++)
            arrayStack.add(i, i);
        arrayStack.set(n/2, n * 2);
        assertEquals(arrayStack.get(n/2), new Integer(n * 2));
    }

    @Test
    void testSize() {
        int n = 100;
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        for (int i = 0; i < n; i++)
            arrayStack.add(i,i);
        assertEquals(n, arrayStack.size());
    }

    @Test
    void testDelete() {
        int n = 100;
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        for (int i = 0; i < n; i++)
            arrayStack.add(i, i);
        for (int i = 0; i < n/2; i++)
            arrayStack.remove(0);
        for (int i = 0; i < n/2; i++)
            assertEquals(arrayStack.get(i), new Integer(i + n/2));

    }
}
