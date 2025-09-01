package setinterface;
import java.util.*;

public class SetBehaviour {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 3, 5, 1, 2);

        Set<Integer> hashSet = new HashSet<>(nums);
        Set<Integer> linkedHashSet = new LinkedHashSet<>(nums);
        Set<Integer> treeSet = new TreeSet<>(nums);

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
