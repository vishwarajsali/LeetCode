package com.vishwaraj.array_hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _00347_TopKFrequentElementsTest {

    _00347_TopKFrequentElements test = new _00347_TopKFrequentElements();

    @Test
    public void test_1(){

        Assertions.assertArrayEquals(new int[] {1,2},test.topKFrequent(new int[]{1,1,1,2,2,3}, 2));

    }

    @Test
    public void test_2(){
        Assertions.assertArrayEquals(new int[] {1},test.topKFrequent(new int[]{1}, 1));

    }

    @Test
    public void test_3(){

        Assertions.assertArrayEquals(new int[] {1,2},test.topKFrequent(new int[]{1,1,1,2,2,3}, 2));


    }
}