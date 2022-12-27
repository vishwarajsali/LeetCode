package com.vishwaraj.OldFiles.Java.src.main.java.problems._0010RegularExpressionMatching;

/**
 * RegularExpressionMatching
 */
public class RegularExpressionMatching {

    public static void main(String[] args) {
        String[] p ={"ab"},
        s = {".*"};
        //String s = "mississippi",p = "mis*is*p*.";
        //s = "aa",p = "a*";
        for(int i = 0; i< p.length; i++){
        System.out.println(isMatch(s[i], p[i]));
        }
    }

    // Recursive
    public static boolean isMatchR(String s, String p) {
        
        if(p.isEmpty()) return s.isEmpty();
        boolean first_match = (!s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));


        if(p.length() >= 2 && p.charAt(1) == '*'){
            return isMatchR(s, p.substring(2)) || (first_match && isMatchR(s.substring(2), p)); 
        }  else return first_match && isMatchR(s.substring(1), p.substring(1));
    }
    
    //Dynamic Programming
    public static boolean isMatch(String s, String p) {

        if(p.isEmpty()) return s.isEmpty();
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];

        if(s.charAt(0) == p.charAt(0)) dp[0][0] = true;
        for(int i = 0; i< s.length(); i++){
            for(int j = 0; j< p.length(); j++){
                if (p.charAt(j) == '.') {
                    dp[i+1][j+1] = dp[i][j];
                }
                if (p.charAt(j) == s.charAt(i)) {
                    dp[i+1][j+1] = dp[i][j];
                }
                if(p.charAt(j) == '*'){
                    dp[i+1][j+1] = dp[i][j];
                }
                
            }
        }
        return dp[s.length()][p.length()];
    }
}