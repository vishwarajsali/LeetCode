package com.vishwaraj.OldFiles.src.main.java.code.Other;

/**
 * Implement_strStr
 */
public class Implement_strStr {
    public static void main(String[] args) {
        String  haystack = "mississippi", needle = "pi";
        //haystack = "aaa", needle = "a";
        //haystack = "a", needle = "a";
        //haystack = "aaaaa", needle = "bba";
        //haystack = "hello", needle = "ll";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {

        int needleLen = needle.length(), haystackLen = haystack.length();

        if (needleLen == 0) return 0;

        int i = 0;

        if(haystackLen == needleLen) {
            if(haystack.equals(needle)) return 0;
            
            return -1;
        }

        while (i< (haystackLen - needleLen)+1 ){
            if (haystack.substring(i, i+needleLen).equals(needle)) {
                return i;
            }

            i++;
        }


        return -1;
    }
}