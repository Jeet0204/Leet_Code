/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> pq =new PriorityQueue<Integer>();
        ListNode node=new ListNode(-1);
        ListNode temp=node;
        ListNode list=head;
        while(list!=null)
        {
            pq.add(list.val);
            list=list.next;
        }
       
        while(!pq.isEmpty())
        {
            temp.next = new ListNode(pq.remove());
            temp=temp.next;
        }
        return node.next;
    }
}