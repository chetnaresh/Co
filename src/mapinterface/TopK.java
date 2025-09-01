package mapinterface;

import java.util.*;

public class TopK {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,3,3,3,4};
        int k = 2;


        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }


        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());


        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(list.get(i).getKey());
        }

        System.out.println("Top " + k + " frequent: " + result);
    }
}
