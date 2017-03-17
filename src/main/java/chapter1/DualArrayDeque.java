package chapter1;

public class DualArrayDeque<T> {
    private ArrayStack<T> front = new ArrayStack<>();
    private ArrayStack<T> back = new ArrayStack<>();

    public int size() {
        return front.size() + back.size();
    }

    public T get(int i) {
        if (i < front.size())
            return front.get(front.size() - i - 1);
        else
            return back.get(i - front.size());
    }

    public T set(int i, T v) {
        if (i < front.size())
            return front.set(front.size() - i - 1, v);
        return back.set(i - front.size(), v);
    }

    public void add(int i, T x) {
        if (i < front.size())
            front.add(front.size() - i, x);
        else
            back.add(i - front.size(), x);
        balance();
    }

    public T remove(int i) {
        T x;
        if (i < front.size())
            x = front.remove(front.size() - i);
        else
            x = back.remove(i - front.size());
        balance();
        return x;
    }

    private void balance() {
        int n = size();
        if (3 * front.size() < back.size())
            for (int i = 0; i < n/2 - front.size(); i++)
                front.add(0,back.remove(0));

        else if (3 * back.size() < front.size())
            for (int i = 0; i < n/2 - back.size(); i++)
                back.add(0, front.remove(0));
    }


}
