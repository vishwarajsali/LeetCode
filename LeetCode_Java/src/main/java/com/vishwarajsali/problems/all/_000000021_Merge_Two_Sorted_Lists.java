package com.vishwarajsali.problems.all;

import com.vishwarajsali.problems.util.List.singlyLinkedList.ListNode;

public class _000000021_Merge_Two_Sorted_Lists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);

        ListNode curr = result;
        while(list1 != null && list2 != null){

            if(list1 != null && (list1.val <= list2.val)){
                curr.next = new ListNode(list1.val);
                list1 = list1.next;
            }else{
                curr.next = new ListNode(list2.val);
                list2 = list2.next;
            }

            curr = curr.next;
        }

        if(list1 != null) curr.next = list1;
        if(list2 != null) curr.next = list2;

        return result.next;
    }
}
