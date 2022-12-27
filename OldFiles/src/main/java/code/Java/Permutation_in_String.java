package com.vishwaraj.OldFiles.src.main.java.code.Java;

import java.lang.System;;

/**
 * Permutation_in_String
 */
public class Permutation_in_String {

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidba";
        checkInClusion(s1, s2);
    }

    public static boolean checkInClusion(String s1, String s2){

        String temp = "";
        boolean permu = true;
        if (s1.length() <= s2.length()){
            for (int i = 0; i<= s1.length(); i++){
                int j = 0;
                while(permu){
                    if(s1.charAt(i)== s2.charAt(j)){
                        permu = true;
                    } else permu = false;

                    j++;
                }
            }
        }

        return permu;
    }
}