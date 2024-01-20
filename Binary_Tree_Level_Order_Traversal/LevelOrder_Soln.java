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

    //3. 
    public static void main(String[] args){

    }
}
