package problems._0206ReverseLinkedList;

import LeetCodeLib.ListNode;

/**
 * ReverseLinkedList
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5};
        ListNode list = ListNode.createArraytoList(a);
        reverseList(list).printList();
    }
    public static ListNode reverseList(ListNode head) {
        
        ListNode prev = null, curr = head;
        
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
