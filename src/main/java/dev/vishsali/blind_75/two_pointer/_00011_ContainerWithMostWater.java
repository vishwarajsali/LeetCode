package com.vishwaraj.two_pointer;

public class _00011_ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxWater = 0, left = 0, right = height.length-1;

        while(left < right){
            int containerSize = right - left;
            int minWater = containerSize * Math.min(height[right], height[left]);
            maxWater = Math.max(maxWater, minWater);

            if(height[right] < height[left]) right--;
            else left++;
        }


        return maxWater;
    }
}
