package chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayDequeTest {

    @Test
    void testAddRemove() {
        int n = 100;
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            arrayDeque.add(i, i);
        }
        for (int i = 0; i < n; i++) {
            assertEquals(new Integer(i), arrayDeque.remove(0));
        }
        for (int i = 0; i < n; i++) {
            arrayDeque.add(i, i);
        }
        for (int i = n-1; i >= 0; i--)
            assertEquals(new Integer(i), arrayDeque.remove(i));
    }

    @Test
    void testGetSet() {
        int n = 100;
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            arrayDeque.add(i,1);
        }
        for (int i = 0; i < n; i++) {
            assertEquals(new Integer(1), arrayDeque.get(i));
            arrayDeque.set(i,i);
        }
        for (int i = 0; i < n; i++) {
            assertEquals(new Integer(i), arrayDeque.get(i));
        }

    }

}
