package com.vishwaraj.OldFiles.LC.src.Explore.MayLeetCodingChallenge.Week2;

/**
 * May8
 */
public class May8 {

    public static void main(String[] args) {
        int[][] coordinates  = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.println(checkStraightLine(coordinates));
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        int[] first = coordinates[0];
        int len = coordinates.length;
        int m = 0;
        for(int i = 2; i< len; i++){
            int[] curr = coordinates[i];
              if(i == 2) {
                  int[] second = curr;
                  int x  = (second[0] - first[0]), y =(second[1] - first[1]) ;
                  if(x == 0) return false;
                  m = y/x;   
                  continue;
              } 
              if(curr[1] != (m *(curr[0] - first[0]) + first[1])) return false;
            
            
        }
        
        return true;
    }
}