package DP.FibonnaciStyle;

public class Tribonnaci_DP {
    public int tribonacci(int n) {
        //base case
        if(n<=1){
            return n;
        }
        //1. create a 2 by 2 matrix to represent the transition for fibonacci
        int[][] transitionMatrix = {{1,1,1},{1,0,0},{0,1,0}};
        //2. Create the Q^n matrix
        int[][] qMatrix = pow(transitionMatrix,n-1);
        //3. Return the q(n-1) [0,0]
        return qMatrix[0][0];
    }

    public int[][] pow(int[][] a, int n){
        //1. create a ret matrix
        int[][] identity = {{1,0,0},{0,1,0},{0,0,1}};

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
        int[][] finalArr = new int[3][3];
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                for(int k = 0;k<3;k++)
                finalArr[i][j] += a[i][k] * b[k][j];
            }
        }
        return finalArr;
    }


}