package com.vishwarajsali.problems.topinterviewquestions;

import com.vishwarajsali.problems.util.List.singlyLinkedList.ListNode;

public class _000000002_Add_Two_Numbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode curr = dummyNode;

        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;

            int sum = x + y + carry;


            carry = sum / 10;

            sum %= 10;

            curr.next = new ListNode(sum);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry != 0) {
            curr.next = new ListNode(carry);
            curr = curr.next;
        }

        return dummyNode.next;
    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode curr = dummyNode;

        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;

            int sum = x + y + carry;


            carry = sum / 10;

            sum %= 10;

            curr.next = new ListNode(sum);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry != 0) {
            curr.next = new ListNode(carry);
            curr = curr.next;
        }

        return dummyNode.next;
    }
}
