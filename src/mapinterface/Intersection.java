package mapinterface;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,4};
        int[] arr2 = {2,2,3,5};

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();


        for (int n : arr1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int n : arr2) {
            if (map.getOrDefault(n, 0) > 0) {
                result.add(n);
                map.put(n, map.get(n) - 1);
            }
        }

        System.out.println("Intersection: " + result);
    }
}
