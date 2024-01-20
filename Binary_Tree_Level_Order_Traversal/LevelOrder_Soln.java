package Binary_Tree_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class LevelOrder_Soln {

    //1. define the required data structures
    private List<List<Integer>> outputResult;
    private Queue<TreeNode> queue;

    //2. constructor
    public LevelOrder_Soln(){
        this.outputResult = new ArrayList<List<Integer>>();
        this.queue = new LinkedList<>();
    }

    //3. method to return the final result organized by levels
    public List<List<Integer>> returnFinalResult(TreeNode root){
        //1. Check the base condition
        if(root == null){
            return outputResult;
        }

        //2. put the root inside the queue
        queue.add(root);
        int currentLevel = 0;
        //3. while loop for the queue
        while(queue!=null){
            //4. initialize the linked list
            outputResult.add(new ArrayList<>());

            //5. step into current level 
            
            for(int i = 0;i<queue.size();i++){
                //6. remove the element from the top 
                TreeNode topElem = queue.remove();
                outputResult.get(currentLevel).add(topElem.val);

                //7. non null values for left
                if(root.left!= null){
                    queue.add(root.left);
                }
                if(root.right!=null){
                    queue.add(root.right);
                }
            }
            currentLevel++;
        }

        //return some queue
        return outputResult;
    }
    public static void main(String[] args){

    }
}
