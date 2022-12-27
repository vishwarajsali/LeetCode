package com.vishwaraj.OldFiles.LC.src.Explore.MayLeetCodingChallenge.Week1;

/**
 * May1
 */
public class May1 {

    public int firstBadVersion(int n) {
        
       
        if(n == 1 && isBadVersion(n)) return n;
        int start = 1, end = n;
        while(start < end){
            int mid = start + (end - start)/2;
            if(isBadVersion(mid)){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        
        return start;
    }

    boolean isBadVersion(int version){
        return false;
    }
}