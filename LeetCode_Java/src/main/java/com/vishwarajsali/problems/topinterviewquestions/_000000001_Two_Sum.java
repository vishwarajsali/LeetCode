package com.vishwarajsali.problems.topinterviewquestions;

import java.util.HashMap;
import java.util.Map;

public class _000000001_Two_Sum {


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int sum = target - nums[i];
            if(map.containsKey(nums[i])){
                return new int[] {i , map.get(nums[i])};
            }
            map.put(sum, i);
        }


        return new int[] {-1, -1};
    }

    public int[] twoSum1(int[] nums, int target) {
        for(int i = 0; i< nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                int sum = target - nums[i];
                if(sum == nums[j]){
                    return new int[] {i , j};
                }
            }
        }


        return new int[] {-1, -1};
    }
}
