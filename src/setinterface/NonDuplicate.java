package setinterface;

import java.util.*;

public class NonDuplicate {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 4, 7, 8, 5);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n)) {
                duplicates.add(n);
            } else {
                set.add(n);
            }
        }

        for (int n : set) {
            if (!duplicates.contains(n)) {
                System.out.println("First non-duplicate: " + n);
                break;
            }
        }
    }
}
