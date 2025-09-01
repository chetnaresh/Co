package arraylist;
import java.util.ArrayList;

public class CheckPalindrome {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(121);
        a.add(123);
        a.add(454);

        for (int num : a) {
            if (isPalindrome(num)) {
                System.out.println(num + " is palindrome");
            } else {
                System.out.println(num + " is not palindrome");
            }
        }
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }
}
