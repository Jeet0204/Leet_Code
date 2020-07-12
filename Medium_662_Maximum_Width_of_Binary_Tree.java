/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int width=0;
        int max=0;
        
        if(root==null)
            return width;
        
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
            max = Math.max(max,size);
            for(int i=0;i<size;i++)
            {
                TreeNode node = queue.poll();
                
                if(node!=null){
                    queue.add(node.left);
                    queue.add(node.right);
                }
                else
                {
                    queue.add(null);
                    queue.add(null);
                }
            }
            
            while(!queue.isEmpty() && queue.peekFirst()==null)
                queue.pollFirst();
                
            while(!queue.isEmpty() && queue.peekLast()==null)
                queue.pollLast();
            
        }
        return max;
    }
}