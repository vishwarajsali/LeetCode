package com.vishwaraj.OldFiles.Java.src.main.java.problems._0581ShortestUnsortedContinuousSubarray;

import java.util.Arrays;

/**
 * ShortestUnsortedContinuousSubarray
 */
public class ShortestUnsortedContinuousSubarray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(findUnsortedSubarray(nums));
    }

    public static int findUnsortedSubarray(int[] nums) {
        
        int start = nums.length, end = 0;
        int[] arr = nums.clone();
        Arrays.sort(arr);

        for(int i = 0; i< nums.length; i++){
            if(arr[i] != nums[i]){
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }

        return end - start< 0? 0: end -start +1;
    }

}