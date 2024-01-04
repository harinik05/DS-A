class JumpGame2_BFSGreedy {
    //this solution is a greedy approach - done with modified version of 
    public int jump(int[] nums) {
        //1. determine the value of n 
        int n = nums.length;
        int maxFinishIndex = 0;
        int levels = 0;
        int curFinishIndex = 0;

        //2. loop through the entire array from the first to last -1
        for(int i = 0;i<=n-2;i++){
            //a. check the maximum finishing index
            maxFinishIndex = Math.max(i + nums[i], maxFinishIndex);

            //b. Add levels once its finished
            if(i == curFinishIndex){
                levels++;
                curFinishIndex = maxFinishIndex;
            }
        }

        //3. return the levels
        return levels;
    }
}
