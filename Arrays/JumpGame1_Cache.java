//1. Create a enum with all the flags - unvisited, good, bad
enum Flag{
    UNVISITED, GOAL, BAD
}

class JumpGame1_Cache {
    //cache solution
    public boolean canJump(int[] nums) {
        //1. Create a cache array
        Flag[] cacheArr =new Flag[nums.length];

        //2. Assign unvisited for everything so that no null
        for(int i = 0;i<cacheArr.length;i++){
            cacheArr[i] = Flag.UNVISITED;
        }

        //3. last index has to be the goal
        cacheArr[cacheArr.length-1] = Flag.GOAL;

        //4. loop from the prev to the last to first element
        for(int k = cacheArr.length-2;k>=0;k--){
            //a. determine the jump (smallest because we're closest to elem)
            int minJump = Math.min(k+nums[k],nums.length-1);
            //b. inner loop from k+1 to minJump (goal to minjump dist)
            for(int l = k+1;l<=minJump;l++){
                //c. check if the goal has been reached
                if(cacheArr[l] == Flag.GOAL){
                    cacheArr[k] = Flag.GOAL;
                    break;
                }
            }
        }

        //5. return if the first element becomes a GOAL
        return cacheArr[0] == Flag.GOAL;
    }
}
