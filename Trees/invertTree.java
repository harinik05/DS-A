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
package Trees;

import javax.swing.tree.TreeNode;

class invertTree {
    public TreeNode invertTree(TreeNode root) {
        //1. Define the base case
        if(root == null){
            return null;
        }

        //2. Define the left and right of the root
        TreeNode left = this.invertTree(root.left);
        TreeNode right = this.invertTree(root.right);

        //3. swap left and right for the root
        root.left = right;
        root.right = left;

        //4. return the root
        return root;
    }
}