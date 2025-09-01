package arraylist;

import java.util.ArrayList;


public class UnionOfList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        ArrayList<Integer> union = new ArrayList<>();


        for (int num : list1) {
            if (!union.contains(num)) {
                union.add(num);
            }
        }


        for (int num : list2) {
            if (!union.contains(num)) {
                union.add(num);
            }
        }

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("Union: " + union);
    }
}

