package stackwithcollection;
import java.util.*;

public class MinStack<T extends Comparable<T>> {
    private Stack<T> stack;
    private Stack<T> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element
    public void push(T data) {
        stack.push(data);
        if (minStack.isEmpty() || data.compareTo(minStack.peek()) <= 0) {
            minStack.push(data);
        }
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        T removed = stack.pop();
        if (removed.equals(minStack.peek())) {
            minStack.pop();
        }
        return removed;
    }


    public T peek() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.peek();
    }


    public T getMin() {
        if (minStack.isEmpty()) {
            throw new EmptyStackException();
        }
        return minStack.peek();
    }

    public static void main(String[] args) {

        MinStack<Integer> intStack = new MinStack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(5);
        intStack.push(30);

        System.out.println("Top element: " + intStack.peek());
        System.out.println("Minimum element: " + intStack.getMin());

        intStack.pop();
        System.out.println("Top element: " + intStack.peek());
        System.out.println("Minimum element: " + intStack.getMin());

    }
}
