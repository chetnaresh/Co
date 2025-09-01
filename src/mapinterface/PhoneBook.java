package mapinterface;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        TreeMap<String, String> phoneBook = new TreeMap<>();


        phoneBook.put("Alice", "123456");
        phoneBook.put("Bob", "987654");
        phoneBook.put("Charlie", "555555");


        System.out.println("Bob's number: " + phoneBook.get("Bob"));

        phoneBook.remove("Alice");

        System.out.println("Contacts: " + phoneBook);
    }
}
