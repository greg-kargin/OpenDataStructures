package chapter1.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CopyWithCyclingTest {

    @Test
    void testForward() {
        Object[] a = {1,2,3,4};
        Object[] b = new Object[4];
        Object[] r = {3, 4, null, 2};
        CopyWithCycling.copyWithCycling(a,1, b, 3, 3);
        assertArrayEquals (r, b);
    }

    @Test
    void testBackward() {
        Object[] a = {1,2,3,4};
        Object[] b = new Object[4];
        Object[] r = {3, null, null, 2};
        CopyWithCycling.copyWithCycling(a,1, b, -1, 2);
        assertArrayEquals (r, b);
    }


}
