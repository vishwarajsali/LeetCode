package com.vishwaraj.OldFiles.src.main.java.code.Other;

/**
 * Palindrome_Number
 */
public class Palindrome_Number {

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int temp = x; 
        if(x < 0) temp *= -1;
        long reverseNum = 0;
        while(temp != 0){
            reverseNum = (reverseNum * 10) + (temp%10);
            temp /= 10;
        }

        return x == reverseNum;
    }
}