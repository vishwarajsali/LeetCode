package LeetCodeLib;

/**
 * AssortedMethods
 */
public class AssortedMethods {
    public static void printLinklist(ListNode root){
        while(root != null){
            System.out.printf("%d --> ",root.val);
            root = root.next;
        }
        System.out.print("Null");
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