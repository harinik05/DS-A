# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def invertTree(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        #1. base case
        if(root == None):
            return None
        
        #2. Get the left and right children
        right = self.invertTree(root.right)
        left = self.invertTree(root.left)

        #3. reverse the left and right children
        root.left = right
        root.right = left

        #4. return the root
        return root

        