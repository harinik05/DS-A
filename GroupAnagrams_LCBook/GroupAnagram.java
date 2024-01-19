//package GroupAnagrams_LCBook;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupAnagram {

    // 1. Create the required data structures necessary
    private Map<Character, Integer>[] hm;
    private String[] arr;

    // 2. Constructor
    public GroupAnagram(String[] inArr) {
        this.hm = new HashMap[inArr.length];
        this.arr = inArr;
        for (int i = 0; i < inArr.length; i++) {
            hm[i] = new HashMap<>();
        }
    }

    // 3. method to determine a hashmap for a word
    public void returnHM(String s, int index) {
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            hm[index].put(c, hm[index].getOrDefault(c, 0) + 1);
        }
    }

    // 4. put it together in the loop
    public String[] sortedArr(String[] inArr) {
        // 1. define the output array
        String[] outputArr = new String[inArr.length];
        int counter = 0;

        // 2. for loop
        for (int i = 0; i < inArr.length; i++) {
            returnHM(inArr[i], i);
        }

        // 3. for loop again
        for (int j = 0; j < inArr.length; j++) {
            if (outputArr[j] == null) {
                outputArr[counter++] = inArr[j];
                for (int k = j + 1; k < inArr.length; k++) {
                    if (outputArr[k] == null && hm[j].equals(hm[k])) {
                        outputArr[counter++] = inArr[k];
                    }
                }
            }
        }

        // 4. Resize outputArr if needed
        return Arrays.copyOf(outputArr, counter);
    }

    // 5. loop through the entire array and call point 3) each time
    public static void main(String[] args) {
        String[] inputArray = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagram groupAnagram = new GroupAnagram(inputArray);
        String[] result = groupAnagram.sortedArr(inputArray);

        // Print the result
        for (String str : result) {
            System.out.println(str);
        }
    }
}
