package FibonnaciStyle;

class HouseRobber {
    public int rob(int[] nums) {
        //1. set up the base case and n 
        int n = nums.length;
        if (n== 1){
            return nums[0];
        }
        if (n == 2){
            return Math.max(nums[0], nums[1]);
        }

        //2. set up the base values
        int firstVal = nums[0];
        int secondVal = Math.max(nums[0], nums[1]);
        int thirdVal = 0;
        for(int i = 2;i<n;i++){
            thirdVal = Math.max(firstVal + nums[i], secondVal);
            firstVal = secondVal;
            secondVal = thirdVal;
        }

        return thirdVal;
    }
}
