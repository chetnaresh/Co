package setinterface;

import java.util.*;

public class RemoveElements {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(1,2,3,4,5));
        int threshold = 3;

        set.removeIf(x -> x < threshold);

        System.out.println(set);
    }
}
