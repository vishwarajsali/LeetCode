package com.vishwaraj.OldFiles.src.main.java.code.Java1.Problems;

import com.vishwaraj.OldFiles.src.main.java.code.Java1.LeetCodeLib.AssortedMethods;
import com.vishwaraj.OldFiles.src.main.java.code.Java1.LeetCodeLib.ListNode;

import org.junit.jupiter.api.Test;

class ProblemsTest {
    Problems problems = new Problems();
    @Test
    void isMatch1() {
        String s = "ab", p = ".*";

        boolean result = problems.isMatch(s, p);
        Assert.assertEquals(true, result);
    }
    @Test
    void isMatch2() {
        String s = "mississippi",
        p ="mis*is*p*.";

        boolean result = problems.isMatch(s, p);
        Assert.assertEquals(false, result);
    }

    @Test
    void lengthOfLongestSubstring() {
        String[] input  = {"abcabcbb","bbbbb","pwwkew", " "};
        int[] result = {3,1,3,1};
        for(int i = 0; i< input.length; i++){

            Assert.assertEquals(result[i], problems.lengthOfLongestSubstring(input[i]));
        }

    }

    @Test
    void addTwoNumbers() {
        int[] array1 = {9,9,9};
        int[] array2 = {1};

        ListNode l1, l2 ,l3;
        l1 = AssortedMethods.createListToArray(array1);
        l2 = AssortedMethods.createListToArray(array2);

        String result =  AssortedMethods.printLinklist(problems.addTwoNumbers(l1, l2));

        Assert.assertEquals("0001",result);
    }


}