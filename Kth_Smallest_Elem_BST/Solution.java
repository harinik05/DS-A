package Kth_Smallest_Elem_BST;

import java.util.ArrayList;
import java.util.List;

class Solution {
    //define a list to store the in order traversal result
    private List<Integer> arr;

    //define a constructor
    public Solution(){
        this.arr = new ArrayList<>();
    }

    //define a method to put everything from the root to the arr
    public void putEverythingInOrder(TreeNode inRoot){
        //1. take care of base case
        if(inRoot == null){
            return;
        }

        //2. left
        if(inRoot.left!=null){
            putEverythingInOrder(inRoot.left);
        }

        arr.add(inRoot.val);

        //3. right
        if(inRoot.right!=null){
            putEverythingInOrder(inRoot.right);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        this.putEverythingInOrder(root);
        return arr.get(k-1);
    }
}