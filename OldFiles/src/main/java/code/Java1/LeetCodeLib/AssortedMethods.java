package com.vishwaraj.OldFiles.src.main.java.code.Java1.LeetCodeLib;

/**
 * AssortedMethods
 */
public class AssortedMethods {
    public static String printLinklist(ListNode root){
        String result = "";
        while(root != null){
            result += root.val;
            //System.out.printf("%d --> ",root.val);
            root = root.next;
        }
        return result;
    }

    public static ListNode createListToArray(int[] array){
        ListNode result = new ListNode(0);
        ListNode curr = result;
        for(int i : array){

            result.next = new ListNode(i);
            result = result.next;
        }

        return curr.next;
    }
}