package chapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SLListTest {

    @Test
    void testPushPop() {
        int n = 1000;
        SLList<Integer> list = new SLList<>();
        for (int i = 0; i < n; i++)
            list.push(i);
        for (int i = n-1; i >= 0; i--)
            assertEquals(new Integer(i), list.pop());
    }

    @Test
    void testAddRemove() {
        int n = 1000;
        SLList<Integer> list = new SLList<>();
        for (int i = 0; i < n; i++)
            list.add(i);
        for (int i = 0; i < n; i++)
            assertEquals(new Integer(i), list.remove());
    }
}
