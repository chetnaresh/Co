package mapinterface;

import java.util.*;

public class SortByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 5);
        map.put("banana", 2);
        map.put("cherry", 8);


        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());


        list.sort(Map.Entry.comparingByValue());

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> e : list) {
            sortedMap.put(e.getKey(), e.getValue());
        }

        System.out.println(sortedMap);
    }
}
