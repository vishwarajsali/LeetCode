package com.vishwaraj.array_hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _00001_TwoSumTest {

    _00001_TwoSum test = new _00001_TwoSum();

    @Test
    public void test_1(){

        Assertions.assertArrayEquals(new int[] {0,1},test.twoSum(new int[]{2,7,11,15}, 9));

    }

    @Test
    public void test_2(){
        Assertions.assertArrayEquals(new int[] {1,2},test.twoSum(new int[]{3,2,4}, 6));

    }

    @Test
    public void test_3(){
        Assertions.assertArrayEquals(new int[] {0,1},test.twoSum(new int[]{3,3}, 6));


    }

}