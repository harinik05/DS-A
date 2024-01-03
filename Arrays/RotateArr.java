class RotateArr {
    //Using the reverse method to rotate the array
    /*
    if im rotating by k elements, then i have to move k elements 
    to to the front
    */
    public void rotate(int[] nums, int k) {
        //1. Determine the value of k 
        k = k % nums.length;

        //2. Revese the numbers
        /*
        IDEA: 
        - reverse all the numbers
        - reverse all numbers from o to k 
        - reverse all numbers n - k
        */
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1); 
    }

    private void reverse(int[] nums, int start, int end){
        while(start<end){
            //a. swap the start and end values in nums
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            //b. increment start and decrement end
            start++;
            end--;
        }
    }
}
