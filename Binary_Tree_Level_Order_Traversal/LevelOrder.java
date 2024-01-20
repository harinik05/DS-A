package Binary_Tree_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class LevelOrder {

    //1. in level = LNR
    public List<List<Integer>> levelOrder(TreeNode root){
        //a. store your results
        List<List<Integer>> resultsArr = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        //b. base case
        if(root == null){
            return resultsArr;
        }

        queue.add(root); 
        int levelCounter = 0;

        while(!queue.isEmpty()){
            //a. define a currrent level
            resultsArr.add(new ArrayList<>());
            int levelLength = queue.size();

            for(int i = 0;i<queue.size();i++){
                TreeNode nodeToRemove =  queue.remove();
                resultsArr.get(levelCounter).add(nodeToRemove.val);
                
                //add things to the queue
                if(nodeToRemove.left != null){
                    queue.add(nodeToRemove.left);
                }

                if(nodeToRemove.right!= null){
                    queue.add(nodeToRemove.right);
                }
            }
            levelCounter++;
        }

        return resultsArr;

    }
    public static void main(String[] args){

    }
}
