package com.vishwaraj.OldFiles.Java.src.main.java.problems._0046Permutations;

import java.util.ArrayList;
import java.util.List;

/**
 * Permutations
 */
public class Permutations {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        Permutations p = new Permutations();
        System.out.println(p.permute(nums));
    }


    int[] nums;
    List<List<Integer>> permutations;
    List<Integer> permutation;

    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        // List<List<Integer>> permutations =
        this.permutations = new ArrayList<>();
        this.permutation = new ArrayList<>();
        backtracking();
        return permutations;
    }


    private void backtracking() {
        if (permutation.size() == nums.length)
            permutations.add(new ArrayList<>(permutation));

        for (int i = 0; i < nums.length; i++) {
            if (permutation.contains(nums[i]))
                continue;
            permutation.add(nums[i]);
            backtracking();
            permutation.remove(permutation.size() - 1);
        }
    }
}