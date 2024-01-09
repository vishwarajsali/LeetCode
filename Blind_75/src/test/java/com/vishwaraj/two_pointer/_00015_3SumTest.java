package com.vishwaraj.two_pointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _00015_3SumTest {

    _00015_3Sum test = new _00015_3Sum();

    @Test
    public void test_1(){
        Assertions.assertArrayEquals(List.of(List.of(-1,-1,2),List.of(-1,0,1)).toArray(), List.of(test.threeSum(new int[]{-1, 0, 1, 2, -1, -4})).toArray());

    }

    @Test
    public void test_2(){
        Assertions.assertArrayEquals(List.of(0,0,0).toArray(), List.of(test.threeSum(new int[]{0,0,0})).toArray());

    }

    @Test
    public void test_3(){
        Assertions.assertArrayEquals(List.of().toArray(), List.of(test.threeSum(new int[]{-0,1,1})).toArray());

    }
}