package com.vishwaraj.OldFiles.src.main.java.code.Java1.Problems;

import java.util.HashMap;

public class Problems1_10 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            int diff = target -nums[i] ;
            if(map.containsKey(nums[i])){
                result[0] = map.get(nums[i]);
                result[1] = i;
                return result;
            }
            else map.put(diff, i);
        }

        return result;
    }
}
