/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA==null || headB==null)
            return null;
        
        int count1 = 0, count2 = 0;
        ListNode A=headA;
        ListNode B=headB;
        
        while(headA!=null)
        {
            count1++;
            headA=headA.next;
        }
        
        
        while(headB!=null)
        {
            count2++;
            headB=headB.next;
        }
        
        

       if(count1>count2)
       {
            for(int i=0;i<count1-count2;i++)
               A = A.next;
       }
        else
        {
            for(int i=0;i<count2-count1;i++)
               B = B.next;   
        }
        
        while(A!=B)
        {
            A=A.next;
            B=B.next;
        }

        
        return A;
    }
}