package problems._0017LetterCombinationsofaPhoneNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LetterCombinationsofaPhoneNumber
 */
public class LetterCombinationsofaPhoneNumber {

    public static void main(String[] args) {

        String digits = "234";
        System.out.println(letterCombinations(digits));

    }

    static Map<String, String> map = new HashMap<>() {
        {
            put("2", "abc");
            put("3", "def");
            put("4", "ghi");
            put("5", "jkl");
            put("6", "mno");
            put("7", "pqrs");
            put("8", "tuv");
            put("9", "wxyz");

        }
    };
    static List<String> result = new ArrayList<>();

    public static List<String> letterCombinations(String digits) {
        // if (digits.length() == 1) {
        //     combination(map.get(digits.substring(0, 1)),"");
        //     return result;
        // }

        for (int i = 0; i < digits.length(); i++) {
            String s1 = map.get(digits.substring(i, i + 1));
            String[] s2 = new String[result.size()];
            result.toArray(s2);
            result.clear();
            combination(s1, s2);
            
        }

        return result;
    }

    public static void combination(String s1, String[] s2) {

    
        for (int i = 0; i < s1.length(); i++) {
            String list1 = s1.substring(i, i + 1);
            for (int j = 0; j < s2.length; j++) {
                list1 = s1.substring(i, i + 1);
                list1= s2[j] + list1;
                result.add(list1);
            }
            if(list1.length() == 1) result.add(list1);
        }

    }

}