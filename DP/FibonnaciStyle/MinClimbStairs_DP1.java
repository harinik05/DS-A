package DP.FibonnaciStyle;

public class MinClimbStairs_DP1 {
    public int minCostClimbingStairs(int[] cost) {
        //1. set up the base cases
        int length = cost.length;
        if(length==1){
            return 0;
        }

        //2. create the first second and third
        int first = 0;
        int second = 0;
        int third = 0;

        for(int i = 2;i<=length;i++){
            //set up the third
            third = Math.min(cost[i-1] + second, cost[i-2]+ first);
            first = second;
            second = third;
        }
        return third;
    }
}