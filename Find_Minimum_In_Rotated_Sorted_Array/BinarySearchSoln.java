package Find_Minimum_In_Rotated_Sorted_Array;

public class BinarySearchSoln {
    //1. initialize the pointers and final result
    private int leftPointer;
    private int rightPointer;
    private int outputNum;

    //2. Constructor
    public BinarySearchSoln(int[] nums){
        this.leftPointer = 0;
        this.rightPointer = nums.length-1;
        this.outputNum = 0;
    }

    //3. function to return the min
    public int returnMin(int[] nums){
        //base case
        if(nums.length == 0){
            return -1;
        }
        if(nums.length == 1){
            return nums[0];
        }
        while(leftPointer < rightPointer){
            //define the midpoint
            int midpoint = (leftPointer+rightPointer)/2;

            //check if the min is in the midpoint
            if(midpoint>0 && nums[midpoint] > nums[midpoint-1]){
                return nums[midpoint];
            }

            //left sided condition
            else if(nums[midpoint]>=nums[leftPointer] && nums[midpoint]>nums[rightPointer]){
                leftPointer = midpoint+1; //focus more on the right side
            }
            //right sided condition
            else{
                rightPointer = midpoint-1; //focus more on the left side
            }


        }
        //assuming that left will always be the least and smallest
        return nums[leftPointer];
    }

    public static void main(String[] args){
        int[] nums = {7,8,9,1,2,5};

    }
}
