package com.vishwaraj.binary_search;

import java.util.HashMap;
import java.util.Map;

public class _00153_FindMinimuminRotatedSortedArray {

    /**
     * Input: nums = [3,4,5,1,2]
     * Output: 1
     * Explanation: The original array was [1,2,3,4,5] rotated 3 times.
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        int left = 0 , right = nums.length-1;
        while (left <= right){
            if(nums[left] <= nums[right]) return nums[left];
            int mid = (left + right) / 2;
            if(nums[mid] >= nums[left]) left = mid +1;
            else right = mid;
        }

        return 0;
    }
}
