package chapter2;

public class DLList<T> {
    int n;
    Node head; //cycled


    DLList(){
        head = new Node();
        head.next = head;
        head.prev = head;
        n = 0;
    }

    Node getNode(int i) {
        Node p;
        if (i < n / 2) {
            p = head.next;
            for (int j = 0; j < i; j++)
                p = p.next;
        } else {
            p = head;
            for (int j = n; j > i; j--)
                p = p.prev;
        }
        return p;
    }

    T get(int i) {
        return getNode(i).value;
    }

    T set(int i, T v) {
        Node t = getNode(i);
        T old = t.value;
        t.value = v;
        return old;
    }

    Node addBefore(Node x, T v) {
        Node t = new Node();
        t.value = v;
        t.next = x;
        t.prev = x.prev;
        x.prev.next = t;
        x.prev = t;
        n++;
        return t;
    }

    void add(int i, T v) {
        addBefore(getNode(i), v);
    }

    void remove(Node x) {
        x.prev.next = x.next;
        x.next.prev = x.prev;
        n--;
    }

    T remove(int i) {
        T v = get(i);
        remove(getNode(i));
        return v;
    }

    class Node {
        T value;
        Node next;
        Node prev;
    }

}
