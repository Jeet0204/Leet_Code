/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> set = new HashSet<Integer>();
        ListNode prev=head;
        ListNode curr = head;
        while(curr!=null)
        {
            if(set.contains(curr.val))
            {
                prev.next=curr.next;
            }
            else
            {
                set.add(curr.val);
                prev = curr;
            }
            curr=curr.next;
        }
        return head;
    }
}