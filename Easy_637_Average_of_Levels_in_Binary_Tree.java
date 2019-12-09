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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<Double>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)
            return list;
        
        queue.offer(root);
        while(!queue.isEmpty())
        {
            List<Integer> curr=new ArrayList<Integer>();
            int levelSize = queue.size();
            double sum =0;
            for(int i=0;i<levelSize;i++)
            {
                TreeNode temp = queue.poll();
                curr.add(temp.val);
                sum = sum + temp.val;
                
                if(temp.left!=null)
                    queue.offer(temp.left);
                    
                if(temp.right!=null)
                    queue.offer(temp.right);
            }

            list.add(sum/(double)levelSize);
        }
        return list;
    }
}