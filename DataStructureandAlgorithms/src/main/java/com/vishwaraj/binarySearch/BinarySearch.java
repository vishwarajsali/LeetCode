package com.vishwaraj.binary_search;

import java.util.List;

public class BinarySearch {

    public int search(List<Integer> list, int targer){
        int left = 0;
        int right = list.size();

        while (left <= right){
            int mid = (left + right) / 2;
            if(list.get(mid) == targer) return mid;
            if(list.get(mid) < targer) right = mid;
            else left = mid + 1;
        }

        return -1;
    }
}
