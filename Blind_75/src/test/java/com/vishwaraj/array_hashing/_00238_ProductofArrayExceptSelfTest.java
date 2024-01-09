package com.vishwaraj.array_hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _00238_ProductofArrayExceptSelfTest {

    _00238_ProductofArrayExceptSelf test = new _00238_ProductofArrayExceptSelf();

    @Test
    public void test_1(){

        Assertions.assertArrayEquals(new int[] {24,12,8,6},test.productExceptSelf(new int[]{1,2,3,4}));

    }

    @Test
    public void test_2(){
        Assertions.assertArrayEquals(new int[] {0,0,9,0,0},test.productExceptSelf(new int[]{-1,1,0,-3,3}));

    }

}