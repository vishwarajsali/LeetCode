package com.vishwaraj.binary_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    BinarySearch test = new BinarySearch();

    @Test
    public void test_1(){
        Assertions.assertEquals(2, test.search( new ArrayList<Integer>(
                Arrays.asList(1, 2, 3,4)), 3));

    }

}