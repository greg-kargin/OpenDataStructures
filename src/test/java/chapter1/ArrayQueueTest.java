package chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayQueueTest {

    @Test
    void testQueue(){
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        int n = 100;
        for (int i = 0; i < n; i++)
            queue.add(i);
        for (int i = 0; i < n; i++)
            assertEquals(new Integer(i), queue.remove());
    }
}
