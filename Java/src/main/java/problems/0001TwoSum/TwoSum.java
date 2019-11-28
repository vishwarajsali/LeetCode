package problems._1TwoSum;

import java.util.HashMap;

/**
 * TwoSum
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            int diff = target -nums[i] ;
            if(map.containsKey(nums[i])){
                result[0] = map.get(nums[i]);
                result[1] = i;
                return result;
            }
            else map.put(diff, i);
        }

        return result;
    }
}