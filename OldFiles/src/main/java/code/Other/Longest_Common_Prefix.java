package com.vishwaraj.OldFiles.src.main.java.code.Other;

/**
 * Longest_Common_Prefix
 */
public class Longest_Common_Prefix {

    public static void main(String[] args) {
        String[] strs = {"aa","aa"};
        //{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        
        StringBuffer result = new StringBuffer("");
        if (strs == null || strs.length == 0) return result.toString();
        int smallestWord = 0;
       for(int i = 1; i< strs.length; i++){
           if(strs[smallestWord].length() > strs[i].length()) smallestWord = i;
       }

       int i = 0;
       while( i< strs[smallestWord].length()){
           int j = 0;
           while(j< strs.length){
               
               if(strs[smallestWord].charAt(i) != strs[j].charAt(i)) return result.toString();
               
               j++;
           }
           result.append(strs[smallestWord].charAt(i));
           i++;
       }
       return result.toString();
       
   }
}