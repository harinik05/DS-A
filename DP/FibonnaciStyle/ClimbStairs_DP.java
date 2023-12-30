package DP.FibonnaciStyle;

class ClimbStairs_DP {
    //this is dp solution
    public int climbStairs(int n) {
        //1. take care of the base case
        if(n == 1){
            return 1;
        }
        //2. Create the dp array 
        int[] dpArr = new int[n+1];
        dpArr[1] = 1;
        dpArr[2] = 2;

        //3. iterate through the array from element 3 and calculate the sum
        for(int i = 3;i<=n;i++){
            dpArr[i] = dpArr[i-1] +dpArr[i-2];
        }
        return dpArr[n];
    }
}