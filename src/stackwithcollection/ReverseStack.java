package stackwithcollection;
import java.util.Stack;

public class ReverseStack<T> {

    private Stack<T> stack;


    public ReverseStack() {
        stack = new Stack<>();
    }


    public void push(T data) {
        stack.push(data);
    }


    public Stack<T> reverse() {
        Stack<T> temp = new Stack<>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        return temp;
    }


    public Stack<T> getStack() {
        return stack;
    }

    public static void main(String[] args) {

        ReverseStack<Integer> intStack = new ReverseStack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.push(40);
        intStack.push(50);

        System.out.println("Original elements are " + intStack.getStack());
        System.out.println("The reverse of elements are " + intStack.reverse());

        // String stack
        ReverseStack<String> stringStack = new ReverseStack<>();
        stringStack.push("Apple");
        stringStack.push("Banana");
        stringStack.push("Mango");

        System.out.println("Original elements are " + stringStack.getStack());
        System.out.println("The reverse of elements are " + stringStack.reverse());
    }
}
