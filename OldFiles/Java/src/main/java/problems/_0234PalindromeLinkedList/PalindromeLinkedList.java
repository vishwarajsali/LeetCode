package com.vishwaraj.OldFiles.Java.src.main.java.problems._0234PalindromeLinkedList;

import java.util.ArrayList;
import java.util.List;

import com.vishwaraj.OldFiles.Java.src.main.java.LeetCodeLib.ListNode;

/**
 * PalindromeLinkedList
 */
public class PalindromeLinkedList {

    public static void main(String[] args) {
        int[] array = {-129,-129};

        ListNode list =  ListNode.createArraytoList(array);

        System.out.println(isPalindrome(list));
    }

    public static boolean isPalindrome(ListNode head) {
        
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        int end = list.size()-1,start = 0;

        while(start < end){
            if(!list.get(start++).equals(list.get(end--))) return false;
            
        }

        return true;
        

    }
}