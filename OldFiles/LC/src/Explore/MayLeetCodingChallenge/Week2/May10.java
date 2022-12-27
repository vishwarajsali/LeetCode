package com.vishwaraj.OldFiles.LC.src.Explore.MayLeetCodingChallenge.Week2;

public class May10 {

    public static void main(String[] args) {
        System.out.println(findJudge(3, new int[][] {{1,3},{2,3}}));
    }

    public static int findJudge(int N, int[][] trust) {
        int[] trusts = new int[N+1];
 
         for(int[] t : trust){
             trusts[t[0]]++; 
             trusts[t[1]]--; 
 
         }
         
 
         for(int i = 1; i< trusts.length; i++){
             if( trusts[i] == -(N-1)) return i;
         }
         
         return -1;
          
      }
}