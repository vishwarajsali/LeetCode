package com.vishwaraj.OldFiles.Java.src.main.java.problems._0169MajorityElement;

import java.util.HashMap;

/**
 * MajorityElement
 */
public class MajorityElement {

    public static void main(String[] args) {
        int[] a = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(a));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else map.put(num, 1);
        }

        for (HashMap.Entry<Integer,Integer> entry : map.entrySet())  {
            if(entry.getValue() > (nums.length/2)) return entry.getKey();
        }

        return 0;
    }
}