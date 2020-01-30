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
    int sum=0;

    public int sumEvenGrandparent(TreeNode root) {
        // sum=0;
        if(root==null)
             return sum;
        dfs(root,-1,-1);
        return sum;
        }
    

    public void dfs(TreeNode root, int gp, int p)
    {
        if(root==null)
            return;
        if(gp%2==0)
            sum += root.val;
        dfs(root.left,p,root.val);
        dfs(root.right,p,root.val);
    }
}