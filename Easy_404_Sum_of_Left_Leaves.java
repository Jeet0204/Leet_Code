/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        if(root==null)
            return sum;
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int level = queue.size();

            for(int i=0;i<level;i++)
            {
                TreeNode node = queue.poll();

                if(node.left!=null)
                {
                    if(node.left.left==null && node.left.right==null)
                    {
                      sum += node.left.val;   
                    }
                        
                    queue.offer(node.left);
                }
                    
                
                if(node.right!=null)
                    queue.offer(node.right);
            }
            
            
        }
        return sum;
    }
}