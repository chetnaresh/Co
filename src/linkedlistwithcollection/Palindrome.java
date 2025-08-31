package linkedlistwithcollection;
import java.util.*;

class Palindrome {
    public static boolean isPalindrome(LinkedList<Integer> list) {
        List<Integer> copy = new ArrayList<>(list);
        Collections.reverse(copy);
        return list.equals(copy);
    }
}
