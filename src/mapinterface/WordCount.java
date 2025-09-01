package mapinterface;

import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        Map<String, Integer> map = new HashMap<>();
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.toLowerCase().split("\\W+"); // split by non-letters
            for (String word : words) {
                if (word.length() > 0) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
        }
        br.close();
        System.out.println(map);
    }
}
