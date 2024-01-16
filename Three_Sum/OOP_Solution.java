package Three_Sum;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OOP_Solution {

    //1. define the corresponding data structures
    public Set<List<Integer>> results;
    public Map<Integer, Integer> mainMap;

    //2. Define a constructor
    public OOP_Solution(Set<List<Integer>> resultsIn, Map<Integer,Integer> mainMapIn){
        this.results = resultsIn;
        this.mainMap = mainMapIn;
    }

    //3. finding the three sum array
    public void returnListOfStuff(int[] nums){
        //a. loop through the outer part of the array
        for(int i = 0;i<nums.length;i++){
            //b. loop through the inner part of the array
            for(int j = i+1;j<nums.length;j++){
                //c. determine the complement
                int complement = -nums[i]-nums[j];
                //d. check if its in the hashmap
                if(mainMap.containsKey(complement) && mainMap.get(complement) == i){
                    //e. put it as a list (three elements)
                    Integer[] arr = {nums[i],nums[j],complement};
                    Arrays.sort(arr);
                    List<Integer> triplets = Arrays.asList(arr);

                    //f. put in the results
                    results.add(triplets);
                }

                //g. put this in the hashmap
                mainMap.put(nums[j],i);
            }
        }
    }

    //4. main method
    public static void main(String[] args){
        
    }
}
