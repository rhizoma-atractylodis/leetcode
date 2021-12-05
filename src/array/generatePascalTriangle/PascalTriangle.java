package array.generatePascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows=5;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        result.add(pre);
        generator(result, pre, numRows-1);
        result.forEach(e -> {
            e.forEach(System.out::print);
            System.out.print("\n");
        });
    }

    public static void generator(List<List<Integer>> result, List<Integer> pre, int numRows) {
        if (numRows==0) {
            return ;
        }
        List<Integer> next = new ArrayList<>();
        next.add(1);
        for (int i = 0; i < pre.size()-1; i++) {
            next.add(pre.get(i)+pre.get(i+1));
        }
        next.add(1);
        result.add(next);
        generator(result, next, numRows-1);
    }
}
