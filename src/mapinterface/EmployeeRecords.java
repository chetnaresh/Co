package mapinterface;

import java.util.*;

class Employee {
    String name;
    int id;
    String department;

    Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String toString() {
        return name + " (" + department + ")";
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Map<Integer, Employee> map = new HashMap<>();


        map.put(101, new Employee("Alice", 101, "IT"));
        map.put(102, new Employee("Bob", 102, "HR"));
        map.put(103, new Employee("Charlie", 103, "Finance"));

        int searchId = 102;
        if (map.containsKey(searchId)) {
            System.out.println("Found: " + map.get(searchId));
        } else {
            System.out.println("Employee not found");
        }
    }
}
