package com.vishwaraj.OldFiles.src.main.java.code.Other;

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

        printNode(l1);
        printNode(l2);

        ListNode test = mergeTwoLists(l1, l2);

        printNode(test);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);;
        ListNode p = l1, q =l2, curr = dummy;
        
        if(p == null && q == null) {
            return null;
        }
        if(p == null) {
            return q;
        }
        if(q == null) {
            return p;
        }
        while(p != null && q != null){
            if(p.val < q.val) {
                curr.next = p;
                p = p.next;
            } else {     
               curr.next = q;
                q = q.next;
            } 
             curr = curr.next;
        }
        
        
        if(p != null) {
           curr.next = p;      
        }
        
        if(q != null) {
           curr.next = q;      
        }
        return dummy.next;
    }

    public static void printNode(ListNode node){

        System.out.println();
        while(node != null){
            System.out.print(node.val);
            node = node.next;
        }
    }

}



class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}