package com.vishwaraj.OldFiles.src.main.java.code.LinkedList;

/**
 * Swap_Nodes_in_Pairs
 */
public class Swap_Nodes_in_Pairs {


    public ListNode swapPairs(ListNode head) {

        ListNode temp = head;
        
        while(temp != null && temp.next != null){
            int k = temp.val;
            temp.val = temp.next.val;
            temp.next.val = k;
            temp = temp.next.next;
        }

        return head;
    }
}