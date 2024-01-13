package com.vishwaraj.array_hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _00347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        //map to find the freq of the number
//        1 -> 3 2 -> 2 3 -> 1
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) map.put(i, map.getOrDefault(i, 0)+1);

        //       create the list with the freq of each num
//        0-> 0 1 -> 3 2->2 3 -> 1
        List<Integer>[] list = new List[nums.length+1];
        for(int i = 0; i<list.length; i++)  list[i] = new ArrayList<>();

        for(int i : map.keySet()) list[map.get(i)].add(i);

//        flaten the list
        List<Integer> flattenList = new ArrayList<>();
        for(List<Integer> i : list) flattenList.addAll(i);

//        add the flaten list to the res

        int[] res = new int[k];
        int n = flattenList.size()-1;
        for(int i = 0; i < k ; i++) res[i] = flattenList.get(n--);

        return res;
    }
}
