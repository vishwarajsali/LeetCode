package problems._0015_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 3Sum
 */
public class _3Sum {

    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        for(int i = 0; i < len-2; i++){
           for(int j = i+1; j< len-1; j++){
               for(int k = j+1; k< len; k++){
                   int sum = nums[i]+nums[j]+nums[k];
                    List<Integer> list = new ArrayList<>();
                   if(sum == 0){
                       list.add(nums[i]);
                       list.add(nums[j]);
                       list.add(nums[k]);
                       if(!result.contains(list))result.add(list);

                   }
               }
           }
        }
        return result;
    }
}