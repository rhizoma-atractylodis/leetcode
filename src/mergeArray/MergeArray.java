package mergeArray;

public class MergeArray {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        int m = 3;
        int n = 3;
        for (int i = 0; i < n; i++) {
            num1[i+m]=num2[i];
        }
        MergeArray.sort(num1, 0, num1.length-1);
        for (int i : num1) {
            System.out.println(i);
        }
    }

    public static void sort(int[] num, int begin, int end) {
        if (begin >= end) return;
        int left=begin;
        int right=end;
        int key=num[begin];
        while (left < right) {
            while (left <= right && num[left]<=key) left++;
            while (left <= right && num[right]>=key) right--;
            num[left]^=num[right];
            num[right]^=num[left];
            num[left]^=num[right];
        }
        num[begin] = num[left];
        num[left]=key;
        sort(num, begin, left-1);
        sort(num, left-1, end);
    }
}
