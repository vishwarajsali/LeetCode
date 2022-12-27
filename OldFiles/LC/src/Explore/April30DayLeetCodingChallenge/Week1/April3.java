package com.vishwaraj.OldFiles.LC.src.Explore.April30DayLeetCodingChallenge.Week1;


/**
 * April3
 */
public class April3 {

    public static void main(String[] args) {
        int[] nums = {-2, 1};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int len = nums.length;
        for(int i = 0; i< len; i++){
            int sum = nums[i];
            maxSum = Integer.max(sum, maxSum);
            for(int j = i+1; j < len && i < len; j++){
                sum += nums[j];
                maxSum = Integer.max(sum, maxSum);
            } 
        }

        return maxSum;
    }
}