package linkedlistwithcollection;
import java.util.*;
class RemoveNthNode {
    public static void removeNthFromEnd(LinkedList<Integer> list, int n) {
        int index = list.size() - n;
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        }
    }
}
