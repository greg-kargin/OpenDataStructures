package chapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DLListTest {

    @Test
    void testAddGetRemove() {
        int n = 100;
        DLList<Integer> list = new DLList<>();
        for (int i = 0; i < n; i++)
            list.add(i, i);
        for (int i = 0; i < n; i++)
            assertEquals(new Integer(i), list.get(i));
        for (int i = 0; i < n; i++)
            assertEquals(new Integer(i), list.remove(0));
    }

    @Test
    void testSet() {
        int n = 100;
        DLList<Integer> list = new DLList<>();
        for (int i = 0; i < n; i++)
            list.add(i, 0);
        for (int i = 0; i < n; i++)
            list.set(i, i);
        for (int i = 0; i < n; i++)
            assertEquals(new Integer(i), list.get(i));

    }

}
