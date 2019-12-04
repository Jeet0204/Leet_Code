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
    ArrayList<Integer> list =new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)
            return list;
        list.add(root.val);
        if(root.left!=null)
            preorderTraversal(root.left);
        if(root.right!=null)
            preorderTraversal(root.right);
        return list;
        
        
// Iterative Approach
//         if(root==null)
//             return new ArrayList<Integer>();
        
//         ArrayList<Integer> list = new ArrayList<Integer>();
//         Stack<TreeNode> stack  =new Stack<TreeNode>();
//         stack.push(root);
//         while(!stack.isEmpty())
//         {
//             TreeNode curr = stack.pop();
//             list.add(curr.val);
//             if(curr.right!=null)
//                 stack.push(curr.right);
//             if(curr.left!=null)
//                 stack.push(curr.left);
//         }
        
//         return list;
        
        
    }
}