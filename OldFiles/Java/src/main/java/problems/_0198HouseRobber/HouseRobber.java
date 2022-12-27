package com.vishwaraj.OldFiles.Java.src.main.java.problems._0198HouseRobber;

/**
 * HouseRobber
 */
public class HouseRobber {

    public static void main(String[] args) {
        int[] nums = // {2,7,9,3,1};
                { 2, 1, 1, 2 };

        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {

        int currMax = 0, prevMax = 0;
        for (int num : nums) {
            int temp = currMax;
            currMax = Math.max(prevMax + num, currMax);
            prevMax = temp;

        }

        return currMax;
    }
}