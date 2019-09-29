package Contest.WeeklyContest156;

import java.util.Arrays;

/**
 * GetEqualSubstringsWithinBudget
 */
public class GetEqualSubstringsWithinBudget {

    public static void main(String[] args) {
        String  s = "krrgw",
         t ="zjxss";
 
        int maxCost = 19;

        GetEqualSubstringsWithinBudget ge = new GetEqualSubstringsWithinBudget();
        System.out.println(ge.equalSubstring(s, t, maxCost));
    }

    public int equalSubstring(String s, String t, int maxCost) {

        if(s.length() == 0 || s.length()!= t.length()) return 0;
        
        int[] freq = new int[s.length()];

        for(int i = 0; i< s.length(); i++){
            freq[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

       boolean[][] dy = new boolean[freq.length][freq.length];


       for(int i = 0; i< freq.length; i++){
           for(int j = 0; j< freq.length; j++){
               dy[i][j] = freq[i]+freq[j] <= maxCost;
           }
       }

       int Mincount = Integer.MAX_VALUE;
       for(boolean[] i : dy){
           int count = 0;
           for(boolean j : i){
               if(j) count++;
           }
           
       }
       
        return Mincount;
    }
}