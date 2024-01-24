package Implement_Trie_Prefix_Tree;

import java.util.*;

// TrieNode class
class TrieNode {
    public Map<Character, TrieNode> childrenMap;
    public boolean endOfWordFlag;

    public TrieNode() {
        this.childrenMap = new HashMap<>();
        this.endOfWordFlag = false;
    }
}

// Trie class
class Trie {

    // member variables
    public TrieNode root;

    // constructor
    public Trie() {
        this.root = new TrieNode();
    }

    // insert function
    public void insert(String word) {
        TrieNode current = root;

        // put the array into a character array
        char[] arr = word.toCharArray();

        // for every character in the word, check if it's in the hashmap
        for (char charac : arr) {
            // if it's not in the hashmap, put it in
            if (!current.childrenMap.containsKey(charac)) {
                current.childrenMap.put(charac, new TrieNode());
            }

            // move to the next node
            current = current.childrenMap.get(charac);
        }

        // at the end of the word, make sure to set the endOfWordFlag
        current.endOfWordFlag = true;
    }

    public boolean search(String word) {
        TrieNode current = root;

        // put the array into character array
        char[] arr = word.toCharArray();

        // check for every character, if not found, return false
        for (char charac : arr) {
            if (!current.childrenMap.containsKey(charac)) {
                return false;
            }

            // move to the next node
            current = current.childrenMap.get(charac);
        }

        // return true outside the loop if the endOfWordFlag is set
        return current.endOfWordFlag;
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;

        // put the array into character array
        char[] arr = prefix.toCharArray();

        // check for every character, if not found, return false
        for (char charac : arr) {
            if (!current.childrenMap.containsKey(charac)) {
                return false;
            }

            // move to the next node
            current = current.childrenMap.get(charac);
        }

        // return true outside the loop
        return true;
    }
}
