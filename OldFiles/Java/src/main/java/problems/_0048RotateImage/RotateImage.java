package com.vishwaraj.OldFiles.Java.src.main.java.problems._0048RotateImage;

import java.util.Arrays;

/**
 * RotateImage
 */
public class RotateImage {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        }

        int i = 0;
        
        while(i< n){
            int start = 0, end = n-1;
            while(start< end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start ++;
                end--;
            }

            i++;
        }
        

    }
}