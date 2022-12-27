package com.vishwaraj.OldFiles.Java.src.main.java.problems._0075SortColors;

/**
 * SortColors
 */
public class SortColors {

    public static void main(String[] args) {
        SortColors s = new SortColors();
        int[] nums = {};
        s.sortColors(nums);

    }

 
    public void sortColors(int[] nums) {
        int start = 0, curr = 0, end = nums.length-1;
        int temp;
        while(curr<= end){
            if(nums[curr]==0){
                temp = nums[start];
                nums[start++] = nums[curr];
                nums[curr++] = temp;
            } else if(nums[curr] == 2){
                temp = nums[curr];
                nums[curr] = nums[end];
                nums[end--] = temp;
            }
            else curr++;
        }
    }

 
}