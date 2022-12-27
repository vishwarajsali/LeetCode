package com.vishwaraj.OldFiles.src.main.java.code.Other;

/**
 * Count_and_Say
 */
public class Count_and_Say {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n) {
        String str = "1";
        int i = 2;

        while (i <= n) {
            StringBuilder temp = new StringBuilder();
            char prev = str.charAt(0);
            int count = 1;
            int j = 1;
            while (j < str.length()) {
                char curr = str.charAt(j);
                if(prev != curr){
                    temp.append(count);
                    temp.append(prev);
                    count =1;
                    prev = curr;
                } else count++;
                j++;
            }

            temp.append(count);
            temp.append(prev);

            str = temp.toString();

            i++;
        }

        return str;
    }
}