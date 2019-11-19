/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode h1 = new ListNode(0);
        ListNode head1,head2;
        ListNode h2 = new ListNode(0);
        
        head1 = h1;
        head2 = h2;
        
        while(head!=null)
        {
            if(head.val<x)
            {
                h1.next = head;
                h1=h1.next;
            }
            else
            {
                h2.next = head;
                h2=h2.next;
            }
            head = head.next;
        }
        h2.next = null;
        h1.next = head2.next;
        return head1.next;
    }
}