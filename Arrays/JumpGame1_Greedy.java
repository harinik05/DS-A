class JumpGame1_Greedy {
    //this is the greedy solution done in O(n) time similar idea where goal gets moved
    public boolean canJump(int[] nums) {
        //1. store the last position
        int lastPosition = nums.length-1;

        //2. Loop from the last to first position
        for(int i = nums.length-1;i>=0;i--){
            //a. check the farthest jump
            int minJump = Math.min(i+nums[i], lastPosition);
            //b. if the minJump is the last position, reset it
            if(minJump == lastPosition){
                lastPosition = i;
            }
        }
        //3. check if the goal has reached the first one
        return lastPosition == 0;
    }
}
