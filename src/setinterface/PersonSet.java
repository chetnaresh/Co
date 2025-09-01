package setinterface;

import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person p = (Person) o;
        return age == p.age && name.equals(p.name);
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString() {
        return name + "(" + age + ")";
    }
}

public class PersonSet {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Alice", 30)); // duplicate ignored

        System.out.println(people);

        System.out.println("Contains Alice(30)? " +
                people.contains(new Person("Alice", 30)));
    }
}
