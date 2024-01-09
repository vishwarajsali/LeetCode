package com.vishwaraj.two_pointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _00011_ContainerWithMostWaterTest {
    _00011_ContainerWithMostWater test = new _00011_ContainerWithMostWater();

    @Test
    public void test_1(){

        Assertions.assertEquals( 49,test.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));

    }

    @Test
    public void test_2(){
        Assertions.assertEquals( 1,test.maxArea(new int[] {1,1}));

    }

}