package pascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int rowIndex = 33;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < rowIndex+1; i++) {
            result.add((int)(factorial(rowIndex)/(factorial(i)*factorial(rowIndex-i))));
        }
        result.forEach(System.out::println);
    }

    public static long factorial(int n) {
        if (n==1 || n==0) {
            return 1L;
        } else {
            return n*factorial(n-1);
        }
    }
}
