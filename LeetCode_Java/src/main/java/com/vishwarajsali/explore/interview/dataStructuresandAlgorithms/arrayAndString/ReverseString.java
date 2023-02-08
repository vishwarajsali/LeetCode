package com.vishwarajsali.explore.interview.dataStructuresandAlgorithms.arrayAndString;

public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0, right = s.length-1;

        while(left < right ){

            char temp = s[left];

            s[left] = s[right];
            s[right] = temp;


            left++;
            right--;
        }
    }


    // Recursion
    public void reverseString1(char[] s) {
        helper(s, 0, s.length-1);
    }

    private void helper(char[] s , int left, int right){
        if(left >= right) return;
        char temp = s[left];
        s[left++] = s[right];
        s[right--] = temp;
        helper(s, left, right);
    }
}
