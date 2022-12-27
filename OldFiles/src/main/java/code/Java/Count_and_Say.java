package com.vishwaraj.OldFiles.src.main.java.code.Java;
/**
 * Count_and_Say
 */
public class Count_and_Say {

    public static void main(String[] args) {
        System.out.print(CountandSay(5));
    }

    public static String CountandSay(int num){
        String str = "1";

        int i = 2;
        while(i<=num){
            StringBuilder temp = new StringBuilder();
            char prev = str.charAt(0);
            int counter = 1;
            int j = 1;
            while(j < str.length()){
                char ch = str.charAt(j);
                if (prev != ch) {
                    temp.append(counter);
                    temp.append(prev);
                    counter = 1;
                    prev = ch;
                } else counter ++;

                j++;
            }
            temp.append(counter);
            temp.append(prev);
            str = temp.toString();

            i++;
        }

        return str;
    }
}