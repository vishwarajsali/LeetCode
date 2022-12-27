package com.vishwarajsali.problems.all;

public class _0000009_Palindrome_Number {



    // reverse number and verify with initial number
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        int reverseNumber = 0;
        int curr = x;
        while(curr != 0){
            reverseNumber = reverseNumber * 10 + curr % 10;
            curr/=10;
        }

        return x == reverseNumber;
    }

    // added in the string and verify first and last digit
    public boolean isPalindrome_1(int x) {
        String s = Integer.toString(x);
        int start = 0;
        int end = s.length()-1;

        while(start<=end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
