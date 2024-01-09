package com.vishwaraj.array_hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _00128_LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int maxLen = 0;
        Set<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);

        for(int n : nums){
            int count = 1;
            if(!set.contains(n-1)){
                while(set.contains(n+1)){
                    count++;
                    n++;
                }

            }
            maxLen = Math.max(maxLen, count);
        }

        return maxLen;
    }
}
