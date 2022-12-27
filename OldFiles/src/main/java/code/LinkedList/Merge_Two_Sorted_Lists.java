package com.vishwaraj.OldFiles.src.main.java.code.LinkedList;

/**
 * Merge_Two_Sorted_Lists
 */
public class Merge_Two_Sorted_Lists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode.printListNode(mergeTwoLists(l1, l2));


    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(true){
            if(l1 == null){
                tail.next = l2;
                break;
            } 

            if(l2 == null){
                tail.next = l1;
                break;
            }

            if(l1.val <= l2.val){
                tail.next = l1;
                l1 = l1.next;

            } else {
                tail.next = l2;
                l2 = l2.next;
            }

            tail = tail.next;
        }

        return dummy.next;
    }
}