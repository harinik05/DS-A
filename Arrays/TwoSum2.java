/*
 * LeetCode Question No: 1
 * Question: TwoSum
 * Solution Version: 2
 * Input: Array and target
 * Output: Array
 * Purpose: Return the array of indices that produces the sum given by the target
 * Time Complexity: uses O(n) because it goes through the length of the array to put everything into the hashmap
 * Space Complexity: uses O(n) due to the hashmap storing the n amount of elements
 * the logic is simply that we are using a hashtable and putting everything in Key = Value and Value = index
 * This is TWO PASS HASHTABLE METHOD
 */
package Arrays;

import java.util.HashMap;
import java.util.Map;

class TwoSum2 {
    public int[] twoSum(int[] nums, int target) {
        int[] returnArray = new int[2];
        //1. Create a simple hashtable
        Map<Integer,Integer> masterHT = new HashMap<>();
        //2. Place all of the elements inside a hashmap with key=value and value = index
        for(int i = 0;i<nums.length;i++){
            masterHT.put(nums[i],i);
        }
        //3. check if target-nums[i] is a key
        for(int j = 0;j<nums.length;j++){
            if(masterHT.containsKey(target-nums[j]) && masterHT.get(target-nums[j])!= j){
                returnArray[0] = j;
                returnArray[1] = masterHT.get(target-nums[j]);
            }
        }
        //3a. retrieve the value and return that
        return returnArray;
    }
}