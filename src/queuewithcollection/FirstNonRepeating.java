package queuewithcollection;
import java.util.*;

class FirstNonRepeating {
    public static void main(String[] args) {
        String stream = "aabc";
        Map<Character, Integer> freq = new HashMap<>();
        Queue<Character> q = new LinkedList<>();

        for (char ch : stream.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            q.offer(ch);


            while (!q.isEmpty() && freq.get(q.peek()) > 1) {
                q.poll();
            }

            if (q.isEmpty()) {
                System.out.println("No non-repeating character");
            } else {
                System.out.println("First non-repeating: " + q.peek());
            }
        }
    }
}
