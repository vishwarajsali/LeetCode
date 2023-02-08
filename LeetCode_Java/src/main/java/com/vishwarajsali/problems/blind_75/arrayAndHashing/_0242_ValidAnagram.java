package com.vishwarajsali.problems.blind_75.arrayAndHashing;

import java.util.HashMap;
import java.util.Map;

public class _0242_ValidAnagram {


    // With One for loop and array
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
            map[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < map.length; i++) {
            if(map[i] != 0) return false;
        }
        return true;
       /* if (s.length() != t.length()) return false;

        int[] map = new int[26];

        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 97]++;
        }


        for (int i = 0; i < t.length(); i++) {
            map[t.charAt(i) - 97]--;
            if (map[t.charAt(i) - 97] < 0) return false;
        }

        return true;*/
    }


    //WIth a map
    public boolean isAnagram2(String s, String t) {
        /*if (s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }


        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);

            if (map.get(t.charAt(i)) < 0) return false;
        }

        return true;*/

        if(s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap();

        for(int i = 0; i< s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);

            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)-1);

        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() < 0) return false;
        }

        return true;
    }


    // brute force
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isExist = false;
            for (int j = 0; j < t.length(); j++) {
                if (c == t.charAt(j)) {
                    t = t.substring(0, j) + t.substring(j + 1);
                    isExist = true;
                    break;

                }
            }

            if (!isExist) return false;
        }
        return true;
    }
}
