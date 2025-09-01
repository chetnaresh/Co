package arraylist;

import java.util.ArrayList;
public class IntersectionList {
    public static void main(String[]args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c=new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);


        for(int i=0;i<a.size();i++){
            int element=a.get(i);
            if (b.contains(element)){
                c.add(element);
            }
        }
        System.out.println("The intersection of two lists "+c);
    }
}
