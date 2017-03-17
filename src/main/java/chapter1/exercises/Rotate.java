package chapter1.exercises;

public class Rotate {
    public static Object[] rotate(Object[] arr, int offset) {
        Object[] b = new Object[arr.length];
        for (int i = 0; i < arr.length; i++)
            b[(i + offset) % b.length] = arr[i];
        return b;
    }
}
