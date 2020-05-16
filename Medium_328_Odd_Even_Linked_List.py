# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def oddEvenList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if(head==None):
            return None
        odd = ListNode()
        even = ListNode()
        odd = head
        even = head.next
        temp = even
        while(odd.next!=None and odd.next.next!=None):
            odd.next=odd.next.next
            even.next = even.next.next
            odd=odd.next
            even=even.next
                
        odd.next=temp;

        return head