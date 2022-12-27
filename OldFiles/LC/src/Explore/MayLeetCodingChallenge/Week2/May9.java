package com.vishwaraj.OldFiles.LC.src.Explore.MayLeetCodingChallenge.Week2;

/**
 * May9
 */
public class May9 {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(808201));
    }

    public static   boolean isPerfectSquare(int num) {
        if(num < 2)  return true;
        long start = 2, end = num / 2; 
        long perfectsq;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            perfectsq = mid * mid;
            if(perfectsq == num) return true;
            else if(perfectsq < num) start = mid+1;
            else end = mid-1;
        }

        return false;
   }

}

