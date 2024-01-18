package Search_in_Rotated_Sorted_Array;

public class SearchRotated {
    public static void main(String[] args){
        int[] nums = {5,6,7,1,2,4};
        int target = 2;
        //1. Define the left and right pointer
        int leftPointer = 0;
        int rightPointer = nums.length-1;
        int result = -1;

        //2. Base case
        if(nums.length == 0){
            result = -1;
        }
        if(nums.length == 1){
            result = (target == nums[0])?0:-1;
        }

        //3. while loop as long as left is less than right
        while (leftPointer < rightPointer){
            //4. define a midpoint
            int midpoint = (rightPointer+leftPointer)/2;

            //5. check base case with midpoint
            if(nums[midpoint] == target){
                result = midpoint;
            }
            //6. left sided condition
            else if(nums[midpoint] >= nums[leftPointer]){
                if(target < nums[leftPointer] || target > nums[midpoint]){
                    leftPointer = midpoint+1;
                }else{
                    rightPointer = midpoint-1;
                }
            }

            //7. right sided condition
            else{
                if(target>nums[rightPointer] || target<nums[midpoint]){
                    rightPointer = midpoint-1;
                }else{
                    leftPointer = midpoint+1;
                }
            }
        }
        result = -1;
    }
}
