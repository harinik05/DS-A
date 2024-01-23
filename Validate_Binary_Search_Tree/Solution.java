package Validate_Binary_Search_Tree;

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
class Solution {

    //1. inserting a node 
    public void insertNode(int value, TreeNode inRoot){
        if(value < inRoot.val){
            if(inRoot.left == null){
                inRoot.left = new TreeNode(value);
            }else{
                insertNode(value, inRoot.left);
            }
            
        }
        else{
            if(inRoot.right == null){
                inRoot.right = new TreeNode(value);
            }else{
                insertNode(value, inRoot.right);
            }
        }
    }

    //check if the trees are the same
    public boolean isSameTree(TreeNode tree1, TreeNode tree2){
        //base conditions
        if(tree1 == null && tree2 == null){
            return true;
        }
        if(tree1 == null || tree2 == null){
            return false;
        }

        //come up with left and right
        boolean left = isSameTree(tree1.left,tree1.right);
        boolean right = isSameTree(tree2.left, tree2.right);

        //compare the left and right sides
        if(tree1.val == tree2.val && left && right){
            return true;
        }else{
            return false;
        }
    }

    //2. function that checks if the tree is valid or not
    public boolean isValidBST(TreeNode root) {
       if(root == null){
           return true;

       }
       TreeNode current = root;
       TreeNode newTreeNode = new TreeNode();

       //insert all the nodes into the new tree node 
       while(current!=null){
           insertNode(current.val, newTreeNode);
           //current= current.next;
       }

       //check if both of these are equal
        return isSameTree(newTreeNode, current);

    }
}