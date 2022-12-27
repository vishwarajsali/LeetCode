package com.vishwaraj.OldFiles.Java.src.main.java.problems._0136SingleNumber;

import java.util.HashMap;
import java.util.Map;

/**
 * SingleNumber
 */
public class SingleNumber {

    public static void main(String[] args) {
        
        int[] nums = {1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
       // int result = 0;
        Map<Integer, Integer> dict = new HashMap<>();
        for(int num : nums){
            if(dict.containsKey(num)){
                dict.put(num, dict.get(num)+1);
            }else dict.put(num, 1);
        }
        
        for(Map.Entry<Integer, Integer> entry: dict.entrySet()){
            if(entry.getValue() == 1) return entry.getKey();
        }
        
        return 0;
    }
}