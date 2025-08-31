package queuewithcollection;
import java.util.*;

class Deque<T> {
    private LinkedList<T> list = new LinkedList<>();


    void addFront(T x) {
        list.addFirst(x);
    }


    void addRear(T x) {
        list.addLast(x);
    }


    T removeFront() {
        if (list.isEmpty()) {
            System.out.println("Deque is empty");
            return null;
        }
        return list.removeFirst();
    }


    T removeRear() {
        if (list.isEmpty()) {
            System.out.println("Deque is empty");
            return null;
        }
        return list.removeLast();
    }


    T peekFront() {
        return list.peekFirst();
    }

    // Peek rear
    T peekRear() {
        return list.peekLast();
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

    int size() {
        return list.size();
    }

    public static void main(String[] args) {
        Deque<Integer> dq = new Deque<>();
        dq.addFront(10);
        dq.addRear(20);
        dq.addFront(5);
        System.out.println("Front: " + dq.peekFront());
        System.out.println("Rear: " + dq.peekRear());
        System.out.println("Removed Front: " + dq.removeFront());
        System.out.println("Removed Rear: " + dq.removeRear());
    }
}
