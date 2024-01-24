package Construct_BST_Preorder_Inorder;

public class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    //1. constructor
    public TreeNode(){

    }

    //2, second constructor with value param
    public TreeNode(int val){
        this.val = val;
    }

    //3. Third constructor with all the params
    public TreeNode(TreeNode left, TreeNode right, int val){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
