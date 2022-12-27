package com.vishwaraj.OldFiles.src.main.java.code.Java1.Problems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Problems1_10Test {
    Problems1_10 problems1_10 = new Problems1_10();
    @Test
    void twoSum() {

        int[] nums = {2, 7, 11, 15}; int target = 9;

        String  result = Arrays.toString(problems1_10.twoSum(nums, target));
        Assert.assertEquals("[0, 1]", result);
    }
}