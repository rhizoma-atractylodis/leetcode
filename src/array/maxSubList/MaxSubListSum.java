package array.maxSubList;

public class MaxSubListSum {
    public static void main(String[] args) {
        int[] nums={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int start=0;
        int end=nums.length-1;
        int sum=0;
        int result = Integer.MIN_VALUE;
        while(start <= end) {
            for (int i = start; i<=end; i++) {
                sum+=nums[i];
            }
            if(result<sum) result=sum;
            if(nums[start]<nums[end]) {
                start++;
            }else{
                end--;
            }
            sum=0;
        }
        System.out.println(result);
    }
}
