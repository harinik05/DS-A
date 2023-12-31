package DP.FibonnaciStyle;

class Tribonacci_BF {
    public int tribonacci(int n) {
        //1. Take care of the base cases
        if(n<=1){
            return n;
        }

        if(n == 2){
            return 1;
        }
        

        //2. set up the other variables
        int first = 0;
        int second = 1;
        int third = 1;
        int fourth = 0;
        for (int i = 3;i<=n;i++ ){
            fourth = first+second+third;
            first = second;
            second = third;
            third = fourth;
        }
        return fourth;
    }
}