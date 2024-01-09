package com.vishwaraj.array_hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _00049_GroupAnagramsTest {

    _00049_GroupAnagrams test = new _00049_GroupAnagrams();


    @Test
    public void test_1(){
        List<List<String>> list
                = List.of(List.of("bat"),List.of("nat","tan"),List.of("ate","eat","tea"));
        Assertions.assertArrayEquals(test.groupAnagrams(
                new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}
        ).toArray(), list.toArray());
    }

    @Test
    public void test_2(){
        List<List<String>> list
                = List.of(List.of(""));
        Assertions.assertArrayEquals(test.groupAnagrams(
                new String[]{""}
        ).toArray(), list.toArray());
    }

    @Test
    public void test_3(){
        List<List<String>> list
                = List.of(List.of("a"));
        Assertions.assertArrayEquals(test.groupAnagrams(
                new String[]{"a"}
        ).toArray(), list.toArray());

    }
}