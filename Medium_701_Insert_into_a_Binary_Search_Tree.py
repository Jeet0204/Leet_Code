# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def insertIntoBST(self, root, val):
        """
        :type root: TreeNode
        :type val: int
        :rtype: TreeNode
        """
        if(root.val < val):
            print('out')
            if(root.right!=None):
                self.insertIntoBST(root.right,val)
            else:
                temp = TreeNode()
                root.right = temp
                temp.val = val
                temp.left = None
                temp.right = None
                return root
            
        if(root.val > val):
            print('in')
            if(root.left!=None):
                self.insertIntoBST(root.left,val)
            else:
                temp = TreeNode()
                root.left = temp
                temp.val = val
                temp.left = None
                temp.right = None
                return root
        return root