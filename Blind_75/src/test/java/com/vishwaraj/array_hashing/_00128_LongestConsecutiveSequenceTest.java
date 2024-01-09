package com.vishwaraj.array_hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _00128_LongestConsecutiveSequenceTest {

    _00128_LongestConsecutiveSequence test = new _00128_LongestConsecutiveSequence();

    @Test
    public void test_1(){

        Assertions.assertEquals(4,test.longestConsecutive(new int[]{100,4,200,1,3,2}));

    }

    @Test
    public void test_2(){
        Assertions.assertEquals(9,test.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));

    }
}