package setinterface;

import java.util.*;

public class MultiIntersection {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(2, 3, 4));
        Set<Integer> s3 = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> result = new HashSet<>(s1);
        result.retainAll(s2);
        result.retainAll(s3);

        System.out.println(result);
    }
}
