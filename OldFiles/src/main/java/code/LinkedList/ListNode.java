package com.vishwaraj.OldFiles.src.main.java.code.LinkedList;

public class ListNode {
    int val;
     ListNode next;
     ListNode(int x) { val = x; }

    public static void printListNode(ListNode l){
        while(l != null){
            System.out.println(l.val);

            l = l.next;
        }
    }

  }

