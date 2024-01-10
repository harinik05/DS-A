package Trees;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class maxDepth {
    public int maxDepth(TreeNode root) {

        //1. if the tree is null, then return the null
        if (root == null){
            return 0;
        }

        //2. find the height
        int leftHeight = this.maxDepth(root.left);
        int rightHeight = this.maxDepth(root.right);

        //3. return the max height
        return Math.max(leftHeight, rightHeight)+1;
        
    }
}