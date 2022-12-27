package com.vishwaraj.OldFiles.src.main.java.code.Java1.Problems;

import com.vishwaraj.OldFiles.src.main.java.code.Java1.LeetCodeLib.ListNode;

import java.util.HashMap;

public class Problems {

    /**
     * 10. Regular Expression Matching
     * @param s
     * @param p
     * @return
     */
    public boolean isMatch(String s, String p) {

        for(int i = 0; i< p.length();i++){
            if(p.charAt(i) == '*'){
                return  true;
            }else if(p.charAt(i) == '.') {
                int len = s.length() > p.length() ? s.length() : p.length();
                for(int j = i+1; j<len;j++){
                    int sIndex = s.length()-j, pIndex = p.length() -j;
                    if(p.charAt(pIndex) == '*') return true;
                    if(sIndex >= 0 && pIndex >= 0){
                       return  p.charAt(pIndex) == s.charAt(sIndex);
                    }
                }
            }
        }
        return false;
    }

    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) return 1;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0, j = 0;
        for(int i =0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))) j = Math.max(j, map.get(s.charAt(i))+1);
            map.put(s.charAt(i), i);
            maxLength = Math.max(maxLength, i-j+1);
        }

        return maxLength;
    }

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
}
