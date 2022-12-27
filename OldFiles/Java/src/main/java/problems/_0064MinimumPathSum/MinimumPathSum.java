package com.vishwaraj.OldFiles.Java.src.main.java.problems._0064MinimumPathSum;

import java.util.Arrays;

/**
 * MinimumPathSum
 */
public class MinimumPathSum {

    public static void main(String[] args) {
        int[][] grid = {
            {1,2},
            {1,1}
        };
        
        /* {
            {1,3,1},
            {1,5,1},
            {4,2,1}
          }; */
        System.out.println(minPathSum(grid));
    } 
 
    public static int minPathSum(int[][] grid) {
         
 

        for(int row =0; row < grid.length; row++){
            for(int col = 0; col< grid[0].length; col++){ 
                if(row > 0 && col > 0) {
                    grid[row][col] += Math.min(grid[row-1][col] , grid[row][col-1]);
                } else if(row == 0 && col > 0){
                    grid[row][col] += grid[row][col-1];
                } else if(row > 0 && col == 0){
                    grid[row][col] += grid[row-1][col];
                }
            }
        } 

        return grid[grid.length-1][grid[0].length-1];
    }

    
}