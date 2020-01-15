/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int result=0;

        if(head==null)
            return result;
        
        List<Integer> list = new ArrayList<Integer>();
        while(head!=null)
        {
            list.add(head.val);
            head=head.next;
        }
        
        int j=0;
        for(int i=list.size()-1;i>=0;i--)
        {
            result = result + ((int)Math.pow(2,j)*list.get(i));
            j++;
        }
        return result;
    }
}