/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr,prev;
        curr=head;
        prev=head;
        while(head!=null && head.val==val)
        {
            head= head.next;
        }
            
        
        while(curr!=null)
        {
            if(curr.val==val)
            {
                prev.next=curr.next;
                curr=curr.next;
            }
            else
            {
                prev=curr;
                curr=curr.next;
            }
        }
        return head;
        
    }
}