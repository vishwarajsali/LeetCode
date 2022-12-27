package com.vishwaraj.OldFiles.Java.src.main.java.problems._0055JumpGame;

/**
 * JumpGame
 */
public class JumpGame {

    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
 
    public static boolean canJump(int[] nums) {
       int goodIndex = 0;
       int n = nums.length;
       for(int i = 0; i< n; i++){
           if(nums[i] > goodIndex){
               goodIndex = i;
           }
       }

       return goodIndex == n-1;
    }


}