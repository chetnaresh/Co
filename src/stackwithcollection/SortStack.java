package stackwithcollection;
import java.util.*;

public class SortStack {


    public static void insertSorted(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }


        int top = stack.pop();
        insertSorted(stack, element);


        stack.push(top);
    }


    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {

            int top = stack.pop();


            sortStack(stack);


            insertSorted(stack, top);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
