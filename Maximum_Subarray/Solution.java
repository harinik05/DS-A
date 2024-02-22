class Solution {
    public int maxSubArray(int[] nums) {
        //1. initialize the values
        int maxNum = nums[0];
        int currentSum = 0;

        //2. loop through everything in the nums array 
        for(int number: nums){
            //3. check the current sum and see if its less than 0
            if(currentSum < 0){
                currentSum = 0;
            }

            //4. add this with the number
            currentSum+=number;
            //5. determine the total
            maxNum = Math.max(currentSum, maxNum);
        }

        return maxNum;
    }
}