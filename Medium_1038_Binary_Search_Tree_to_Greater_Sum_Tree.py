# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    result = 0
    def bstToGst(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        if(root==None):
            return null
            
        if(root.right!=None):
            self.bstToGst(root.right)
            
        self.result += root.val
        root.val = self.result

        if(root.left!=None):
            self.bstToGst(root.left)
        
        return root