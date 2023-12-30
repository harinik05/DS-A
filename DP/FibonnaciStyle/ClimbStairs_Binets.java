package DP.FibonnaciStyle;


    public class ClimbStairs_Binets {
    public int climbStairs(int n) {
        //1. create a 2 by 2 matrix to represent the transition for fibonacci
        int[][] transitionMatrix = {{1,1},{1,0}};
        //2. Create the Q^n matrix
        int[][] qMatrix = pow(transitionMatrix,n);
        //3. Return the q(n-1) [0,0]
        return qMatrix[0][0];
    }

    public int[][] pow(int[][] a, int n){
        //1. create a ret matrix
        int[][] identity = {{1,0},{0,1}};

        //2. While loop as long as the exponent is greater than 0
        while (n>0){
            //a. check if thye exponent is odd
            if(n%2!=0){
                //multiply by the ransition matrix
                identity = multiply(identity,a);
            }
            //b. divide the exponent by 2
            n/=2;
            //c. square the trans matrixx 
            a = multiply(a,a);
        }
        return identity;

    }

    public int[][] multiply(int[][] a, int [][] b){
        int[][] finalArr = new int[2][2];
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                finalArr[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
            }
        }
        return finalArr;
    }


}

