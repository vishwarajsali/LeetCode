package com.vishwaraj.OldFiles.src.main.java.code.Other;

/**
 *  Search_Insert_Position
 */
public class  Search_Insert_Position {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        //{1,3,5,6};
        int target = 7;
        //5;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target) {
        
        int i = 0;
        while(i < nums.length && nums[i] < target){
            if(nums[i] == target) return i;
            i++;
        }

        return i;
    }
}