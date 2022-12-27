package com.vishwaraj.OldFiles.Java.src.main.java.problems._0448FindAllNumbersDisappearedinanArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FindAllNumbersDisappearedinanArray
 */
public class FindAllNumbersDisappearedinanArray {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers1(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] map = new int[nums.length+1];
        //Arrays.sort(nums);

        for(int i = 0; i< nums.length; i++){
            map[nums[i]]++;
        }

        for(int i = 1; i<map.length; i++){
            if(map[i] == 0) result.add(i);
        }
        return result;
    }

    public static List<Integer> findDisappearedNumbers1(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Boolean> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], true);
        }

        
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(i+1)) result.add(i+1);
        }
        
        return result;
    }
}