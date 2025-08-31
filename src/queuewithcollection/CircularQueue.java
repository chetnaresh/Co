package queuewithcollection;
import java.util.*;

class CircularQueue {
    private int capacity;
    private Queue<Integer> queue;

    CircularQueue(int size) {
        capacity = size;
        queue = new ArrayDeque<>(size);
    }


    void enqueue(int x) {
        if (queue.size() == capacity) {
            System.out.println("Queue is Full!");
        } else {
            queue.add(x);
            System.out.println("Inserted: " + x);
        }
    }


    int dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return queue.remove();
    }


    int peek() {
        if (queue.isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return queue.peek();
    }

    boolean isEmpty() {
        return queue.isEmpty();
    }

    boolean isFull() {
        return queue.size() == capacity;
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        System.out.println("Dequeue: " + cq.dequeue());
        cq.enqueue(40);
        System.out.println("Front: " + cq.peek());
    }
}
