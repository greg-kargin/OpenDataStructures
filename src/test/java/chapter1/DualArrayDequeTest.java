package chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DualArrayDequeTest {

    @Test
    void testAdd() {
        int n = 10000;
        DualArrayDeque<Integer> dualArrayDeque = new DualArrayDeque<>();
        for (int i = 0; i < n; i++)
            dualArrayDeque.add(i,i);
        for (int i = 0; i < n; i++)
            assertEquals(new Integer(i), dualArrayDeque.get(i));

    }

    @Test
    void testDelete() {
        int n = 100;
        DualArrayDeque<Integer> dualArrayDeque = new DualArrayDeque<>();
        for (int i = 0; i < n; i++)
            dualArrayDeque.add(i,i);
        for (int i = 0; i < n / 2; i++)
            assertEquals(new Integer(n / 2 + i), dualArrayDeque.remove(n / 2));
        assertEquals(n/2, dualArrayDeque.size());
    }


}
