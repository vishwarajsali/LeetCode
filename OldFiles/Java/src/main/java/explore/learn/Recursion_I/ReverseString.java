package com.vishwaraj.OldFiles.Java.src.main.java.explore.learn.Recursion_I;

/**
 * ReverseString
 */
class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h', 'e'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        reverseString(s, 0, s.length-1);
       // System.out.println(s);
    }

    public static void reverseString(char[] s, int st, int e) {
        if(s == null || st> e) return;
        char temp = s[e];
        s[e] = s[st];
        s[st] = temp;
        reverseString(s, st+1, e-1);
    }
}