/*
 * LeetCode Question No: 88
 * Question: Merge Sorted Array
 * Solution Version: 1
 * Input: 2 Arrays and 2 numbers
 * Output: Array
 * Purpose: Return the array of indices that produces the sum given by the target
 * Time Complexity: uses O(n^2) because this goes through two arrays
 * Space Complexity: Uses O(1) because it doesn't depend on the size of input array
 */

package Arrays;

import java.util.Arrays;

class MergeSortedArr {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       //put the elemets from the second array into the end of first one
        for(int i = 0;i<n;i++){
            nums1[i+m] = nums2[i];
        }
       //sort the array
       Arrays.sort(nums1);
      
    }
}
