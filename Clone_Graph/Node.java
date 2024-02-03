package Clone_Graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
    //1. define the public member variables
    public int value;
    public List<Node> neighbors;

    //2.  constructor (empty)
    public Node(){
        this.value = 0;
        this.neighbors = new ArrayList<>();
    }

    //2. constructor (value only)
    public Node(int value){
        this.value = value;
        this.neighbors = new ArrayList<>();
    }
}
