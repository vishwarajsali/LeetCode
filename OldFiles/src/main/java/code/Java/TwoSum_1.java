package com.vishwaraj.OldFiles.src.main.java.code.Java;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/


public class TwoSum_1{
    public static void main(String [] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.print(Arrays.toString(twoSum(nums, target)));
    }

    // public  static int[] twoSum(int[] nums, int target) {
    //     int[] result = new int[2];
    //     for(int i = 0; i < nums.length-1; i ++){
    //         for(int j = i+1; j< nums.length; j++){
    //             int sum = nums[i] + nums[j];
    //             if(sum == target){
    //                 result[0] = i;
    //                 result[1] = j;
    //             }
    //         }
    //     }

    //     return result;
    // }

    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int pointer = 0; pointer < nums.length; pointer++){
            if(map.containsKey(target - nums[pointer])){
                result[0] = map.get(target - nums[pointer]);
                result[1] = pointer;
                return result;
            }
            map.put(nums[pointer], pointer);
        }

        return result;
    }
}