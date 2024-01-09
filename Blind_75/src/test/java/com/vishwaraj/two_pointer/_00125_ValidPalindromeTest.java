package com.vishwaraj.two_pointer;

import com.vishwaraj.array_hashing._00001_TwoSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _00125_ValidPalindromeTest {

    _00125_ValidPalindrome test = new _00125_ValidPalindrome();

    @Test
    public void test_1(){

        Assertions.assertTrue(test.isPalindrome("A man, a plan, a canal: Panama"));

    }

    @Test
    public void test_2(){
        Assertions.assertFalse(test.isPalindrome("race a car"));

    }

    @Test
    public void test_3(){
        Assertions.assertTrue(test.isPalindrome(" "));


    }
}