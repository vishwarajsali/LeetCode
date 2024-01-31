package dev.vishsali.blind_75.linkedList;

import dev.vishsali.dataStructureandAlgorithm.linkedList.singly.Node;

public class _00021_MergeTwoSortedLists {

    public Node mergeTwoLists(Node list1, Node list2) {
        Node result = new Node(0);
        Node dummy = result;
        while(list1!= null && list2 != null){
            if(list1.val <= list2.val){
                dummy.next = new Node(list1.val);
                list1 = list1.next;
            }else {
                dummy.next = new Node(list2.val);
                list2 = list2.next;
            }

            dummy = dummy.next;
        }

        if(list1!= null) dummy.next = list1;
        if(list2!= null) dummy.next = list2;

        return result.next;
    }
}
