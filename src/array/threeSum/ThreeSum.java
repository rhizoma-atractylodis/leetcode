package array.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                List<Integer> elem = new ArrayList<>();
                elem.add(nums[i]);
                elem.add(nums[j]);
                int target = -(nums[i]+nums[j]);
                int begin = j+1;
                int end=nums.length-1;
                while(begin<=end) {
                    int mid = (begin+end)/2;
                    if(target==nums[mid]) {
                        elem.add(nums[mid]);
                        result.add(elem);
                        break;
                    } else if (nums[mid] < target) {
                        begin=mid+1;
                    } else {
                        end=mid-1;
                    }
                }
            }
        }
        List<List<Integer>> a = new ArrayList<>(result);
        a.forEach(System.out::println);
    }
}
