package com.vishwaraj.array_hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _00242_ValidAnagramTest {

    _00242_ValidAnagram test = new _00242_ValidAnagram();

    @Test
    public void test_1(){

        Assertions.assertTrue(test.isAnagram("anagram", "nagaram"));

    }

    @Test
    public void test_2(){

        Assertions.assertFalse(test.isAnagram("rat", "car"));
    }

    @Test
    public void test_3(){

        Assertions.assertTrue(test.isAnagram("anagram", "nagaram"));

    }

}