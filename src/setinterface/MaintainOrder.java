package setinterface;

import java.util.*;

public class MaintainOrder {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange");
        Set<String> set = new LinkedHashSet<>(fruits);
        System.out.println(set);
    }
}
