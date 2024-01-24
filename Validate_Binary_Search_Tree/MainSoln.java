package Validate_Binary_Search_Tree;

public class MainSoln {

    //1. define all the private member variables for this
    private TreeNode root;
    
    //2. define a constructor
    public MainSoln(TreeNode inRoot){
        this.root = inRoot;
    }

    //3. helper method to check uf each node is supposed to be a part of a bst
    public boolean isBinarySTNode(TreeNode root, Integer lo, Integer hi){
        //a. check the base condition
        if(root == null){
            return true;
        }

        //b. check if the node is within the bounds
        if((lo!=null && root.val<lo) || (hi!=null && root.val>hi)){
            return false;
        }

        //c. chek the left and right
        boolean left = isBinarySTNode(root, lo, root.val);
        boolean right = isBinarySTNode(root, root.val, hi);

        //d. return the result
        return (left && right);
    }

    public boolean validBST(TreeNode root){
        return isBinarySTNode(root, null, null);
    }
    public static void main(String[] args){

    }
}
