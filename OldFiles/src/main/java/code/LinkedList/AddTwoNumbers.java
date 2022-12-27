package com.vishwaraj.OldFiles.src.main.java.code.LinkedList;

/**
 * AddTwoNumbers
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        printListNode(addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode first = l1, second = l2, resultH = null, resultT = null;
        int sum = 0, carray = 0;

        while(first != null || second != null){
            sum = carray + (first != null ? first.val : 0) + (second != null ? second.val: 0);

            carray = (sum >= 10) ? 1 : 0;

            sum %= 10;

            if(resultH == null) resultH = resultT = new ListNode(sum);
            else {
                resultT.next = new ListNode(sum);
                resultT = resultT.next;
            }

            if(first!= null) first = first.next;
            if(second != null) second = second.next;
        }

        if(carray != 0) {
            resultT.next = new ListNode(carray);
            resultT = resultT.next;
        }
        return resultH;
    }


    public static void printListNode(ListNode l){
        while(l != null){
            System.out.println(l.val);

            l = l.next;
        }
    }

}

