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

    //3. define the method to say if this is a valid expression for brackets
    public boolean determineValidExpression(String s){
        //1. create an array for storing the characters in the string
        char[] arr = s.toCharArray();

        //2. loop through this array
        for(int i=0;i<s.length();i++){
            //3. check if the closed bracket is there
            if(this.standardMap.containsKey(arr[i])){
                //4. retrieve the top elem and compare it with the value
                char topElem = openBrackets.empty()?'*':openBrackets.pop();
                if(this.standardMap.get(arr[i])!=topElem){
                    return false;
                }
            }
            //key not present
            else{
                openBrackets.add(arr[i]);
            }
        }

        //3. everything should be popped off if valid
        return openBrackets.isEmpty();
    }
    public static void main(String[] args){
        //1. create an obj
        StackSoln obj = new StackSoln();
        
        //2. Call the method to check the expression
        System.out.println(obj.determineValidExpression("{(}}})}"));

    }
}
