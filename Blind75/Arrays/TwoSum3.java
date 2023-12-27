package Blind75.Arrays;

import java.util.HashMap;
import java.util.Map;

class TwoSum3 {
    public int[] twoSum(int[] nums, int target) {
        //Quicker method (one pass Hashtable method)
        //1. Create a return array
        int[] returnArr = new int[2];
        //2. Create a hashtable
        Map<Integer, Integer> masterHash = new HashMap<Integer, Integer>();
        //3. Put everthing from the array into the hashtable
        for(int i = 0;i<nums.length;i++){
            //3a. Check if the complement sum exists
            int complement = target-nums[i];
            //3b. if it does, return the indices 
            if(masterHash.containsKey(complement) && masterHash.get(complement)!=i){
                returnArr[0] = i;
                returnArr[1] = masterHash.get(complement);
                
            }
            
            //3c. else keep placing it in the hashtable 
            else{
                masterHash.put(nums[i],i);
            }
        }
        return returnArr;
        
    }
}