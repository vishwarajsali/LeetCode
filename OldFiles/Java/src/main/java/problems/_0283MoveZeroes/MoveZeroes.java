package com.vishwaraj.OldFiles.Java.src.main.java.problems._0283MoveZeroes;

import java.util.Arrays;

/**
 * MoveZeroes
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums  ={0,1,0,3,12};

        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {

        int i = 0, j = 0;
        while(i < nums.length && j < nums.length){
            if(nums[i]== 0 && nums[j]!= 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            
            if(nums[i] != 0) i++;
            j++;
        }
    }
}