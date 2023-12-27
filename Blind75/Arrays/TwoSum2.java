package Blind75.Arrays;

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