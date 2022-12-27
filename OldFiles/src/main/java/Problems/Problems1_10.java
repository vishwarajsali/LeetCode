package com.vishwaraj.OldFiles.src.main.java.Problems;

import com.vishwaraj.OldFiles.Java.src.main.java.LeetCodeLib.ListNode;

import java.util.HashMap;

public class Problems1_10 {

    /**
     *
     * @param nums
     * @param target
     * @return
     */


    public int[] twoSum(int[] nums, int target) {
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


    /**
     *2. Add Two Numbers
     * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
     *
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     *
     * @param l1  (2 -> 4 -> 3)
     * @param l2 (5 -> 6 -> 4)
     * @return 7 -> 0 -> 8
     * Explanation: 342 + 465 = 807.
     */

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode curr = result;

        int carry = 0;
        while(l1 != null || l2 != null){
            int sum = (l1 != null ? l1.val : 0)  + (l2 != null ? l2.val : 0)+ carry;

            result.next = new ListNode(sum%10);

            carry = sum/10;
            result = result.next;
            if(l1 != null)  l1 = l1.next;
            if(l2 != null)  l2 = l2.next;
        }

        if(carry == 1) {
            result.next = new ListNode(carry);
            result = result.next;
        }

        return curr.next;
    }


    /**
     * 10. Regular Expression Matching
     * Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.
     * @param s
     * @param p
     * @return
     */


    public boolean isMatch(String s, String p) {

        return  true;
    }
}
