package com.vishwaraj.OldFiles.src.main.java.code.Other;

/**
 * Reverse_Integer
 */
public class Reverse_Integer {

    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int temp = x; 
        if(x < 0) temp *= -1;
        long reverseNum = 0;
        while(temp != 0){
            reverseNum = (reverseNum * 10) + (temp%10);
            temp /= 10;
        }
        if(x < 0) reverseNum *= -1;
        
        return reverseNum < Integer.MIN_VALUE || reverseNum > Integer.MAX_VALUE ? 0 : (int) reverseNum;
    }
}