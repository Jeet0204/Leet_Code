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
    List<Integer> list=new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
    if(root==null)
        return list;
        
        if(root!=null)
            postorderTraversal(root.left);
        if(root!=null)
            postorderTraversal(root.right);
        list.add(root.val);
        return list;
        
//Iterative approach
//         List<Integer> list = new ArrayList<Integer>();
        
//         if(root==null)
//             return list;
//         Stack<TreeNode> stack = new Stack<TreeNode>();
//         stack.push(root);
//         while(!stack.isEmpty())
//         {
//             TreeNode temp =stack.peek();
//                 if(temp.left==null && temp.right==null)
//                 {
//                     TreeNode pop = stack.pop();
//                     list.add(pop.val);
//                 }
//             else
//             {
//                 if(temp.right!=null)
//                 {
//                     stack.push(temp.right);
//                     temp.right=null;
//                 }
//                 if(temp.left!=null)
//                 {
//                     stack.push(temp.left);
//                     temp.left=null;
//                 }
//             }
//         }
        // return list;
        

    }
}