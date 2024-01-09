package com.vishwaraj.array_hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _00217_ContainsDuplicateTest {

    _00217_ContainsDuplicate test = new _00217_ContainsDuplicate();

    @Test
    public void test_1(){
        int[] nums = new int[] {1,2,3,1};
        Assertions.assertTrue(test.containsDuplicate(nums));

    }

    @Test
    public void test_2(){
        int[] nums = new int[] {1,2,3,4};
        Assertions.assertFalse(test.containsDuplicate(nums));
    }

    @Test
    public void test_3(){
        int[] nums = new int[] {1,1,1,3,3,4,3,2,4,2};
        Assertions.assertTrue(test.containsDuplicate(nums));

    }
}