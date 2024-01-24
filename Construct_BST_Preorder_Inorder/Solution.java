package Construct_BST_Preorder_Inorder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder){

        //1. take care of the base case
        if(preorder.length == 0 || inorder.length == 0){
            return null;
        }

        //2. first element is the  root
        TreeNode root = new TreeNode(preorder[0]);
        int index = Arrays.asList(inorder).indexOf(preorder[0]);

        //3. preprocess for left and right
       List<Integer> preorderLeft = new ArrayList<>();
       List<Integer> inorderLeft = new ArrayList<>();
       List<Integer> preorderRight = new ArrayList<>();
       List<Integer> inorderRight = new ArrayList<>();

       //4, loop through each of these lists and add the elements necessary
       for(int i = 1;i<index+1;i++){
        preorderLeft.add(preorder[i]);
       }

       for(int j = 0;j<index;j++){
        inorderLeft.add(inorder[j]);
       }

       for(int k = index+1;k<preorder.length;k++){
        preorderRight.add(preorder[k]);
       }

       for(int l = index+1;l<inorder.length;l++){
        inorderRight.add(inorder[l]);
       }

       Integer[] preorderLeftArr = new Integer[preorderLeft.size()];
       Integer[] inorderLeftArr = new Integer[inorderLeft.size()];
       Integer[] preorderRightArr = new Integer[preorderRight.size()];
       Integer[] inorderRightArr = new Integer[inorderRight.size()];
        //4. control left and right
        preorderLeft.toArray(preorderLeftArr);
        inorderLeft.toArray(inorderLeftArr);
        preorderRight.toArray(preorderRightArr);
        inorderRight.toArray(inorderRightArr);

        //5. save it as accepted arrat
       int[] preorderLeftAccepted = new int[preorderLeftArr.length];
       int[] inorderLeftAccepted = new int[inorderRightArr.length];
       int[] preorderRightAccepted = new int[preorderRightArr.length];
       int[] inorderRightAccepted = new int[inorderRightArr.length];

       for (int num1=0;num1<preorderLeftArr.length;num1++){
        preorderLeftAccepted[num1] = preorderLeftArr[num1].intValue();
       }
       for (int num2=0;num2<inorderLeftArr.length;num2++){
        inorderLeftAccepted[num2] = inorderLeftArr[num2].intValue();
       }

       for (int num3=0;num3<preorderRightArr.length;num3++){
        preorderRightAccepted[num3] = preorderRightArr[num3].intValue();
       }

       for (int num4=0;num4<inorderRightArr.length;num4++){
        inorderRightAccepted[num4] = inorderRightArr[num4].intValue();
       }

        TreeNode left = buildTree(preorderLeftAccepted, inorderLeftAccepted);
        TreeNode right = buildTree(preorderRightAccepted, inorderRightAccepted);

        //5. set to the root
        root.left = left;
        root.right = right;
        return root;


    }
    public static void main(String[] args){

    }
}
