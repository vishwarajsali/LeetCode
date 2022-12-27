package com.vishwaraj.OldFiles.src.main.java.code.Java1.Problems;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		System.out.println(Arrays.toString(ts.twoSum(nums, target)));
	}

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
