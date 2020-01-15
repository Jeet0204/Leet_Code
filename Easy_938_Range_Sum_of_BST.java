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
    public int rangeSumBST(TreeNode root, int L, int R) {
        int result = 0;
        if(root==null)
            return result;
        
        Stack<TreeNode> stack  =new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode curr = stack.pop();
            if(L<=curr.val && curr.val<=R)
                result = result + curr.val;
            if(curr.right!=null)
                stack.push(curr.right);
            if(curr.left!=null)
                stack.push(curr.left);
        }
        
        return result;
    }
}