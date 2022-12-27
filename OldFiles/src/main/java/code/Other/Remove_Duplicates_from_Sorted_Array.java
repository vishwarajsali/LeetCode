package com.vishwaraj.OldFiles.src.main.java.code.Other;

import java.util.Arrays;

/**
 * Remove_Duplicates_from_Sorted_Array
 */
public class Remove_Duplicates_from_Sorted_Array {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        //{1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int curr=0, pre=0;
        if (nums.length == 0) return 0;
        while (curr < nums.length) {

            if(nums[curr] != nums[pre]){
                pre++;
                nums[pre] = nums[curr];
                count++;
            }
            curr++;
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
}