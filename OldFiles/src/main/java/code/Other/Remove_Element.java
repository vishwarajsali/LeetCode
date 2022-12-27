package com.vishwaraj.OldFiles.src.main.java.code.Other;

import java.util.Arrays;


/**
 * Remove_Element
 */
public class Remove_Element {

    public static void main(String[] args) {
        int[] nums = //{0,1,2,2,3,0,4,2};
        {3,2,2,3};
        int val = 2;

        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int pos = 0, curr = 0;
        while(pos < nums.length){

            if(nums[curr] == val & nums[pos] != val){
                int temp = nums[curr];
                nums[curr] = nums[pos];
                nums[pos] = temp;
                count++;
                curr++;
            } 
            if(nums[pos]!= val){
           count++;
            curr++;
            }
                      
            pos++;
            
        }
        System.out.println(Arrays.toString(nums));

        return count;

        // More Simpler version of my solution
        
        // int  j =0;
		// for(int i: nums){
		// 	if(i != val){
		// 		nums[j] = i;
		// 		j++;
		// 	}
		// }
		// return j;
    }
}