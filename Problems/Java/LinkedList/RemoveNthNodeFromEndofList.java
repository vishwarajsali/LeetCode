/**
 * RemoveNthNodeFromEndofList
 */
public class RemoveNthNodeFromEndofList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;

        for(int i = 0; i< n; i++){
            fast = fast.next;
        }

        if(fast.next == null){
            head = head.next;
            return head;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    public static void printListNode(ListNode l){
        while(l != null){
            System.out.println(l.val);

            l = l.next;
        }
    }
}

