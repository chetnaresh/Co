package stackwithcollection;
import java.util.*;

public class NextGreater {
    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 25};
        int n = arr.length;

        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }


            result[i] = stack.isEmpty() ? -1 : stack.peek();


            stack.push(arr[i]);
        }


        System.out.println("Element  -->  Next Greater Element");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "  -->  " + result[i]);
        }
    }
}
