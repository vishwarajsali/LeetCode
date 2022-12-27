package com.vishwaraj.OldFiles.src.main.java.code.Other;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Two_Sum
 */
public class Two_Sum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[2];
        int i = 0;
        while(i< nums.length){
            int diff = target - nums[i];

            if(hashMap.containsKey(nums[i])){
                result[0] = hashMap.get(nums[i]);
                result[1] = i; 
            }
            hashMap.put(diff, i);
            i++;
        }

        return result;
    }
}