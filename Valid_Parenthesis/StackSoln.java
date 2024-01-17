package Valid_Parenthesis;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackSoln {
    //1. define the data structures 
    private Map<Character, Character> standardMap;
    private Stack<Character> openBrackets;
    
    //2. Define a constructor for this
    public StackSoln(){
        this.standardMap = new HashMap<>();
        this.openBrackets = new Stack<>();

        //put all the convention parenthesis stuff inside the hashmap
        this.standardMap.put(')','(');
        this.standardMap.put('}','{');
        this.standardMap.put(']','[');
    }
    public static void main(String[] args){

    }
}
