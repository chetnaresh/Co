package linkedlistwithcollection;
import java.util.*;

class MergeSortedCollection {
    public static LinkedList<Integer> merge(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> merged = new LinkedList<>(list1);
        merged.addAll(list2);
        Collections.sort(merged);
        return merged;
    }
}
