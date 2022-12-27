package com.vishwaraj.OldFiles.src.main.java.code.Java;

import java.util.Arrays;

/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.
Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
You may assume nums1 and nums2 cannot be both empty.
Example 1:
nums1 = [1, 3]
nums2 = [2]
The median is 2.0
Example 2:
nums1 = [1, 2]
nums2 = [3, 4]
The median is (2 + 3)/2 = 2.5
*/

public class Median_of_Two_Sorted_Arrays_4{
    public static void main(String[] args) {
        int[] nums1 = {1,3}, nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[] curr = new int[n1+n2];
        double median = 0.0;
        int i =0, j =0, k =0;
        while(i< n1 && j< n2){
            if(nums1[i] < nums2[j]) curr[k++] = nums1[i++];
            else curr[k++] = nums2[j++];
        }
        while(i<n1) curr[k++] = nums1[i++];
        while(j<n2) curr[k++] = nums2[j++];

        System.out.println(Arrays.toString(curr));

        int n3 = curr.length, mid = n3/2;
        if(n3%2 == 0) median = (double) (curr[mid] + curr[mid-1])/2;
        else median = curr[mid];
        return median;
    }
}