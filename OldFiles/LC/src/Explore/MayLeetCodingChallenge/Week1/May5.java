package com.vishwaraj.OldFiles.LC.src.Explore.MayLeetCodingChallenge.Week1;

import java.util.HashMap;
import java.util.Map;

/**
 * May5
 */
public class May5 {

    public static void main(String[] args) {
        System.err.println(firstUniqChar1("leetcode"));
    }

    public static int firstUniqChar1(String s) {
        int[] map = new int[26];

        for (char c : s.toCharArray()) {
            int index = (int) (c - 'a');
            map[index]++;
        }

        for (int i = 0; i < s.length(); i++) {
            int index = (int) (s.charAt(i) - 'a');
            if (map[index] == 1)
                return i;
        }

        return -1;
    }

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c));
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1)
                return i;
        }

        return -1;

    }
}