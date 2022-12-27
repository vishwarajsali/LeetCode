package com.vishwaraj.OldFiles.LC.src.Explore.April30DayLeetCodingChallenge.Week2;

import com.vishwaraj.OldFiles.LC.src.LeetCodeLib.List.ListNode;

public class April8 {
    public static void main(String[] args) {

    }

    public static ListNode middleNode(ListNode head) {
        ListNode p1 = head, p2 = head, prev = null;
        while(p2!= null && p2.next!= null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        prev = p1;
        return prev;
        
    }
}