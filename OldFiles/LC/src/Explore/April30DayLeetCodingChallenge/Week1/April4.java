package com.vishwaraj.OldFiles.LC.src.Explore.April30DayLeetCodingChallenge.Week1;

/**
 * April4
 */
public class April4 {

    public static void main(String[] args) {
        
    }

    public void moveZeroes(int[] nums) {
        int len = nums.length;
        for(int i = 0; i< len-1; i++){
            for(int j = i+1; j < len; j++){
                if(nums[i] == 0 && nums[j] != 0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
    }
}