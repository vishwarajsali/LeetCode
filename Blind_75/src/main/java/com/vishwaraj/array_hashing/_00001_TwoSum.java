package com.vishwaraj.array_hashing;

import java.util.HashMap;
import java.util.Map;

public class _00001_TwoSum {


    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            if(map.containsKey(nums[i])) return new int[] {map.get(nums[i]), i};
            map.put(target - nums[i],i);
        }

        return new int[]{-1, -1};
    }
}
