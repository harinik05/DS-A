# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class maxDepth(object):
    def maxDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """

        #1. base case
        if(root == None):
            return 0
        
        #2. get the right and left subtree heights
        right = self.maxDepth(root.right)
        left = self.maxDepth(root.left)

        #3. return the max height
        return max(right,left)+1