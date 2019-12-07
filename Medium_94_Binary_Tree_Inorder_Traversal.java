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
    ArrayList<Integer> list=new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)
            return list;
        if(root.left!=null)
            inorderTraversal(root.left);
        list.add(root.val);
        if(root.right!=null)
            inorderTraversal(root.right);
      
        //Iterative Approach
        // ArrayList<Integer> list=new ArrayList<Integer>();
        // if(root==null)
        //     return list;
        // Stack<TreeNode> stack=new Stack<TreeNode>();
        // TreeNode tree=root;
        // while(!stack.isEmpty() || tree!=null)
        // {
        //     if(tree!=null)
        //     {
        //         stack.push(tree);
        //         tree = tree.left;
        //     }
        //     else
        //     {
        //         TreeNode temp = stack.pop();
        //         list.add(temp.val);
        //         tree=temp.right;
        //     }
        // }
        
        
        
        return list;
    }
}