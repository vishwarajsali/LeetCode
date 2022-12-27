package com.vishwaraj.OldFiles.src.main.java.code.Java1.Problems;

import com.vishwaraj.OldFiles.src.main.java.code.Java1.LeetCodeLib.AssortedMethods;
import com.vishwaraj.OldFiles.src.main.java.code.Java1.LeetCodeLib.ListNode;

/**
 * AddTwoNumbers
 */
public class AddTwoNumbers {

    // public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
    //     ListNode result = new ListNode(0);
    //     return result;
    // }

    public static void main(String[] args) {
      
        int[] array1 = {9,9,9};
        int[] array2 = {1};
     
        ListNode l1, l2 ;
        l1 = AssortedMethods.createListToArray(array1);
        l2 = AssortedMethods.createListToArray(array2);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result =  addTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(AssortedMethods.printLinklist(result));

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode curr = result;

        int carry = 0;
        while(l1 != null || l2 != null){
            int sum = (l1 != null ? l1.val : 0)  + (l2 != null ? l2.val : 0)+ carry;

            result.next = new ListNode(sum%10);
            
            carry = sum/10;
            result = result.next;
            if(l1 != null)  l1 = l1.next;
            if(l2 != null)  l2 = l2.next;
        }

        if(carry == 1) {
            result.next = new ListNode(carry);
            result = result.next;
        }

        return curr.next;
    }
}