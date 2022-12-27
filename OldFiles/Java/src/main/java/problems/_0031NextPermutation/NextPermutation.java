package com.vishwaraj.OldFiles.Java.src.main.java.problems._0031NextPermutation;

import java.util.Arrays;

/**
 * NextPermutation
 */
public class NextPermutation {

    public static void main(String[] args) {
        
        int nums[] = {1,2,3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
       
        int len = nums.length-1;
        int i = len-1;
        while(i >= 0 && nums[i]>= nums[i+1]) i--;

        if(i >= 0){
            int j = len;
            while(j >= 0 && nums[j] <= nums[i]) j--;

            swap(i, j, nums);
        }
    }

    private static void swap(int i , int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


}