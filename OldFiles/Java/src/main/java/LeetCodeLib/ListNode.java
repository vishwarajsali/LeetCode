package com.vishwaraj.OldFiles.Java.src.main.java.LeetCodeLib;

/**
 * ListNode
 */
public class ListNode {
    public int val;
    public ListNode next;

    /**
     * 
     * @param x : create the linkedlist Node with with integer value
     */
    public ListNode(int x) {
        val = x;
        next = null;
    }

    /**
     * This method print the linked list
     */
    public void printList() {
        ListNode curr = this;
        while (curr != null) {
            System.out.printf("%d --> ", curr.val);
            curr = curr.next;
        }
        System.out.println();
    }

    
    /**
     * This is static method
     * 
     * @param list : takes the listNode 
     * @return : lenght of the passing list Node
     */

    public static int length(ListNode list) {
        int len = 0;
        while (list != null) {

            len++;
            list = list.next;
        }
        return len;
    }

    
    /**
     *  This is a static method 
     * 
     * @param list : Inital list 
     * @param listInter : this list intersect with the first list
     * @return : mearge two list w/o sorting
     */
    public static ListNode mergeListNode(ListNode list, ListNode listInter) {

        ListNode curr = list;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = listInter;
        curr = curr.next;

        return list;
    }


    /**
     * This method Merging two list 
     * it contains the 
     * @param listInter : the second list which will be merge with the inital linked list
     * @return : merge linkedlist
     */
    public ListNode mergeListNode(ListNode listInter) {

        ListNode curr = this;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = listInter;
        curr = curr.next;

        return this;
    }

    /**
     * This method takes an array and convert it to linked list
     * @param array 
     * @return : linked list
     */
    public static ListNode createArraytoList(int[] array) {

        if (array.length == 0 || array == null)
            return null;
        ListNode head = new ListNode(array[0]);

        ListNode curr = head;

        for (int i = 1; i < array.length; i++) {
            curr.next = new ListNode(array[i]);
            curr = curr.next;
        }
        return head;
    }

    /**
     * 
     * @return Length of the list
     */
    public int size() {

        int len = 0;
        ListNode curr = this;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        return len;
    }

}
