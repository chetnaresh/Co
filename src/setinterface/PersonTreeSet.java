package setinterface;

import java.util.*;

class PersonComp implements Comparable<PersonComp> {
    String name;
    int age;

    PersonComp(String n, int a) {
        name = n; age = a;
    }

    public int compareTo(PersonComp p) {
        return name.compareTo(p.name); // sort by name
    }

    public String toString() { return name + "(" + age + ")"; }
}

public class PersonTreeSet {
    public static void main(String[] args) {
        Set<PersonComp> s1 = new TreeSet<>();
        s1.add(new PersonComp("Alice", 30));
        s1.add(new PersonComp("Bob", 25));

        Set<PersonComp> s2 = new TreeSet<>();
        s2.add(new PersonComp("Bob", 25));
        s2.add(new PersonComp("Charlie", 35));

        Set<PersonComp> union = new TreeSet<>(s1);
        union.addAll(s2);

        Set<PersonComp> diff = new TreeSet<>(s1);
        diff.removeAll(s2);

        System.out.println("Union: " + union);
        System.out.println("Difference: " + diff);
    }
}
