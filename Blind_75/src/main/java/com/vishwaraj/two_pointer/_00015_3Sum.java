package com.vishwaraj.two_pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _00015_3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i< nums.length-2; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                sumTwo(nums, i, res);
            }
        }
        return res;
    }

    private void sumTwo(int[] nums, int start, List<List<Integer>> res){
        int left = start + 1;
        int right = nums.length-1;

        while(left < right){
            int target = nums[start] + nums[left] + nums[right];

            if(target == 0){
                res.add(Arrays.asList(nums[start], nums[left], nums[right]));
                left++;
                right--;
                while (left< right && nums[left] == nums[left-1]) ++left;
            }
            else if(target < 0) left++;
            else right--;
        }
    }
}
