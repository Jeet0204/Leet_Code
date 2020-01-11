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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<Integer>();
        if(root1==null && root2 == null)
            return list;
        
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        
        if(root1!=null)
        {
            queue1.offer(root1);
            while(!queue1.isEmpty())
            {
                int level = queue1.size();
                for(int i=0;i<level;i++)
                {
                    TreeNode temp = queue1.poll();
                    list.add(temp.val);
                    if(temp.left!=null)
                        queue1.offer(temp.left);
                    if(temp.right!=null)
                        queue1.offer(temp.right);

                }
            }
        }
            
        if(root2!=null)
        {
            queue2.offer(root2);
        
            while(!queue2.isEmpty())
            {
                int level = queue2.size();
                for(int i=0;i<level;i++)
                {
                    TreeNode temp = queue2.poll();
                    list.add(temp.val);
                    if(temp.left!=null)
                        queue2.offer(temp.left);
                    if(temp.right!=null)
                        queue2.offer(temp.right);

                }
            }
        }
        
        Collections.sort(list);
        
        return list;
    }
}