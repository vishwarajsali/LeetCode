package com.vishwaraj.OldFiles.Java.src.main.java.problems._0015_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 3Sum
 */
public class _3Sum {

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));
    }

    // code
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {
            int low = i+1, hi = len-1;
            int sum = 0-nums[i];
            while(low < hi){ 
            List<Integer> list = new ArrayList<>();
            if (nums[low]+ nums[hi] == sum) {
                list.add(nums[i]);
                list.add(nums[low]);
                list.add(nums[hi]);
                if (!result.contains(list)) result.add(list);
                low++; hi--;
                continue;
            }
                if((nums[low] + nums[hi]) < sum ) {
                    low++;
                } else hi--;
            }

        }
        return result;
    }
}