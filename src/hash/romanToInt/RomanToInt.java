package hash.romanToInt;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RomanToInt {
    public static void main(String[] args) {
        Map<Character, Integer> dict = new HashMap<>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);
        String s = "MCMXCIV";
        int sum=0;
        Stack<Integer> stack = new Stack<>();
        for (char key : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(dict.get(key));
            } else {
                if (dict.get(key)>stack.peek()) {
                    sum+=(dict.get(key)-stack.pop());
                } else {
                    stack.push(dict.get(key));
                }
            }
        }
        for (Integer integer : stack) {
            sum+=integer;
        }
        System.out.println(sum);
    }
}
