package com.vishwaraj.OldFiles.Java.src.main.java.problems._0078Subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * Subsets
 */
public class Subsets {

    public static void main(String[] args) {
        
    }

    List<List<Integer>> result;
    int[] nums;
    int n;
    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        result = new ArrayList<>();
        n = nums.length;
        for(int k = 0; k< n+1; ++k){
            backtrack(0, new ArrayList<Integer>(), k);
        }
        
        return result;
        
    }
    
    private void backtrack(int start, ArrayList<Integer> curr, int end){
        if(curr.size() == end){ 
            result.add(new ArrayList(curr));
        } 
        
        for(int i = start; i< n; ++i){
            curr.add(nums[i]);
            backtrack(i+1, curr, end);
            curr.remove(curr.size()-1);
        }
        
    }
}