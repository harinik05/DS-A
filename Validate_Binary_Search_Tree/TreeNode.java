package Validate_Binary_Search_Tree;

public class TreeNode {

    //private member variables
    private int val;
    private TreeNode left;
    private TreeNode right;

    //constructor
    //1. empty constructor defined
    public TreeNode(){

    }

    //2, just the value defined
    public TreeNode(int val){
        this.val = val;
    }

    //3. all the params defined in this one
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left =left;
        this.right = right;
    }
    public static void main(String[] args){

    }
}
