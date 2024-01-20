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

    //static method with some sample values
    public static TreeNode createSampleTree(){
        TreeNode root = new TreeNode(10);
        root.insertNode(5);
        root.insertNode(15);
        root.insertNode(3);
        root.insertNode(12);
        root.insertNode(18);
        return root;
    }
}