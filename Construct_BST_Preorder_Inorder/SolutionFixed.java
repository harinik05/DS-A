package Construct_BST_Preorder_Inorder;

import java.util.ArrayList;
import java.util.List;

public class SolutionFixed {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);
        int index = findIndex(inorder, preorder[0]);

        List<Integer> preorderLeft = new ArrayList<>();
        List<Integer> inorderLeft = new ArrayList<>();
        List<Integer> preorderRight = new ArrayList<>();
        List<Integer> inorderRight = new ArrayList<>();

        for (int i = 1; i < index + 1; i++) {
            preorderLeft.add(preorder[i]);
            inorderLeft.add(inorder[i - 1]);
        }

        for (int i = index + 1; i < preorder.length; i++) {
            preorderRight.add(preorder[i]);
            inorderRight.add(inorder[i]);
        }

        int[] preorderLeftArr = preorderLeft.stream().mapToInt(Integer::intValue).toArray();
        int[] inorderLeftArr = inorderLeft.stream().mapToInt(Integer::intValue).toArray();
        int[] preorderRightArr = preorderRight.stream().mapToInt(Integer::intValue).toArray();
        int[] inorderRightArr = inorderRight.stream().mapToInt(Integer::intValue).toArray();

        TreeNode left = buildTree(preorderLeftArr, inorderLeftArr);
        TreeNode right = buildTree(preorderRightArr, inorderRightArr);

        root.left = left;
        root.right = right;

        return root;
    }

    private int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Handle error (not found)
    }
}
