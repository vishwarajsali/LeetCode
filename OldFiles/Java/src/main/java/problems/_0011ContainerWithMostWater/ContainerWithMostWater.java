package com.vishwaraj.OldFiles.Java.src.main.java.problems._0011ContainerWithMostWater;

/**
 * ContainerWithMostWater
 */
public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = {3,9,3,4,7,2,12,6};
        //{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

    }

    public static int maxArea(int[] height) {
        int maxHeight = Integer.MIN_VALUE;
        int start = 0, end = height.length-1;

        while(start < end){


            int area = Math.min(height[end], height[start]) * (end - start);
            maxHeight = Math.max(maxHeight, area);

            if(height[start] < height[end]){
                start++;
            }else if(height[start] > height[end]){
                end--;
            }else {
                start++;
                end--;
            }
        }
        return maxHeight;
    }


    
}