package com.vishwaraj.OldFiles.LC.src.Explore.MayLeetCodingChallenge.Week1;

import java.util.HashMap;
import java.util.Map;

/**
 * May3
 */
public class May3 {

    public static void main(String[] args) {

    }

    // more optimized
    public boolean canConstruct2(String ransomNote, String magazine) {
        
        int[] arr = new int[26];
        
        for(char c : magazine.toCharArray()){
            arr[c - 'a']++;
        }
        
        for(char c : ransomNote.toCharArray()){
              arr[c - 'a']--;
            if(arr[c - 'a'] < 0) return false;
        }
        
        
        return true;
        
    }

    // less memory 
    public boolean canConstruct1(String ransomNote, String magazine) {

        int[] arr = new int[26];

        for (char c : magazine.toCharArray()) {
            arr[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            arr[c - 'a']--;
        }

        for (int i : arr) {
            if (i < 0)
                return false;
        }

        return true;

    }

    //more momory 
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();

        for (char c : ransomNote.toCharArray()) {
            if (!ransomMap.containsKey(c)) {
                ransomMap.put(c, 0);
            }
            ransomMap.put(c, ransomMap.get(c) + 1);
        }

        for (char c : magazine.toCharArray()) {
            if (!magazineMap.containsKey(c)) {
                magazineMap.put(c, 0);
            }
            magazineMap.put(c, magazineMap.get(c) + 1);
        }

        for (char c : ransomNote.toCharArray()) {

            if (!ransomMap.containsKey(c) || !magazineMap.containsKey(c) || ransomMap.get(c) > magazineMap.get(c))
                return false;
        }
        return true;
    }
}