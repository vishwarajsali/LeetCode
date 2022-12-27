package com.vishwarajsali.problems.all;

public class _000000014_Longest_Common_Prefix {

    // Find the shortest word
    // iterate the len of the shortest word with each string
    // verify  each char if that char is same as the first word
    // if char is same add to string
    // if char is not same return the prefix

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";

        StringBuffer prefix = new StringBuffer();

        String firstWord = strs[0];

        int prefixLen = prefixLen(strs);

        for (int i = 0; i < prefixLen; i++) {
            char c = firstWord.charAt(i);
            for (String s : strs) {
                char curr = s.charAt(i);
                if (c != curr) return prefix.toString();
            }

            prefix.append(c);
        }

        return prefix.toString();
    }

    private int prefixLen(String[] strs) {
        int len = strs[0].length();

        for (String s : strs) {
            len = Math.min(len, s.length());
        }

        return len;
    }
}
