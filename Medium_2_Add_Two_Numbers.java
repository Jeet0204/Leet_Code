/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0,sum;
        ListNode l4 = new ListNode(0) ;
        ListNode l3 = l4;

       while(l1 != null || l2 !=null)
       {
           if(l1==null)
               l1 = new ListNode(0);
           if(l2==null)
               l2 = new ListNode(0);

           sum = l1.val +l2.val+carry;
           if(sum>=10)
           {
               sum = sum-10;
               carry = 1;
           }
           else
           {
               carry=0;
           }
           

           l3.next = new ListNode(sum);
           l3 = l3.next;
           l1=l1.next;
           l2=l2.next;
       }
        if(carry==1)
        {
           l3.next = new ListNode(carry);
           l3 = l3.next;
        }
                
        return l4.next;
    }
}