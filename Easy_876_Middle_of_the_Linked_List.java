/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode curr;
        curr=head;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        if(count%2==0)
        {
            count = ((count/2)+1);
            curr=head;
            for(int i=0;i<count-1;i++)
            {
                curr = curr.next;
            }
        }
        else
        {
            count = count/2;
            curr = head;
            for(int i=0;i<count;i++)
            {
                curr = curr.next;
            }
        }
            
        
        
    return curr;
    }
}