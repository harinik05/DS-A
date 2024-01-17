package Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    //1. define the data structures
    private Set<Character> nonDuplicates;

    //2. constructor
    public LongestSubstring(){
        this.nonDuplicates = new HashSet<>();
    }

    //3. find the longest substring implement the method (length())
    public int findLongestSubstringLength(String s){
        //1. initialize the array storing all the chars
        char[] arr = s.toCharArray();

        //2. initialize the windows
        int leftWindow = 0;
        int rightWindow = 0;
        int output = 0;

        //3. loop through the right window
        for(;rightWindow<s.length();rightWindow++){
            //4. skip to adjust the window
            while(nonDuplicates.contains(arr[rightWindow])){
                nonDuplicates.remove(arr[leftWindow]);
                leftWindow++;
            }

            //5. keep on incrementing the right window
            nonDuplicates.add(arr[rightWindow]);

            //6. determine the output
            output = Math.max(output, nonDuplicates.size());
        }

        return output;
    }
    public static void main(String[] args){
        
    }
}
