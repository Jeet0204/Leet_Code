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
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> sublist = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    int total = 0;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        if(root==null)
            return list;
        
        total += root.val;
        sublist.add(root.val);
        
        if(root.left!=null)
            pathSum(root.left, sum);
        
        
        if(root.right!=null)
            pathSum(root.right, sum);
        
        if(root.left==null && root.right==null && total==sum){
            list.add(new ArrayList<Integer>(sublist));
        }
      
        total -= root.val;
        sublist.remove(sublist.size()-1);
      
        return list;
    }
}