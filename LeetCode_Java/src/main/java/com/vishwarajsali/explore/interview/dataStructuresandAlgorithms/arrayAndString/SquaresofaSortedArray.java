package com.vishwarajsali.explore.interview.dataStructuresandAlgorithms.arrayAndString;

public class SquaresofaSortedArray {


    public int[] sortedSquares1(int[] nums) {
        int[] result = new int[nums.length];

        //try to sort the array with two pointer

        int left = 0, right = nums.length-1;
        int index = nums.length-1;
        while(left <= right){
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];

            if(leftsq > rightsq){
                result[index] = leftsq;
                left++;
            }else {
                result[index] = rightsq;
                right--;
            }

            index--;
        }

        return result;
    }


    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        // sq of array

        for(int i = 0; i< nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        //try to sort the array with two pointer

        int left = 0, right = nums.length-1;
        int index = nums.length-1;
        while(left <= right){
            if(nums[left] > nums[right]){
                result[index] = nums[left];
                left++;
            }else {
                result[index] = nums[right];
                right--;
            }

            index--;
        }

        return result;
    }



    // recursion
    public int[] sortedSquares2(int[] nums) {
        int[] result = new int[nums.length];

        //try to sort the array with two pointer
        int n = nums.length-1;
        helper(nums, result, 0, n, n);
        return result;
    }

    private void helper(int[] nums, int[] result, int left , int right, int index){
        if(left > right) return;

        int leftSq = nums[left] * nums[left];
        int rightSq = nums[right] * nums[right];

        if(leftSq > rightSq) {
            result[index] = leftSq;
            left++;
        }else{
            result[index] = rightSq;
            right--;
        }
        index--;
        helper(nums, result, left, right, index);
    }
}
