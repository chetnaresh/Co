package stackwithcollection;
import java.util.*;

public class ValidParentheses {
    public static boolean isBalanced(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        for (char ch : s.toCharArray()) {
            if (mapping.containsValue(ch)) {
                stack.push(ch);
            } else if (mapping.containsKey(ch)) {
                if (stack.isEmpty() || stack.pop() != mapping.get(ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("({[]})"));
        System.out.println(isBalanced("(([])"));
        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("{[(])}"));
    }
}
