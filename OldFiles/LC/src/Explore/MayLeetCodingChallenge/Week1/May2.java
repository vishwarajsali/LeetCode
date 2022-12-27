package com.vishwaraj.OldFiles.LC.src.Explore.MayLeetCodingChallenge.Week1;

import java.util.ArrayList;
import java.util.List;

/**
 * May2
 */
public class May2 {

    public int numJewelsInStones(String J, String S) {
        List<Character> list = new ArrayList<>();
        for (char c : J.toCharArray()) {
            list.add(c);
        }
        int count = 0;
        for (char c : S.toCharArray()) {
            if (list.contains(c))
                count++;
        }
        return count;
    }
}