package chapter1;

public class RootishArrayStack<T> {
    ArrayStack<T[]> blocks = new ArrayStack<>();
    int n;

    public int size() {
        return (blocks.size() * (blocks.size() + 1) / 2);
    }

    private int i2b(int i) {
        double db = (-3.0 + Math.sqrt(9 + 8*i)) / 2.0;
        int b = (int) Math.ceil(db);
        return b;
    }

    public T get(int i) {
        int blockIndex = i2b(i);
        int indexInBlock = i - blockIndex * (blockIndex + 1) / 2;
        return blocks.get(blockIndex)[indexInBlock];
    }

    public T set(int i, T v) {
        int blockIndex = i2b(i);
        int indexInBlock = i - (blockIndex * (blockIndex + 1) / 2);
        T x = blocks.get(blockIndex)[indexInBlock];
        blocks.get(blockIndex)[indexInBlock] = v;
        return x;
    }

    public void add(int i, T x) {
        int r = blocks.size();
        if ((r * (r + 1) / 2) < n + 1) grow();
        n++;
        for (int j = n-1; j > i; j--)
            set(j, get(j-1));
        set(i, x);
    }

    private void grow() {
        blocks.add(blocks.size(), (T[]) new Object[blocks.size()+1]);
    }

    public T remove(int i) {
        T x = get(i);
        for (int j = i; j < n - 1; j++)
            set(j, get(j + 1));
        n--;
        int r = blocks.size();
        if ((r - 2) * (r - 1) / 2 >= n) shrink();
        return x;
    }

    private void shrink() {
        int r = blocks.size();
        while (r > 0 && (r - 2) * (r - 1) / 2 >= n) {
            blocks.remove(blocks.size() - 1);
            r--;
        }
    }

}
