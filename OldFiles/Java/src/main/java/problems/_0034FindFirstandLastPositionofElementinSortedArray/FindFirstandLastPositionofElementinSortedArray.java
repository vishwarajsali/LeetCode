package com.vishwaraj.OldFiles.Java.src.main.java.problems._0034FindFirstandLastPositionofElementinSortedArray;

import java.util.Arrays;

/**
 * FindFirstandLastPositionofElementinSortedArray
 */
public class FindFirstandLastPositionofElementinSortedArray {

    public static void main(String[] args) {
        int[] nums = {2,2};
        int target = 2;
        System.out.println(Arrays.toString(searchRang1(nums, target)));
    }

    // O(n)
    public static int[] searchRang1(int[] nums, int target) {
        int[] range = {-1,-1};
        boolean isFound = false;
        if(nums.length == 1 && nums[0] == target) return new int[] {0,0};
        for(int i = 0; i< nums.length; i++){

            if(nums[i] != target) isFound = false;
            if(nums[i] == target && !isFound){
                range[0] = i;
                isFound = true;
            }
            if(isFound){
                range[1] = i;
            }
        }
        return range;
    }


    int[] nums;
    int target;
    public int[] searchRange(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
        int[] range = {-1,-1};
        
        int leftInd = binarySearch(true);
        
        if(leftInd == nums.length || nums[leftInd] != target){
            return range;
        }
        
        range[0] = leftInd;
        range[1] = binarySearch(false)-1;
        
        return range;
    }
    
    public int binarySearch(boolean left){
        int lo = 0, hi = this.nums.length;
        
        while(lo< hi){
            int mid = (lo + hi)/2;
            if(nums[mid] > target ||(left && target == nums[mid])){
                hi = mid;
            } else lo = mid+1;
        }
        
        return lo;
    }
    
}