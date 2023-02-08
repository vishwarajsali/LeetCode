package com.vishwarajsali.problems.topinterviewquestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _000000003_Longest_Substring_Without_Repeating_Characters {


    // Sliding window
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        int right = 0, left = 0, res = 0;

        while (right < s.length()) {
            char r = s.charAt(right);
            map.put(r, map.getOrDefault(r, 0) + 1);

            while (map.get(r) > 1) {
                char l = s.charAt(left);
                map.put(l, map.get(l) - 1);

                left++;
            }

            res = Math.max(res, right - left + 1);
            right++;
        }

        return res;
    }

    String s;

    public int lengthOfLongestSubstring2(String s) {
        this.s = s;
        if (s.length() == 1) return 1;
        int maxlen = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j <= s.length(); j++) {

                if (isUniq(i, j)) {
                    maxlen = Math.max(maxlen, j - i);
                }
            }
        }


        return maxlen;
    }


    //using Set and one for loop
    private boolean isUniq(int i, int j) {
        Set<Character> set = new HashSet<>();
        for (int x = i; x < j; x++) {
            if (set.contains(s.charAt(x))) return false;
            set.add(s.charAt(x));
        }

        return true;
    }

    public int lengthOfLongestSubstring1(String s) {

        if (s.length() == 1) return 1;
        int maxlen = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j <= s.length(); j++) {

                if (isRepeating1(s.substring(i, j))) {
                    maxlen = Math.max(maxlen, j - i);
                }
            }
        }


        return maxlen;
    }

    private boolean isRepeating1(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) return false;
            }
        }

        return true;
    }
}
