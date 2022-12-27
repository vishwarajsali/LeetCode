package com.vishwaraj.OldFiles.LC.src.Explore.April30DayLeetCodingChallenge.Week1;

import java.util.*;

/**
 * April6
 */
public class April6 {

    public static void main(String[] args) {
       String[] input =  {"eat", "tea", "tan", "ate", "nat", "bat"};
       System.out.println(groupAnagrams(input));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return null;
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            if(!map.containsKey(new String(c))){
                map.put(new String(c), new ArrayList<>());
            }
            map.get(new String(c)).add(s);
        }

        return new ArrayList(map.values());
    
    }
}