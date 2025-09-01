package mapinterface;
import java.util.*;
import java.util.Scanner;
public class FrequencyCount {
    public static void main(String[] args) {
        Map<Character, Integer> freq = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();

        for (char ch : input.toCharArray()) {
            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
            }
            else {
                freq.put(ch, 1);
            }
        }
        System.out.println("Character Frequencies:");
        for (char ch : freq.keySet()) {
            System.out.println(ch + "---> " + freq.get(ch));
        }

        sc.close();
    }
}


