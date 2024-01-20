package Lowest_Common_Ancestor_Of_Binary_Tree;

import javax.swing.tree.TreeNode;

public class TreeNode{
    //variables defined
    int data;
    TreeNode left;
    TreeNode right;

    //constructor
    TreeNode(int x){
        this.data=x;
    }
}
class LowestSolution {
    //1. data structure
    private TreeNode root;

    //2. constructor
    public LowestSolution(TreeNode inRoot){
        this.root = inRoot;
    }
    
    //3. lowest common ancestor function
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //a. check base cases
        TreeNode current = root;
        if(current == null){
            return null;
        }

        //b. check the normal case
        while(current!=null){
            //c. move the current to the right if both are greater
            if(p.data > current.data && q.data > current.data){
                current = current.right;
            }
            //d. move the current to the left if both are smaller
            else if(p.data < current.data && q.data <current.data){
                current = current.left;
            }
            //e. else condition: return the current
            else{
                return current;
            }
        }
        return null;
    }

    public static void main(String[] args){

    }
}