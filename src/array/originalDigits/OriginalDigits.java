package array.originalDigits;

import java.util.HashMap;
import java.util.Map;

public class OriginalDigits {
    public static void main(String[] args) {
        String s = "owoztneoer";
        Map<String, Integer> dict = new HashMap<>();
        dict.put("zero", 0);
        dict.put("one", 1);
        dict.put("two", 2);
        dict.put("three", 3);
        dict.put("four", 4);
        dict.put("five", 5);
        dict.put("six", 6);
        dict.put("seven", 7);
        dict.put("eight", 8);
        dict.put("nine", 9);
    }
}