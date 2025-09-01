package arraylist;



import java.util.ArrayList;
import java.util.HashMap;

public class FindDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(2);
        arr.add(2);
        arr.add(4);
        arr.add(5);


        HashMap<Integer, Integer> h = new HashMap<>();

        for (int num : arr) {
            h.put(num, h.getOrDefault(num, 0) + 1);
        }


        System.out.println("Duplicate elements:");
        for (int key : h.keySet()) {
            if (h.get(key) > 1) {
                System.out.println(key);
            }
        }
    }
}
