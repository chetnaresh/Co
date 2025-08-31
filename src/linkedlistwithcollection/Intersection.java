package linkedlistwithcollection;
import java.util.*;

class Intersection {
    public static Integer getIntersection(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        Set<Integer> set = new HashSet<>(list1);
        for (Integer val : list2) {
            if (set.contains(val)) {
                return val; // first intersection value
            }
        }
        return null;
    }
}
