//package Lowest_Common_Ancestor_Of_Binary_Tree;

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

    //traversing a tree (in order = LNR)
    public void inOrderTraversal(){
        //1. check left
        if(left!=null){
            left.inOrderTraversal();
        }

        //2. node
        System.out.println(data);

        //3. check right
        if(right != null){
            right.inOrderTraversal();
        }

    }

    //traversing a tree (pre-order = NLR)
    public void preOrderTraversal(){
        //1. node
        System.out.println(data);

        //2. check left
        if(left != null){
            left.preOrderTraversal();
        }

        //3. check right
        if(right!=null){
            right.preOrderTraversal();
        }
    }

    //traversing a tree (post-order = LRN)
    public void postOrderTraversal(){
        //1. left node
        if(left!=null){
            left.postOrderTraversal();
        }

        //2. right node
        if(right!=null){
            right.postOrderTraversal();
        }

        //3. node
        System.out.println(data);
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