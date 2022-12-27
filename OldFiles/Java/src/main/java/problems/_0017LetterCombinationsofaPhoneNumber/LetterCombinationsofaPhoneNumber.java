package com.vishwaraj.OldFiles.Java.src.main.java.problems._0017LetterCombinationsofaPhoneNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * LetterCombinationsofaPhoneNumber
 */
public class LetterCombinationsofaPhoneNumber {

    public static void main(String[] args) {

        String digits = "234";
        System.out.println(letterCombinations(digits));

    }

    // map with the values on the dial
    public static List<String> letterCombinations(String digits) {
        String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> result = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            String s1 = map[Integer.parseInt(digits.substring(i, i + 1))];
            String[] s2 = new String[result.size()];
            result.toArray(s2);
            result = combination(s1, s2);
        }

        return result;
    }

    private static List<String> combination(String s1, String[] s2) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            String list1 = s1.substring(i, i + 1);
            for (int j = 0; j < s2.length; j++) {
                list1 = s1.substring(i, i + 1);
                list1 = s2[j] + list1;
                list.add(list1);
            }
            if (list1.length() == 1)
                list.add(list1);
        }
        return list;
    }

    // map with the ASCII values
    public static List<String> letterCombinations1(String digits) {

        List<String> result = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            int s1 = Integer.parseInt(digits.substring(i, i + 1));
            String[] s2 = new String[result.size()];
            result.toArray(s2);
            result = combination(s1, s2);
        }

        return result;
    }

    private static List<String> combination(int s1, String[] s2) {
        int[] map2 = { 0, 0, 97, 100, 103, 106, 109, 112, 116, 119, 123 };
        List<String> list = new ArrayList<>();
        for (int i = map2[s1]; i < map2[s1 + 1]; i++) {
            String list1 = Character.toString((char) i);
            for (int j = 0; j < s2.length; j++) {
                list1 = Character.toString((char) i);
                list1 = s2[j] + list1;
                list.add(list1);
            }
            if (list1.length() == 1)
                list.add(list1);
        }
        return list;
    }

}