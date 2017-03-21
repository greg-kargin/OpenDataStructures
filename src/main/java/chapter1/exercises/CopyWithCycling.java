package chapter1.exercises;

public class CopyWithCycling {
    public static void copyWithCycling(Object[] a, int sA, Object[] b, int sB, int len) {
        if (sB > sA)
            if (sB + len < b.length)
                System.arraycopy(a, sA, b, sB, len);
            else {
                int offset = - b.length + sB + len;
                System.arraycopy(a, sA, b, sB, len - offset);
                System.arraycopy(a, sA + len - offset , b, 0, offset);
            }
        else
                if (sB >= 0)
                    System.arraycopy(a, sA, b, sB, len);
                else {
                    System.arraycopy(a, sA, b, b.length + sB, - sB);
                    System.arraycopy(a, sA - sB, b, 0, len + sB);
                }

    }
}
