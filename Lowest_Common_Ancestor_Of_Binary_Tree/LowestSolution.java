//package Lowest_Common_Ancestor_Of_Binary_Tree;

//import javax.swing.tree.TreeNode;


class LowestSolution {
    //1. data structure
    private TreeNode root;

    //2. constructor
    public LowestSolution(TreeNode inRoot){
        this.root = inRoot;
    }
    
    //3. lowest common ancestor function
    public TreeNode lowestCommonAncestor(TreeNode p, TreeNode q) {
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
        //1. Create the tree that I need to put into this
        TreeNode inRoot = TreeNode.createSampleTree();

        //2. create an obj
        LowestSolution obj = new LowestSolution(inRoot);

        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(8);
        //3. call the method
        TreeNode returnedOutput = obj.lowestCommonAncestor(node1, node1);

        //4. print out the value of the root
        System.out.println(obj.root);
        //5. in order traversal of the retuened output
        System.out.println("_________________");
        System.out.println("IN ORDER TRAVERSAL");
        obj.root.inOrderTraversal();
        
    



        System.out.println("______");
        System.out.println(returnedOutput.returnData());
        System.out.println("IN ORDER TRAVERSAL");
        
    }
}