package com.vishwaraj.OldFiles.LC.src.Explore.MayLeetCodingChallenge.Week3;

import java.util.ArrayList;
import java.util.List;

public class May15 {
    public static void main(String[] args) {
        System.out.println(maxSubarraySumCircular(new int[] {1,-2,3,-2}));
    }

    public static int maxSubarraySumCircular(int[] A) {
        List<Integer> list = new ArrayList<>();

        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i< A.length-1; i++){
            int sum = A[i];  
            for(int j = i; j< A.length; j++){  
                
                sum += A[j]; 
                if(list.contains(A[j])){
                    maxSum = Math.max(maxSum, sum);
                    break;
                }
            }
            
            maxSum = Math.max(maxSum, sum);

            list.clear();
        }

        return maxSum;
    }
}  