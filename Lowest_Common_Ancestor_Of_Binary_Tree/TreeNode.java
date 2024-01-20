package Lowest_Common_Ancestor_Of_Binary_Tree;

public class TreeNode{
    //variables defined
    int data;
    TreeNode left;
    TreeNode right;

    //constructor
    public TreeNode(int x){
        this.data = x;
    }

    //insert a node to the binary search tree
    public void insertNode(int value){
        if(value<data){
            if(left == null){
                left = new TreeNode(value);
            }else{
                left.insertNode(value);
            }
        }else{
            if(right == null){
                right = new TreeNode(value);
            }else{
                right.insertNode(value);
            }
        }
    }
}