package problems._0160IntersectionofTwoLinkedLists;


import LeetCodeLib.ListNode;

/**
 * IntersectionofTwoLinkedLists
 */
public class IntersectionofTwoLinkedLists {

    public static void main(String[] args) {
        int[] a = {4,1}, b  ={5,0,1}, intersect = {8,4,5};
  
        ListNode listA = ListNode.createArraytoList(a);
        ListNode listB = ListNode.createArraytoList(b);
        ListNode listInter = ListNode.createArraytoList(intersect);
        
        ListNode listInterA =  ListNode.intersectListNode(listA, listInter);
        ListNode listInterB =  ListNode.intersectListNode(listB, listInter);

        ListNode.printList(getIntersectionNode(listInterA, listInterB));
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode currA = headA, currB = headB;

        int lenA = ListNode.length(currA), lenB = ListNode.length(currB);

        
         if(lenA > lenB){
            for (int i = 0;i < lenA - lenB; i++){
                currA = currA.next;
            }
        } else {
            for (int i = 0;i < lenB - lenA; i++){
                currB = currB.next;
            }
        }

        while(currA != currB){
            currA = currA.next;
            currB = currB.next;
        }

        return currA;
        
    }
}