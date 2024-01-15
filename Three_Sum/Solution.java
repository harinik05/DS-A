package Three_Sum;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //1. Initialize the data structures (O(n) space complexity)
        Set<Integer> duplicates = new HashSet<>();
        Set<List<Integer>> results = new HashSet<>();
        Map<Integer, Integer> hashmap = new HashMap<>();

        //2. Loop through the length of the array
        for(int i = 0;i<nums.length;i++){
            //a. check if the nums can be added in (not a duplicate)
            if(duplicates.add(nums[i])){
                //b. for loop for j (i +1)
                for(int j = i+1;j<nums.length;j++){
                    //c. returun the complement
                    int complement = -nums[i]-nums[j];
                    //d. does the hashmap have it
                    if(hashmap.containsKey(complement) && hashmap.get(complement) == i){
                        List<Integer> tripletDet = Arrays.asList(nums[i], nums[j], complement);
                        Collections.sort(tripletDet);
                        results.add(tripletDet);
                    }

                    //e. add values to the hashmap
                    hashmap.put(nums[j],i);
                }

            }
        }
        //3. convert from set to array list 
        List<List<Integer>> output = new ArrayList<>(results);
        return output;


    }
}
