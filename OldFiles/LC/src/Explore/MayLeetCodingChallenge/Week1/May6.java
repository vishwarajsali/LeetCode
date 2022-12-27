package com.vishwaraj.OldFiles.LC.src.Explore.MayLeetCodingChallenge.Week1;

import java.util.HashMap;
import java.util.Map;

public class May6 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); 
        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i, 0);
            }
            map.put(i, map.get(i)+1);
            if(map.get(i) > nums.length/2) return i;
        }
        
        return -1;
    }
}