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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        Boolean flag = false;
        if(root==null)
            return false;
        
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();

            for(int i=0;i<size;i++)
            {
                TreeNode node = queue.poll();
                
                if(node.left!=null && flag==true)
                    return false;
                else if(node.left!=null && flag == false)
                    queue.add(node.left);
                else
                    flag=true;
                
                if(node.right!=null && flag == true)
                    return false;
                else if(node.right!=null && flag == false)
                    queue.add(node.right);
                else
                    flag=true;
            }
        }
        return true;
    }
}