package mapinterface;
import java.util.HashMap;
import java.util.Map;
public class DuplicateElements {
    public static void main(String[] args) {
                int[] arr = {1, 2, 3, 3, 4, 3, 4};
                HashMap<Integer, Integer> hash = new HashMap<>();

                for (int i : arr) {
                    hash.put(i, hash.getOrDefault(i, 0) + 1);
                }

                System.out.println(hash);


                for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
                    if (entry.getValue() > 1) {
                        System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
                    }
                }
            }
        }
        
