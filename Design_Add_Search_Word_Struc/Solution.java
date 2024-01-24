package Design_Add_Search_Word_Struc;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
    // 1. public member variables
    public Map<Character, TrieNode> childrenMap;
    public boolean wordEndFlag;

    // 2. use a constructor for this
    public TrieNode() {
        this.childrenMap = new HashMap<>();
        this.wordEndFlag = false;
    }
}

class WordDictionary {

    // 1. define the public member variables
    public TrieNode root;

    public WordDictionary() {
        this.root = new TrieNode();
    }

    public void addWord(String word) {
        char[] wordArr = word.toCharArray();
        TrieNode current = root;

        // 1. check if the char exists
        // 2. add in the char as the children in children map
        for (char character : wordArr) {
            if (!current.childrenMap.containsKey(character)) {
                current.childrenMap.put(character, new TrieNode());
            }
            current = current.childrenMap.get(character);
        }
        current.wordEndFlag = true;
    }

    public boolean search(String word) {
        return searchRecursive(word, 0, root);
    }

    private boolean searchRecursive(String word, int index, TrieNode current) {
        if (index == word.length()) {
            return current.wordEndFlag;
        }

        char character = word.charAt(index);

        if (character == '.') {
            // Wildcard character, try all possible children
            for (TrieNode child : current.childrenMap.values()) {
                if (searchRecursive(word, index + 1, child)) {
                    return true;
                }
            }
            return false;
        } else {
            // Regular character, check if it exists in the childrenMap
            if (!current.childrenMap.containsKey(character)) {
                return false;
            }
            return searchRecursive(word, index + 1, current.childrenMap.get(character));
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such: WordDictionary obj = new WordDictionary();
 * obj.addWord(word); boolean param_2 = obj.search(word);
 */
