package setinterface;

import java.util.*;

public class SubsetCheck {
    public static void main(String[] args) {
        Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> B = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        System.out.println(B.containsAll(A));
    }
}
