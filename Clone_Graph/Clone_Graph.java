package Clone_Graph;

import java.util.HashMap;
import java.util.Map;

//approached through the breath first search method


public class Clone_Graph {
    //0. create the member variables - initialized for this purpose
    private Map<Node, Node> hm;

    //1. create a constructor
    public Clone_Graph(Map<Node, Node> HM){
        this.hm = HM;
    }

    //2. create the function
    public Node cloneGraph(Node node) {
        /*
        Using Depth First Search (DFS) as a sol to Deep Copy (node)
Create a hashmap that stores as original node: duplicate node
Base case: node = null -> return node
Check if the node is in the hashmap. If it is, return node
Else, create a clone node and place it in the hashmap
Iterate through the neighbors and put in the new cloned ones (recursively add neighbor). Then, returned the cloned node

        */

    
        //Base case: node = null -> return node
        if(node==null){
            return node;
        }

        //Check if the node is in the hashmap. If it is, return node
        if(hm.containsKey(node)){
            return hm.get(node);
        }

        //Else, create a clone node and place it in the hashmap
        Node cloneNode = new Node(node.value);
        hm.put(node,cloneNode);


        //Iterate through the neighbors and put in the new cloned ones (recursively add neighbor). Then, returned the cloned node
        for(Node neighbor: node.neighbors){
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }

        return cloneNode;




    }

    public static void main(String[] args){

    }
    
}
