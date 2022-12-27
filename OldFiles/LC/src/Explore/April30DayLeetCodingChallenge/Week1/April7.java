package com.vishwaraj.OldFiles.LC.src.Explore.April30DayLeetCodingChallenge.Week1;

import java.util.Arrays; 

/**
 * April7
 */
public class April7 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,5,0};
        System.out.println(countElements(arr));
    }

    public static int countElements(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        int runLength = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                if (arr[i - 1] + 1 == arr[i]) {
                    count += runLength;
                }
                runLength = 0;
            }
            runLength++;
        }
        return count;
    }
}