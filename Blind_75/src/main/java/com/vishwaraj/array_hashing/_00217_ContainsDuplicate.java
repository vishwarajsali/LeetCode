package com.vishwaraj.array_hashing;

import java.util.HashMap;
import java.util.Map;

public class _00217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
            if(map.get(i) > 1) return true;
        }

        return false;
    }
}
