/*
 * LeetCode Question No: 1
 * Question: TwoSum
 * Solution Version: 1
 * Input: Array and target
 * Output: Array
 * Purpose: Return the array of indices that produces the sum given by the target
 * Time Complexity: uses O(n^2) because this goes through two arrays
 * Space Complexity: Uses O(1) because it doesn't depend on the size of input array
 */
package Top_150.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        /*
        Input: Array (nums), number
        Output: Indices of the number that add up to the target
        */
        //declare the output array
        int[] outputArr = new int[2];
        //current array to determine target
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    outputArr[0] = i;
                    outputArr[1] = j;
                }
            }
            
        }
        return outputArr;
    }
}