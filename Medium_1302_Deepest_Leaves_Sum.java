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
    public int deepestLeavesSum(TreeNode root) {   
        int sum=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int level = queue.size();
            sum = 0;
                for(int i=0;i<level;i++)
                {
                    TreeNode temp = queue.poll();
                    sum = sum + temp.val;
                    
                    if(temp.left!=null)
                        queue.offer(temp.left);
                    if(temp.right!=null)
                        queue.offer(temp.right);
                }
            }
        return sum;
        
    }
}