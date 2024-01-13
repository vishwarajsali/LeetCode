package com.vishwaraj.array_hashing;

import java.util.*;

public class _00049_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] chr = str.toCharArray();
            Arrays.sort(chr);
            String sortedString = Arrays.toString(chr);

            if(!map.containsKey(sortedString)){
                map.put(sortedString, new ArrayList<>());
            }

            map.get(sortedString).add(str);

        }

        return new ArrayList<>(map.values());
    }
}
