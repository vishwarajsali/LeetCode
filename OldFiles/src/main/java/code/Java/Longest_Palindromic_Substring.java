package com.vishwaraj.OldFiles.src.main.java.code.Java;

import java.util.HashSet;
import java.util.Set;

/**
 * Longest_Palindromic_Substring
 */
public class Longest_Palindromic_Substring {

    public static void main(String[] args) {
        String s = "bab";
        longestPalindrome(s);
    }

    public static void longestPalindrome(String s) {

        Set<String> palindrome = new HashSet<String>();
        for(int i = 0; i< s.length(); i++){
            for (int j = i+1; j<= s.length(); j++){
                if(isPalindrom(s.substring(i, j))){
                    palindrome.add(s.substring(i, j));
                }
            }
        }

        System.out.print(palindrome);
    }

    public static boolean isPalindrom(String input){
        StringBuilder plain = new StringBuilder(input);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(input);
    }
}