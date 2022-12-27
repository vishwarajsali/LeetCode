package com.vishwaraj.OldFiles.src.main.java.code.Other;

/**
 * Longest_Palindromic_Substring
 */
public class Longest_Palindromic_Substring {

    public static void main(String[] args) {
        String s = "babad";

        Longest_Palindromic_Substring lps = new Longest_Palindromic_Substring();

        System.out.println(lps.longestPalindrome(s));
    }

    public String longestPalindrome(String s) {
        int len = s.length();
        String res =null;
        
        boolean[][] freq = new boolean[len][len];

        for(int i = len -1; i>=0;i--){
            for(int j = i; j< len; j++){
                freq[i][j] = s.charAt(i) == s.charAt(j) && (j-i <3 || freq[i+1][j-1]);

                if(freq[i][j] && (res == null || j -i +1 > res.length())){
                    res = s.substring(i,j+1);
                }
            }
        }
        return res;
    }
}