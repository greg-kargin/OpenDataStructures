package chapter2;

public class SLList<T> {

    Node head;
    Node tail;
    int n;

    T push(T e) {
        head = new Node(e, head);
        if (n == 0)
            tail = head;
        n++;
        return e;
    }

    T pop() {
        T x = head.value;
        head = head.next;
        if (--n == 0)
            tail = null;
        return x;
    }

    T remove() {
        return pop();
    }

    T add(T e) {
        Node t = new Node(e, null);
        if (head == null)
            head = t;
        else
            tail.next = t;
        tail = t;
        n++;
        return e;
    }

    class Node {
        T value;
        Node next;

        public Node(T x, Node next) {
            this.value = x;
            this.next = next;
        }
    }

}
