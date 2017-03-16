package chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RootishArrayStackTest {

    @Test
    void testAdd() {
        int n = 10000;
        RootishArrayStack<Integer> rootishArrayStack = new RootishArrayStack<>();
        for (int i = 0; i < n; i++)
            rootishArrayStack.add(i,i);
        for (int i = 0; i < n; i++) {
            assertEquals(new Integer(i), rootishArrayStack.get(i));
        }
    }

    @Test
    void testSet() {
        int n = 100;
        RootishArrayStack<Integer> rootishArrayStack = new RootishArrayStack<>();
        for (int i = 0; i < n; i++)
            rootishArrayStack.add(i, i);
        rootishArrayStack.set(5, 10);
        assertEquals(new Integer(10), rootishArrayStack.get(5));
    }

    @Test
    void testDelete() {
        int n = 100;
        RootishArrayStack<Integer> rootishArrayStack = new RootishArrayStack<>();
        for (int i = 0; i < n; i++)
            rootishArrayStack.add(i, i);
        for (int i = 0; i < n/2; i++)
            rootishArrayStack.remove(0);
        for (int i = 0; i < n/2; i++)
            assertEquals(new Integer(i + n/2), rootishArrayStack.get(i));
    }


}
