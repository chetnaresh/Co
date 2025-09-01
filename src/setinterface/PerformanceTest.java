package setinterface;

import java.util.*;

public class PerformanceTest {
    public static void main(String[] args) {
        int n = 1000000;

        testSet(new HashSet<>(), n, "HashSet");
        testSet(new LinkedHashSet<>(), n, "LinkedHashSet");
        testSet(new TreeSet<>(), n, "TreeSet");
    }

    static void testSet(Set<Integer> set, int n, String name) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < n; i++) set.add(i);

        for (int i = 0; i < n; i++) set.contains(i);

        for (int i = 0; i < n; i++) set.remove(i);

        long end = System.currentTimeMillis();
        System.out.println(name + " took " + (end - start) + " ms");
    }
}
