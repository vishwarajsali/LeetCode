package com.vishwarajsali.problems.all;

import java.util.HashMap;
import java.util.Map;

public class _000000013_Roman_to_Integer {

    public int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> romanMap  = new HashMap<>() {{
            put('M', 1000);
            put('D', 500);
            put('C', 100);
            put('L', 50);
            put('X', 10);
            put('V', 5);
            put('I', 1);

        }};

        for(int i = 0; i< s.length(); i++){
            int curr = romanMap.get(s.charAt(i));
            int next = i < s.length()-1 ? romanMap.get(s.charAt(i+1)) : romanMap.get(s.charAt(i));
            int sum = curr >= next ? curr : -curr;

            result += sum;

        }

        return result;
    }
}
