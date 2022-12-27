package com.vishwaraj.OldFiles.Java.src.main.java.problems._0680ValidPalindromeII;

/**
 * ValidPalindromeII
 */
public class ValidPalindromeII {

    public static void main(String[] args) {
        String s = "ebcbbececabbacecbbcbe";

        // String start = s.substring(0, 20) + s.substring(20), end = s.substring(0, 81)
        // + s.substring(82);
        // System.out.println(palindrome(start));
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        int c = 0;
        if (!palindrome(s)) {
            int start = 0, end = s.length() - 1;

            char[] a = s.toCharArray();
            while (start < end) {
                if (a[start] != a[end]) {

                    if (palindrome(s.substring(0, end) + s.substring(end + 1))) {
                        c++;
                    }
                    if (palindrome(s.substring(0, start) + s.substring(start + 1))) {
                        c++;
                    }
                }

                start++;
                end--;

            }

        }

        return c < 2;

    }

    public static boolean palindrome(String s) {
        System.out.println(s);
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}