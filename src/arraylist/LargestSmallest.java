package arraylist;


import java.util.ArrayList;

public class LargestSmallest {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(50);
        a.add(20);
        a.add(60);
        a.add(40);

        int max_element = a.get(0);
        int min_element = a.get(0);

        for (int i = 0; i < a.size(); i++) {
            int element = a.get(i);
            if (element > max_element) {
                max_element = element;
            }
            if (element < min_element) {
                min_element = element;
            }
        }

        System.out.println("Largest element: " + max_element);
        System.out.println("Smallest element: " + min_element);
    }
}
