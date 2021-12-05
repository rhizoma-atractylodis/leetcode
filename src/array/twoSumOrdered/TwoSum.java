package array.twoSumOrdered;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target=9;
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            result[0] = numbers[i];
            int finalTarget=target-numbers[i];
            int begin=i+1;
            int end=numbers.length-1;
            while(begin<=end) {
                int mid=(begin+end)/2;
                if(numbers[mid]==finalTarget) {
                    result[1] = numbers[mid];
                    break;
                } else if(numbers[mid]<finalTarget) {
                    begin=mid+1;
                } else {
                    end=mid-1;
                }
            }
            if (result[0]+result[1]==target) {
                break;
            }
        }
        for (int i : result) {
            System.out.println(i);
        }
    }
}
