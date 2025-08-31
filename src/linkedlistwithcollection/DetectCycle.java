package linkedlistwithcollection;
import java.util.*;

class DetectCycleCollection {
    public static boolean hasCycle(LinkedList<Integer> list) {
        Set<Integer> visited = new HashSet<>();
        for (Integer val : list) {
            if (!visited.add(val)) {
                return true;
            }
        }
        return false;
    }
}
