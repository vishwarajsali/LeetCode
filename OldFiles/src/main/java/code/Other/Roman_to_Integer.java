package com.vishwaraj.OldFiles.src.main.java.code.Other;

import java.util.HashMap;

/**
 * Roman_to_Integer
 */
public class Roman_to_Integer {

    public static void main(String[] args) {
        String s = "IV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        HashMap <Character, Integer> Roman = new HashMap<>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        
        int sum = 0;
        int i = s.length()-1;
        int previous = 0;

        while(i>=0){
            int actual = Roman.get(s.charAt(i));
            if (previous <= actual)  sum += actual;
            else sum -= actual;
            i--;
            previous = actual;
        }

        return sum;
    }
}