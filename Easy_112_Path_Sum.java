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
    int total =0;
    boolean flag=false;
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if(root==null)
            return false;
        
        total += root.val;
        
            
        // System.out.println("Before: "+total);
        if(root.left!=null)
            hasPathSum(root.left, sum);
        
        // System.out.println("Middle: "+total);
        
        if(root.right!=null)
            hasPathSum(root.right, sum);
        
        if(root.left==null && root.right==null && total==sum)
            flag = true;
      
        total -= root.val;        
        
        return flag;
    }
}