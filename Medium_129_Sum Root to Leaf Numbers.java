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
    int sum =0;
    String string = "";
    public int sumNumbers(TreeNode root) {
        if(root==null)
            return sum;
        
        string += Integer.toString(root.val);
        
        if(root.left!=null)
            sumNumbers(root.left);
        
        
        if(root.right!=null)
            sumNumbers(root.right);
        
        if(root.left==null && root.right==null){
            sum += Integer.parseInt(string);
        }
      
        string = string.substring(0,string.length()-1);
        // System.out.println("String: "+string);
        return sum;
    }
}