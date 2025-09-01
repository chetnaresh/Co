package arraylist;


import java.util.ArrayList;


public class FirstNonRepeated {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(4);
        list.add(5);
        list.add(2);

        int result = -1;

        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            int count = 0;


            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(current)) {
                    count++;
                }
            }


            if (count == 1) {
                result = current;
                break;
            }
        }

        if (result != -1) {
            System.out.println("First non-repeated element: " + result);
        } else {
            System.out.println("No non-repeated element found.");
        }
    }
}

