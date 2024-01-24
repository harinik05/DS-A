package Kth_Smallest_Elem_BST;

public class TreeNode {

    //public member variables
    public int val;
    public TreeNode left;
    public TreeNode right;

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
