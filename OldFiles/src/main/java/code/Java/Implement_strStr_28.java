package com.vishwaraj.OldFiles.src.main.java.code.Java;
/*
 *
 * 	Implement strStr().

	Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

	Example 1:

	Input: haystack = "hello", needle = "ll"
	Output: 2
	Example 2:

	Input: haystack = "aaaaa", needle = "bba"
	Output: -1
	Clarification:

	What should we return when needle is an empty string? This is a great question to ask during an interview.

	For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 *
 */


public class Implement_strStr_28 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String haystack = "hello", needle = "ll";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }

        //return haystack.indexOf(needle);
    }
}
