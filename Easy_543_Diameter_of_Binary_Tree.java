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
    int diameter =0;

    public int diameterOfBinaryTree(TreeNode root) {
        depthofNode(root);
        return diameter;
}
    public int depthofNode(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int left = depthofNode(root.left);
        int right = depthofNode(root.right);
        
        diameter = Math.max(diameter, left + right);

        return Math.max(left, right) + 1;
    }
}