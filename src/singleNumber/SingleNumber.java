package singleNumber;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {5,1,2,1,2};
        int result = 0;
        for (int i : nums) {
            result^=i;
        }
        System.out.println(result);
    }
}
