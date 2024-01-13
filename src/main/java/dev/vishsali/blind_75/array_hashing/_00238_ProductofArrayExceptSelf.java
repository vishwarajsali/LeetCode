package com.vishwaraj.array_hashing;

public class _00238_ProductofArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

//        run start -> end and multiple each index from the nums
        res[0] = 1;
        for(int i = 1; i < nums.length; i++) res[i] = res [ i-1] * nums[i-1];

//        run end -> start and multiple each index from nums and add it to the res

        int product = 1;
        for(int i = nums.length-1; i>=0; i--){
            res[i] = product * res[i];

            product *= nums[i];
        }

        return res;
    }
}
