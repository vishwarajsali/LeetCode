package com.vishwaraj.OldFiles.Java.src.main.java.problems._0039CombinationSum;

import java.util.ArrayList; 
import java.util.List;

/**
 * CombinationSum
 */
public class CombinationSum {

    public static void main(String[] args) {
        
    }

    int[] candidates;
    int target;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;
        List<List<Integer>> combinations = new ArrayList<>();
        backtrack(combinations, new ArrayList<>(), 0, 0);
        return combinations;
    }
    
    private void backtrack(List<List<Integer>> combinations, List<Integer> combination, int sum, int start) {
        if (sum > target)
            return;
        if (sum == target) 
            combinations.add(new ArrayList<>(combination));
        else 
            for (int i = start; i < candidates.length; i++) {
                combination.add(candidates[i]);
                backtrack(combinations, combination, sum + candidates[i], i);
                combination.remove(combination.size() - 1);
            }
    }
}