package com.vishwaraj.OldFiles.src.main.java.code.LinkedList;

/**
 * Rotate_List
 */
public class Rotate_List {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);

        ListNode.printListNode(l1);

        Rotate_List rl = new Rotate_List();
        System.out.println();
        ListNode.printListNode(rl.rotateRight(l1, 2));
    }

    public ListNode rotateRight(ListNode head, int k) {

        if(head == null) return head;
        
        ListNode curr = head;
        int len = listLen(head);

        k = k % len;

        if(k == 0) return head;
        
        int index = len - k;
        while(index > 1){
            curr = curr.next;
            index--;
        }

        ListNode start = curr.next;
        ListNode end = curr.next;
        curr.next = null;

        while(end.next != null){
            end = end.next;
        }

        end.next = head;
        head = start;

        return head;
        
    }

    private int listLen(ListNode head){
        int len = 0;
        while(head != null){
            len ++;
            head = head.next;
        }
        return len;
    }
}