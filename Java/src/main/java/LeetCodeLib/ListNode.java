package LeetCodeLib;

/**
 * ListNode
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public static ListNode createArraytoList(int[] array){
        ListNode list = new ListNode(0);
        ListNode curr = list;
        for(int i : array){
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        return list.next;
    }


    public static void printList(ListNode list){
        while(list != null){
            System.out.printf("%d --> ",list.val);
            list = list.next;
        }
        System.out.println();
    }

    public static int length(ListNode list){
        int len = 0;
        while(list != null){
            
            len++;
            list = list.next;
        }
        return len;
    }

    public static ListNode intersectListNode (ListNode list, ListNode listInter){
        
        ListNode curr = list;
        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = listInter;
        curr = curr.next;
        
        
        return list;
    }

}
