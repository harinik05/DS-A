package FibonnaciStyle;


class ClimbStairs_BF {
    public int climbStairs(int n) {
        /*
        DESCRIPTION:
        - n steps to reach the top so it will require 1 or 2 steps
        - Each time i can climb up 1 or 2 steps
        - How many distinct ways can I climb to the top?
        - Understand: n = 2 1+1 or 2
        - n = 3: 1+2 1+1+1 2+1 basically i want different combinations of 1 and 2 so that i can reach the number
        */

      //Method 1: Brute Force
      /*
      IDEA: 
      Take all possible step combinations. Call a helper function per step and return the sum of both functions
      i = current
      n = destination
      */  
      //Base Case: 
      return helperClimbStairs(0,n);
    }

    public int helperClimbStairs(int i , int n){
        //base case: i has to be less than n
        if (i>n){
            return 0;
        }
        if(i == n){
            return 1;
        }
        //sum all the possibilities of taking 1 step and 2 steps for that current step
        return helperClimbStairs(i+1, n) + helperClimbStairs(i+2, n);
    }
}

