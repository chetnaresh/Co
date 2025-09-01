package arraylist;
import java.util.ArrayList;

public class RotateArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int k = 2;
        int n = list.size();


        k = k % n;


        ArrayList<Integer> rotated = new ArrayList<>();


        for (int i = n - k; i < n; i++) {
            rotated.add(list.get(i));
        }

        for (int i = 0; i < n - k; i++) {
            rotated.add(list.get(i));
        }

        System.out.println("Original List: " + list);
        System.out.println("Rotated List: " + rotated);
    }
}
