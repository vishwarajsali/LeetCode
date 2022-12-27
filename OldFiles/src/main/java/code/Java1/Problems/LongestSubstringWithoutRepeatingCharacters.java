package com.vishwaraj.OldFiles.src.main.java.code.Java1.Problems;

import java.util.HashMap;

/**
 * LongestSubstringWithoutRepeatingCharacters
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String[] input  = {"abcabcbb","bbbbb","pwwkew", " "};
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();

        for(String i : input){
            
           System.out.printf("%s  %d \n" ,i ,l.lengthOfLongestSubstring(i));   
        }
    }

    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) return 1;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0, j = 0;
        for(int i =0; i < s.length(); i++){
           if(map.containsKey(s.charAt(i))) j = Math.max(j, map.get(s.charAt(i))+1);
           map.put(s.charAt(i), i);
           maxLength = Math.max(maxLength, i-j+1);
           

        }


        return maxLength;
    }
}