package com.vishwaraj.OldFiles.src.main.java.code.Java;

import java.awt.List;
import java.util.LinkedList;

public class Remove_Duplicates_from_Sorted_List_83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		ListNode res = deleteDuplicates(head);
		
		System.out.println(String.valueOf(res.val));
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		/*LinkedList<Integer> list = new LinkedList<Integer>();
		ListNode dummy = new ListNode(0), p = head, curr = dummy;
		while(p!=null) {
			int x = p.val;
			if(!list.contains(x)) {
				list.add(x);
				curr.next = new ListNode(x);
				curr = curr.next;
				
			}
			if(p!= null) p = p.next;
		}
		
		return dummy.next;
		*/
		
		/*
		 * Not Working Properly.
		 * ListNode dummy = new ListNode(0), prev = head, next = prev.next, curr = dummy;
		while(next != null) {
			int x = prev.val;
			int y = next.val;
			if(x!=y) {
				curr.next = new ListNode(y);
				curr = curr.next;
			} else {
				curr.next = new ListNode(x);
				curr = curr.next;
			}
			prev = next;
			if(next!= null)	next = next.next;
		}
		
		return dummy.next;
		*/
		
		ListNode list = head;
		while(head!= null) {
			if(list.next == null)	break;
			if(list.val == list.next.val)	list.next = list.next.next;
			else	 list = list.next;
		}
		return head;
    }
	
	public static class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}

}
