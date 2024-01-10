# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class sameTree(object):
    def isSameTree(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        #1. base case
        if(p==None and q == None):
            return True
        elif (p == None or q == None):
            return False
        
        #2. check the values
        elif(p.val!=q.val):
            return False
        
        return self.isSameTree(p.right, q.right) and self.isSameTree(p.left, q.left)
        