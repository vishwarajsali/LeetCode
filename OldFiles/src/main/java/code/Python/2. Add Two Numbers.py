# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        if l1.val == 0 and l1.val == None:
            return l2
        if l2.val == 0 and l2.val == None:
            return l1
        dummy = curr = ListNode(-1)
        carry = 0
        while l1 or l2:
            
            a = l1.val if l1 else 0
            b = l2.val if l2 else 0
            
            sum = a + b + carry
                
            curr.next = ListNode(sum % 10)
            curr = curr.next 
            carry = sum // 10
            
            if l1 : 
                l1 = l1.next 
            if l2:
                l2 = l2.next
            
        if carry > 0:
            curr.next = ListNode(1)
        
        return dummy.next
        