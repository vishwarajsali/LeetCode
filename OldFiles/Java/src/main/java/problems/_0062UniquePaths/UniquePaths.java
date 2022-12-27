package com.vishwaraj.OldFiles.Java.src.main.java.problems._0062UniquePaths;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * UniquePaths
 */
public class UniquePaths {

    public static void main(String[] args) {
        System.out.println( uniquePaths(2, 3));
    }

    
    public static int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        Arrays.stream(memo).forEach(a -> Arrays.fill(a,1));


        for(int row = 1; row < m; row++){
            for(int col = 1; col< n; col++){
                memo[row][col] = memo[row-1][col]+ memo[row][col-1];
            }
        }

        return memo[m-1][n-1];
    }

   
    
}