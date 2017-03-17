package chapter1.exercises;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRandomQueue {
    @Test
    void test() {
        int n = 100;
        Set<Integer> set = new HashSet<>();
        RandomQueue<Integer> randomQueue = new RandomQueue<>();
        for (int i = 0; i < n; i++) {
            randomQueue.add(i);
        }
        for (int i = 0; i < n; i++)
            set.add(randomQueue.remove());
        assertEquals(n, set.size());
    }
}
