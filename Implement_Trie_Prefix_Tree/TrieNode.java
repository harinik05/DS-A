package Implement_Trie_Prefix_Tree;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    //member variables
    public Map<Character, TrieNode> childrenMap;
    public boolean endOfWordFlag;

    //set up these values using a constructor
    public TrieNode(){
        this.childrenMap = new HashMap<>();
        this.endOfWordFlag  = false;
    }
    public static void main(String[] args){

    }
}
