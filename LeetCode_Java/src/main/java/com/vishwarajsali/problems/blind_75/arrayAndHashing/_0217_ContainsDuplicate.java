package com.vishwarajsali.problems.blind_75.arrayAndHashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _0217_ContainsDuplicate {


    // with a HashSet
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(int i = 0; i< nums.length; i++){
            if(map.contains(nums[i])) return true;
            map.add(nums[i]);
        }

        return false;
    }

    // with a HashMap
    public boolean containsDuplicate2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if(map.get(nums[i]) > 1) return true;
        }

        return false;
    }


    // With two for loop
    public boolean containsDuplicate1(int[] nums) {
        for(int i = 0; i< nums.length-1; i++){
            for(int j = i+1; j< nums.length; j++){
                if(nums[i] == nums[j]) return true;
            }
        }

        return false;
    }
}
