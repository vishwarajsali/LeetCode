package com.vishwaraj.OldFiles.Java.src.main.java.problems._0056MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays; 
import java.util.List;

/**
 * MergeIntervals
 */
public class MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }

    public static int[][] merge(int[][] intervals) {
       if(intervals.length <= 1) return intervals;

       List<int[]> output_arr = new ArrayList<>();
       Arrays.sort(intervals, (a1, a2) -> Integer.compare(a1[0], a2[0]));

       int[] cur_interval = intervals[0];
       output_arr.add(cur_interval);
       for(int[] interval: intervals){ 
           int cur_end = cur_interval[1];
           int next_begin = interval[0];
           int next_end = interval[1];


           if(cur_end >= next_begin){
               cur_interval[1] = Math.max(cur_end, next_end);
           } else {
               cur_interval = interval;
               output_arr.add(cur_interval);
           }
       }



       return output_arr.toArray(new int[output_arr.size()][]);
    }
}